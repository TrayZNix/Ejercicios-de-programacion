package ejercicio1;
import java.util.UUID;

public class Principal {
	
	public static void main(String[] args) {
		Playlist p = new Playlist();
		int cont = 0;
		//generates random UUID.
		do {
		UUID uuid=UUID.randomUUID();
		System.out.println(uuid);
		cont++;
		}while(cont < 100);
		
	}

}
