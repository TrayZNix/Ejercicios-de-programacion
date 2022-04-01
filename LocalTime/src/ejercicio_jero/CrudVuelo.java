package ejercicio_jero;

import java.time.Duration;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;

public class CrudVuelo {
	
	//ATRIBUTOS
	
	private Map <Vuelo,Avion> itinerarios;
	
	//CONSTRUCTORES

	public CrudVuelo(Map<Vuelo,Avion> itinerarios) {
		super();
		this.itinerarios = itinerarios;
	}

	//GETTERS & SETTERS
	
	public Map<Vuelo,Avion> getItinerarios() {
		return itinerarios;
	}

	public void setItinerario(Map<Vuelo,Avion> itinerarios) {
		this.itinerarios = itinerarios;
	}

	//TO STRING
	
	@Override
	public String toString() {
		return "CrudVuelo [itinerario=" + itinerarios + "]";
	}

	//HASHCODE & EQUALS
	
	@Override
	public int hashCode() {
		return Objects.hash(itinerarios);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CrudVuelo other = (CrudVuelo) obj;
		return Objects.equals(itinerarios, other.itinerarios);
	}
	
	//METODOS
	
	public void agregarVuelo(Vuelo vuelo, Avion avion) {
		
		itinerarios.put(vuelo, avion);
		
	}
	
	public void modificarVuelo(int vueloID, Vuelo vuelo) {
		
		buscarVueloID(vueloID).setAvion(vuelo.getAvion());
		buscarVueloID(vueloID).setOrigen(vuelo.getOrigen());
		buscarVueloID(vueloID).setSalida(vuelo.getSalida());
		buscarVueloID(vueloID).setDestino(vuelo.getDestino());
		buscarVueloID(vueloID).setLlegada(vuelo.getLlegada());
		buscarVueloID(vueloID).setNumPasajeros(vuelo.getNumPasajeros());
		
	}
	
	
	public void eliminarVuelo(int vueloID) {
		
		itinerarios.remove(buscarVueloID(vueloID));
		
	}
	
//	public Map <Vuelo,Avion> buscarVuelosAvionID(int avionID){
//		
//		Map <Vuelo,Avion> aux = null;
//		
//		for (Map.Entry<Vuelo, Avion> entry : itinerarios.entrySet()) {
//			
//			if(entry.getValue().getAvionID()==avionID)
//				aux.put(entry.getKey(),entry.getValue());
//			
//		}
//		
//		return aux;
//		
//	}
	
	public Vuelo buscarVueloID(int vueloID) {
		
		Iterator <Vuelo> it = itinerarios.keySet().iterator();
		Vuelo vuelo=null;
		boolean salir=false;
		
		while(it.hasNext() && !salir) {
			vuelo=it.next();
			if(vuelo.getVueloID()==vueloID)
				salir=true;
			else 
				vuelo=null;
		}
		
		return vuelo; 
		
	}
	
	public double calcularDistancia(Vuelo vuelo) {
		
		Duration duracion = Duration.between(vuelo.getSalida(),vuelo.getLlegada());
		
		return (duracion.getSeconds()/3600*vuelo.getAvion().getVelocidadMedia());
		
	}
	
	public double calcularCombustibleConsumido(Vuelo vuelo) {
		
		return ((calcularDistancia(vuelo)/100) * vuelo.getAvion().getConsumo100km());
	}
	
	public void compararSalidas(Vuelo v1, Vuelo v2) {
		CompararPorTiempo c = new CompararPorTiempo();
		if(c.compare(v1, v2)==-1)
			System.out.printf("\n\tEl Vuelo %s - %s sale antes que el %s - %s.\n",v1.getOrigen(),v1.getDestino(),v2.getOrigen(),v2.getDestino());
		if(c.compare(v1, v2)==+1) 
			System.out.printf("\n\tEl Vuelo %s - %s sale antes que el %s - %s.\n",v2.getOrigen(),v2.getDestino(),v1.getOrigen(),v1.getDestino());
	
	}
	
	
	public void ordenarID () {
		
		SortedMap <Vuelo,Avion> ordenado = new TreeMap <Vuelo,Avion>(itinerarios);
		setItinerario(ordenado);
		
	}
	
	public void ordenarSalida() {
		
		SortedMap <Vuelo,Avion> ordenado = new TreeMap <Vuelo,Avion>(new CompararPorTiempo ());
		ordenado.putAll(itinerarios);
		setItinerario(ordenado);
		
	}
	
	
	
	
	
}
