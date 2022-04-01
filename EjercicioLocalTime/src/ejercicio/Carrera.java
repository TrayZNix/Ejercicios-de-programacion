package ejercicio;

import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
import java.util.*;

public class Carrera {
	
	private String nombre;
	private double distancia;
	private Map<Piloto, LocalTime> clasificacion;
	
	public Carrera(String nombre, double distancia, Map<Piloto, LocalTime> clasificacion) {
		this.nombre = nombre;
		this.distancia = distancia;
		this.clasificacion = clasificacion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getDistancia() {
		return distancia;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public Map<Piloto, LocalTime> getClasificacion() {
		return clasificacion;
	}
	
	public void setClasificacion(Map<Piloto, LocalTime> clasificacion) {
		this.clasificacion = clasificacion;
	}
	
	@Override
	public String toString() {
		return "Carrera [nombre=" + nombre + ", distancia=" + distancia + ", clasificacion=" + clasificacion + "]";
	}
	
	public LocalTime generarTiempoAleatorios() {
		
		Random r = new Random(System.nanoTime());
		int secMin = 30, secMax = 33, nanoMin = 0, nanoMax = 999999999;
		int resulSec = 0, resulNano = 0, hora = 0, min = 1;
		
		resulSec = r.nextInt(secMax - secMin + 1) + secMin;
		resulNano = r.nextInt(nanoMax - nanoMin + 1) + nanoMin;
		
		return LocalTime.of(hora, min, resulSec, resulNano);
	}
	
	public void agregarPiloto(Piloto p, LocalTime tiempo) {
		clasificacion.put(p, tiempo);
	}
	
	public Piloto buscarPilotoPorNumero(int numPiloto) {
		
		Piloto tmp = null;
		boolean encontrado = false;
		Iterator<Piloto> it = clasificacion.keySet().iterator();
		
		while(it.hasNext() && !encontrado) {
			tmp = it.next();
			if(tmp.getNumPiloto() == numPiloto) {
				encontrado = true;
			}
		}
		
		if(!encontrado) {
			tmp = null;
		}
		
		return tmp;
		
	}
	
	public void penalizarPiloto(int numPiloto, long segundos) {
		
		Piloto p = buscarPilotoPorNumero(numPiloto);
		LocalTime penalizacion;
		
		if(p != null) {
			penalizacion = clasificacion.get(p).plusSeconds(segundos);
			clasificacion.put(p, penalizacion);
		}
		
	}
	
	public void ayudarPiloto(int numPiloto, long segundos) {
		
		Piloto p = buscarPilotoPorNumero(numPiloto);
		LocalTime ayuda;
		
		if(p != null) {
			ayuda = clasificacion.get(p).minusSeconds(segundos);
			clasificacion.put(p, ayuda);
		}
	}
	
	public long calcularIntervaloDeTiempo(int numPiloto1, int numPiloto2) {
		
		Piloto p1 = buscarPilotoPorNumero(numPiloto1);
		Piloto p2 = buscarPilotoPorNumero(numPiloto2);
		long resul = -1;
		
		if(p1 != null && p2 != null) {
			resul = clasificacion.get(p1).until(clasificacion.get(p2), ChronoUnit.MILLIS);
		}
		return resul;
	}
	
	public void ordenarPorTiempo() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("m:s:SSS");
		
		clasificacion.entrySet().stream().sorted(Map.Entry.<Piloto, LocalTime>comparingByValue())
		.forEach(x -> System.out.println("\n" + x.getKey().toString() + " Tiempo: " + x.getValue().format(formato)));
	}
	
	public void modificarSegundoVuelta(int numPiloto, int minutos, int segundo, int nanosegundos) {
		
		Piloto p = buscarPilotoPorNumero(numPiloto);
		LocalTime tiempoNuevo;
		
		if(p != null) {
			tiempoNuevo = clasificacion.get(p).withMinute(minutos).withSecond(segundo).withNano(nanosegundos);
			clasificacion.put(p, tiempoNuevo);
		}
	}
	
	public Map<Piloto, LocalTime> buscarPilotoMasLento() {
		Map<Piloto, LocalTime> aux = new HashMap<Piloto, LocalTime>();
		LocalTime tiempoAux = LocalTime.of(0, 0, 0, 0);
		
		for(Piloto piloto : clasificacion.keySet()) {
			if(clasificacion.get(piloto) == tiempoAux) {
				aux.put(piloto, tiempoAux);
			}else if(clasificacion.get(piloto).isAfter(tiempoAux)) {
				tiempoAux = clasificacion.get(piloto);
				aux.clear();
				aux.put(piloto, tiempoAux);
			}
		}
		return aux;
	}
	
	public void imprimirPilotoMasLento() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("m:s:SSS");
		
		for (Piloto piloto : buscarPilotoMasLento().keySet()) {
			System.out.println("\n" + piloto + " Tiempo: " + buscarPilotoMasLento().get(piloto).format(formato));
		}
	}
	
	public Piloto compararVelocidadEntreDosPilotos(int numPiloto1, int numPiloto2) {
		
		Piloto p1 = buscarPilotoPorNumero(numPiloto1);
		Piloto p2 = buscarPilotoPorNumero(numPiloto2);
		Piloto resultado = null;
		
		if(clasificacion.get(p1).isBefore(clasificacion.get(p2))) {
			resultado = p1;
		}else {
			resultado = p2;
		}
		return resultado;
	}
	
	public int calcularNanoSegundosDeUnPiloto(int numPiloto) {
		
		Piloto p = buscarPilotoPorNumero(numPiloto);
		int nanosegundos=0;
		
		if(p.getNumPiloto() == numPiloto) {
			nanosegundos = clasificacion.get(p).getNano();
		}
		return nanosegundos;
	}
	
	public String truncarTiempoDeVuelta(int numPiloto) {
		
		Piloto p = buscarPilotoPorNumero(numPiloto);
		String tiempoTruncado;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("m:s:SSS");
		
		tiempoTruncado = clasificacion.get(p).truncatedTo(ChronoUnit.SECONDS).format(formato);
		
		return tiempoTruncado;
	}
	
	public void ordenarListaPilotos() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("m:s:SSS");
		
		for (Piloto piloto : clasificacion.keySet()) {
			System.out.println("\n" + piloto + " Tiempo: " + clasificacion.get(piloto).format(formato));
		}
	}
	
	public void mostrarUnPiloto(int numPiloto) {
		Piloto p = buscarPilotoPorNumero(numPiloto);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("m:s:SSS");
		
		if(p != null) {
			System.out.println("\n" + p + " Tiempo: " + clasificacion.get(p).format(formato));
		}else {
			System.out.println("\nEl número introducido no concuerda con el de ningún piloto.");
		}
	}
	
}