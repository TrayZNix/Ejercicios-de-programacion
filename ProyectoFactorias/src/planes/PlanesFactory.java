package planes;
/**
 * This class stores a factory method, used for create plane objects
 * @author rober
 *
 */
public class PlanesFactory {
	/**
	 * This factory method creates a plane object. It creates a plane depending on the "Plane String parameter".
	 * @param plane Plane that the user wants to build
	 * @param registration Registration code used for identify the plane.
	 * @param owner	Name of the Airline or company that owns the plane. If the plane is a "general aviation" plane, this parameter will define the name of the owner.
	 * @return Plane object.
	 */
	public void hola() {
		System.out.println("HOLA");
	}
	public Plane planeFactory(String plane, String registration, String owner) {
		if( plane.equalsIgnoreCase("A320") || plane.equalsIgnoreCase("A300") || plane.equalsIgnoreCase("737") || plane.equalsIgnoreCase("777")){
			if(plane.equalsIgnoreCase("A320")) {
				Plane p = new AirbusA320(registration, owner);
				return p;
			}
			else if(plane.equalsIgnoreCase("A300")) {
				Plane p = new AirbusA300(registration, owner);
				return p;
			}
			else if(plane.equalsIgnoreCase("737")) {
				Plane p = new Boeing737(registration, owner);
				return p;
			}
			else if(plane.equalsIgnoreCase("777")) {
				Plane p = new Boeing777(registration, owner);
				return p;
			}
		}
		else if(plane.equalsIgnoreCase("Military")){
			if(plane.equalsIgnoreCase("A400M")) {
				Plane p = new A400M(registration, owner);
				return p;
			}
			else if(plane.equalsIgnoreCase("KC46A")) {
				Plane p = new KC46A(registration, owner);
				return p;
			}
			else if(plane.equalsIgnoreCase("F16")) {
				Plane p = new F16(registration, owner);
				return p;
			}
		}
		else if(plane.equalsIgnoreCase("General aviation")) {
			if(plane.equalsIgnoreCase("C172")) {
				Plane p = new Cessna172(registration, owner);
				return p;
			}
			if(plane.equalsIgnoreCase("TP2002")) {
				Plane p = new TecnamP2002(registration, owner);
				return p;
			}
		}
		Plane p = null;
		return p;
	}
}
