package planes;

import java.util.Objects;

/**
 * Clase POJO de aviones de aviacion general
 * @author carvajal.verob22
 *
 */
public abstract class GeneralAviation extends Plane {
	//Attributes
	private boolean shared;
	private boolean longRange; //Is the aircraft capable to achieve long range travel?
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
	public boolean isLongRange() {
		return longRange;
	}
	public void setLongRange(boolean longRange) {
		this.longRange = longRange;
	}
	@Override
	public String toString() {
		return "GeneralAviation [shared=" + shared + ", type=" + longRange + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(shared, longRange);
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
		return shared == other.shared && longRange == other.longRange;
	}
	
	//Methods
	@Override
	public void setExtras(boolean extraA, boolean extraB) {
		setShared(extraA);
		setLongRange(extraB);
		
	}
	
	
	
}
