package planes;

import java.util.Objects;

/**
 * Clase POJO de aviones de aviacion general
 * @author carvajal.verob22
 *
 */
public class GeneralAviation extends Plane {
	//Attributes
	private boolean shared;
	private boolean type; //AirTaxi, personal, sport usage, etc...
	//Constructor
	public GeneralAviation(String registration, String name, String manufacturer, String owner, double littersGasCapacity,
			int wheelsNumber, int engineNumber) {
		super(registration, name, manufacturer, owner, littersGasCapacity, wheelsNumber, engineNumber);
	}
	//Getters, setters, toString, equals, etc	
	public boolean isShared() {
		return shared;
	}
	public void setShared(boolean shared) {
		this.shared = shared;
	}
	public boolean isType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "GeneralAviation [shared=" + shared + ", type=" + type + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(shared, type);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeneralAviation other = (GeneralAviation) obj;
		return shared == other.shared && type == other.type;
	}
	
	
}
