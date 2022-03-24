package planes;

import java.util.Objects;

public abstract class Plane implements Comparable<Plane>{
	//Attributes
	private String registration;
	private String name;
	private String manufacturer;
	private String owner; 
	private double littersGasCapacity;
	private int    wheelsNumber;
	private int    engineNumber;
	
	//Constructor
	public Plane(String registration, String name, String manufacturer, String owner, double littersGasCapacity,
			int wheelsNumber, int engineNumber) {
		super();
		this.registration = registration;
		this.name = name;
		this.manufacturer = manufacturer;
		this.owner = owner;
		this.littersGasCapacity = littersGasCapacity;
		this.wheelsNumber = wheelsNumber;
		this.engineNumber = engineNumber;
	}
	//Getters, setters, equals, etc

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getLittersGasCapacity() {
		return littersGasCapacity;
	}

	public void setLittersGasCapacity(double littersGasCapacity) {
		this.littersGasCapacity = littersGasCapacity;
	}

	public int getWheelsNumber() {
		return wheelsNumber;
	}

	public void setWheelsNumber(int wheelsNumber) {
		this.wheelsNumber = wheelsNumber;
	}

	public int getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}

	@Override
	public String toString() {
		return "Plane [registration=" + registration + ", name=" + name + ", manufacturer=" + manufacturer + ", owner="
				+ owner + ", littersGasCapacity=" + littersGasCapacity + ", wheelsNumber=" + wheelsNumber
				+ ", engineNumber=" + engineNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(engineNumber, littersGasCapacity, manufacturer, name, owner, registration, wheelsNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane other = (Plane) obj;
		return engineNumber == other.engineNumber
				&& Double.doubleToLongBits(littersGasCapacity) == Double.doubleToLongBits(other.littersGasCapacity)
				&& Objects.equals(manufacturer, other.manufacturer) && Objects.equals(name, other.name)
				&& Objects.equals(owner, other.owner) && Objects.equals(registration, other.registration)
				&& wheelsNumber == other.wheelsNumber;
	}
	public int compareTo(Plane p) {
		return (this.registration.compareToIgnoreCase(p.registration));
	}
	
	
	
}
