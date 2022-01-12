package ejercicio08;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		Vista v = new Vista();
		Sorteo s = new Sorteo();
		Decimo d = new Decimo();
		int ganadores[]= new int[5];
		int selector, selectorAdvertencia, boletoAleatorio, boletoComprobar;
		double precio = 0, ganadoJugador;
		boolean seguir=true, comprado=false, error=false, loop = false;
		v.Bienvenida();
		do {
			v.MenuPrincipal();
			selector=leer.datoInt();
			switch (selector) {
				case 0:
					seguir = false;
					break;
				
				case 1: 
					if(comprado) {
						v.advertenciaYaHecho();
						selectorAdvertencia=leer.datoInt();
						if(selectorAdvertencia==1) {
							d.setNum(0);
							d.setPrecio(0);
							comprado=false;
						}
					}
					if(comprado==false) {
						v.MenuSecundarioA();
						selector=leer.datoInt();
						switch (selector) {
						//AÑADIR DEFAULT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
							case 1:
								do {							
									v.menuPreguntaNumero();
									selector=leer.datoInt();
									if(selector<0|selector>99999) {
										error=true;
										v.errorSeleccionNumero();
									}
									else {
										error=false;
									}
								}while(error&selector!=0);
								v.precio();
								do {
									precio=leer.datoDouble();
									if(precio<=0) {
										error=true;
										v.errorSeleccionPrecio();
									}
									else {
										error=false;
									}
								}while(error);								
								d.setNum(selector);
								d.setPrecio(precio);
								comprado=true;
								break;
							case 2:
								do {
									boletoAleatorio=d.generarBoletoAleatorio();
									v.generado(boletoAleatorio);
									selector=leer.datoInt();
									switch (selector){
										case 0:
											loop = false;
											break;
										case 1:
											v.precio();
											precio = leer.datoDouble();
											comprado = true;
											v.confirmacion(precio, boletoAleatorio);
											d.setNum(boletoAleatorio);
											d.setPrecio(precio);
											loop = false;
											break;
										case 2:
											loop = true;
											break;
										default:
											v.errorSeleccionGeneral();
											break;
									}
								}while(loop);
								break;
							
						}
					}
					break;
				case 2:
					v.MenuSecundarioB();
					selector=leer.datoInt();
					switch(selector) {
						case 1:
							precio = d.getPrecio();
							boletoComprobar= d.getNum();
							ganadoJugador = s.comprobar(precio, boletoComprobar);
							v.ganado(ganadoJugador);
							break;
							
						case 2:
							break;
						default:
							v.errorSeleccionGeneral();
							break;
						}
				
				
			}
		}while(seguir);
		v.despedida();
		
		}

}
