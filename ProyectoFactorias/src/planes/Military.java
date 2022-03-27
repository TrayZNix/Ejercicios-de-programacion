package planes;

import java.util.Objects;

/**
 * Clase POJO de aviones militares
 */
public abstract class Military extends Plane {
	//Attributes
	private String type; //Cargo, fighter, Air refueler, etc...
	private boolean guns; 
	private boolean flares;
	//Constructor
	public Military(String registration, String name, String manufacturer, String owner, double littersGasCapacity,
			int wheelsNumber, int engineNumber, String type) {
		super(registration, name, manufacturer, owner, littersGasCapacity, wheelsNumber, engineNumber);
		this.type = type;
	}
	//Getters, setters, toString, equals, etc
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isGuns() {
		return guns;
	}
	public void setGuns(boolean guns) {
		this.guns = guns;
	}
	public boolean isFlares() {
		return flares;
	}
	public void setFlares(boolean flares) {
		this.flares = flares;
	}
	@Override
	public String toString() {
		return "Military [type=" + type + ", guns=" + guns + ", flares=" + flares + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(flares, guns, type);
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
		Military other = (Military) obj;
		return flares == other.flares && guns == other.guns && Objects.equals(type, other.type);
	}

	@Override
	public void setExtras(boolean extraA, boolean extraB) {
		setGuns(extraA);
		setFlares(extraB);
		
	}
	
	
}
