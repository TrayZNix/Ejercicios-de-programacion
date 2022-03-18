package planes;

import java.util.Objects;

/**
 * Clase POJO para aviones de aerolineas
 * @author carvajal.verob22
 *
 */
public class Airliner extends Plane {
	//Attributes
	private int maxTouristSeatsNumber;
	private int maxEconomySeatsNumber;
	private int maxBusinessSeatsNumber;
	private boolean hasFood;
	private boolean lowCost;
	//Constructor
	public Airliner(String registration, String name, String manufacturer, String owner, double littersGasCapacity,
			int wheelsNumber, int engineNumber, int maxTouristSeatsNumber, int maxEconomySeatsNumber,
			int maxBusinessSeatsNumber, boolean hasFood, boolean lowCost) {
		super(registration, name, manufacturer, owner, littersGasCapacity, wheelsNumber, engineNumber);
		this.maxTouristSeatsNumber = maxTouristSeatsNumber;
		this.maxEconomySeatsNumber = maxEconomySeatsNumber;
		this.maxBusinessSeatsNumber = maxBusinessSeatsNumber;
		this.hasFood = hasFood;
		this.lowCost = lowCost;
	}
	//Getters, setters, toString, equals
	public int getMaxTouristSeatsNumber() {
		return maxTouristSeatsNumber;
	}
	public void setMaxTouristSeatsNumber(int maxTouristSeatsNumber) {
		this.maxTouristSeatsNumber = maxTouristSeatsNumber;
	}
	public int getMaxEconomySeatsNumber() {
		return maxEconomySeatsNumber;
	}
	public void setMaxEconomySeatsNumber(int maxEconomySeatsNumber) {
		this.maxEconomySeatsNumber = maxEconomySeatsNumber;
	}
	public int getMaxBusinessSeatsNumber() {
		return maxBusinessSeatsNumber;
	}
	public void setMaxBusinessSeatsNumber(int maxBusinessSeatsNumber) {
		this.maxBusinessSeatsNumber = maxBusinessSeatsNumber;
	}
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
		return "Airliner [maxTouristSeatsNumber=" + maxTouristSeatsNumber + ", maxEconomySeatsNumber="
				+ maxEconomySeatsNumber + ", maxBusinessSeatsNumber=" + maxBusinessSeatsNumber + ", hasFood=" + hasFood
				+ ", lowCost=" + lowCost + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(hasFood, lowCost, maxBusinessSeatsNumber, maxEconomySeatsNumber, maxTouristSeatsNumber);
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
		return hasFood == other.hasFood && lowCost == other.lowCost
				&& maxBusinessSeatsNumber == other.maxBusinessSeatsNumber
				&& maxEconomySeatsNumber == other.maxEconomySeatsNumber
				&& maxTouristSeatsNumber == other.maxTouristSeatsNumber;
	}
	
	
}
