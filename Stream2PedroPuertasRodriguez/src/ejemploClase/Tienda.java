package ejemploClase;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tienda {

	private List <Videojuego> lista;

	public Tienda(List<Videojuego> lista) {
		super();
		this.lista = lista;
	}

	public List<Videojuego> getLista() {
		return lista;
	}

	public void setLista(List<Videojuego> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Tienda [lista=" + lista + "]";
	}
	
	public void ordenarNormal() {
		Collections.sort(lista);
	}
	
	/*
	 * Este método realiza una búsqueda en la lista y compara cada uno de los elementos
	 * que no nosotros digamos para devolvernos la duración de menor valor
	 */
	
	public Videojuego buscarMenorDuracion() {
		return lista
				.stream()
				/*
				 * Con el método min encontramos la duración de menor valor, gracias también
				 * a la clase Comparator
				 */
				.min(Comparator.comparingInt(Videojuego::getDuracion))
				.get();
	}
	
	/*
	 * Este método realiza una búsqueda en la lista y compara cada uno de los elementos
	 * que no nosotros digamos para devolvernos la duración de más valor
	 */
	
	public Videojuego buscarMayorDuracion() {
		return lista
				.stream()
				/*
				 * Gracias al método max() podemos lograr encontrar el mayor y 
				 * con la clase Comparator podremos comparar la duración de los juegos como int
				 */
				.max(Comparator.comparingInt(Videojuego::getDuracion))
				.get();
	}
	
	/*
	 * Este método recoge las categorias de la lista de videojuegos y las incluye en una nueva lista
	 * de tipo String.
	 */
	public List <String> sacarCategorias() {
		
		List<String> listaCategoria = lista
				.stream()
				/*
				 * Primero indicamos que parámetro es el que queremos tener en la lista con .map,
				 * esto lo que hace es crear una "lista virtual" (Stream) de dicho parámetro
				 */
                .map(Videojuego::getCategoria)
                //Con el distinct() haremos que los datos no se repitan
                .distinct()
                /*
                 * Gracias a collect podremos trasladar nuestro Stream a List, para ello usaremos la clase Collectors
                 * y le indicaremos a que queremos convertirlo, en este caso toList()
                 */
                .collect(Collectors.toList());
		
		return listaCategoria;
		
	}
	
	/*
	 * Este método hace lo mismo que sacarCategorias(), gracias a él sacaremos de la lista una nueva lista de
	 * plataformas de tipo String.
	 */
	
	public List <String> sacarPlataformas(){
		
		List <String> listaPlataforma = lista
				.stream()
				.map(Videojuego::getPlataforma)
				.distinct()
				.collect(Collectors.toList());
		
		return listaPlataforma;
		
	}
	
	/*
	 * Este método realiza una "lista virtual" de variables tipo int de la duración de cada elemento de la lista
	 * principal y suma su contenido a través del método sum(). Devuelve el int con el resultado
	 */
	
	public int sacarDuracionTotal() {
		return lista
				.stream()
				//Gracias a mapToInt podemos sacar la duración de cada elemento de la lista (indicando el parámetro que queremos sacar)
				.mapToInt(Videojuego::getDuracion)
				//Con este método sumaremos toda la lista virtual
				.sum();
	}
	
	/*
	 * Este método devuelve true o false dependiendo de si se cumple la condición del allMatch(), la cual en este 
	 * caso consiste en que la calificación de cada uno de los elementos de la lista sea > 5
	 */
	
	public Boolean comprobarCalificacion(){
		return lista
				.stream()
				/*
				 * Con allMatch ponemos una condición para que devuelva true o false dependiendo de si se cumple o no esta.
				 * En este caso gracias a una función lambda, la cual indica que el número que se coge sea > 5 podemos realizar
				 * esta operación
				 */
				.allMatch(n -> n.getCalificacion() > 5);
	}
	
	/*
	 * Este método devuelve true o false dependiendo de si algún objeto de la lista cumple la condición que hay en la
	 * expresión lambda, en este caso que la calificación del juego sea mayor que 9.5
	 */
	
	public Boolean comprobarCalificacionNueve() {
		return lista
				.stream()
				//Con el anyMatch debemos realizar la misma operación que con allMatch, una expresión lambda que ponga una condición
				.anyMatch(n -> n.getCalificacion() > 9.5);
	}
	
	
	//Con este método mostraremos la lista gracias al método forEach y una condición lambda.
	
	public void mostrarLista() {
		lista.stream().forEach((n) ->{
			System.out.println("Nombre: "+n.getNombre());
			System.out.println("Categoria: "+n.getCategoria());
			System.out.println("Fecha de salida: "+n.getFechaSalida());
			System.out.println("Plataforma: "+n.getPlataforma());
			System.out.println("Duración: "+n.getDuracion() + " minutos");
			System.out.println("Calificación: "+n.getCalificacion() + "\n");
		});
	}
	
}
