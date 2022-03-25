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
	
	public Plane planeFactory(String plane, String registration, String owner) {
		Plane p;
		switch(plane) {
			default:
				p = null;
				break;
			case "A320":
				p = new AirbusA320(registration, owner);
				break;
			case "A300":
				p = new AirbusA300(registration, owner);
				break;
			case "737":
				p = new Boeing737(registration, owner);
				break;
			case "777":
				p = new Boeing777(registration, owner);
				break;
			case "A400M":
				p = new A400M(registration, owner);
				break;
			case "F16":
				p = new F16(registration, owner);
				break;
			case "KC46A":
				p = new KC46A(registration, owner);
				break;
			case "C172":
				p = new AirbusA320(registration, owner);
				break;
			case "TP2002":
				p = new AirbusA320(registration, owner);
				break;
		}
		return p;
	}
}
