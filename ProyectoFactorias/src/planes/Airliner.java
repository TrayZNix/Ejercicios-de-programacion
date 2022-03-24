package planes;

import java.util.Objects;

/**
 * Clase POJO para aviones de aerolineas
 * @author carvajal.verob22
 *
 */
public class Airliner extends Plane {
	//Attributes
	private boolean hasFood;
	private boolean lowCost;
	//Constructor
	
	public Airliner(String registration, String name, String manufacturer, String owner, double littersGasCapacity,
			int wheelsNumber, int engineNumber) {
		super(registration, name, manufacturer, owner, littersGasCapacity, wheelsNumber, engineNumber);
	}

	//Getters, setters, toString, equals

	public boolean isHasFood() {
		return hasFood;
	}
	public void setHasFood(boolean hasFood) {
		this.hasFood = hasFood;
	}
	public boolean isLowCost() {
		return lowCost;
	}
	public void setLowCost(boolean lowCost) {
		this.lowCost = lowCost;
	}
	@Override
	public String toString() {
		return "Airliner [hasFood=" + hasFood + ", lowCost=" + lowCost + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(hasFood, lowCost);
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
		Airliner other = (Airliner) obj;
		return hasFood == other.hasFood && lowCost == other.lowCost;
	}
	
	
}
