package ejercicio_jero;

import java.util.Comparator;

public class CompararPorTiempo implements Comparator<Vuelo>{

	@Override
	public int compare(Vuelo v1, Vuelo v2) {
		
		if(v1.getSalida().isAfter(v2.getSalida()))
			return 1;
		if(v1.getSalida().isBefore(v2.getSalida()))
			return -1;
		return 0;
	}

}
