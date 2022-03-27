package planes;

import java.util.Objects;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.DoubleStream;

import planeManager.Seat;

/**
 * Clase POJO para aviones de aerolineas
 * @author carvajal.verob22
 *
 */
public abstract class Airliner extends Plane {
	//Attributes
	private planeManager.Seat[][] seats;
	private boolean hasFood;
	private boolean lowCost;
	//Constructor
	
	public Airliner(String registration, String name, String manufacturer, String owner, double littersGasCapacity,
			int wheelsNumber, int engineNumber, Seat[][] seats) {
		super(registration, name, manufacturer, owner, littersGasCapacity, wheelsNumber, engineNumber);
		this.seats = seats;
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
	public planeManager.Seat[][] getSeats() {
		return seats;
	}

	public void setSeats(planeManager.Seat[][] seats) {
		this.seats = seats;
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

	@Override
	public void setExtras(boolean extraA, boolean extraB) {
		setHasFood(extraA);
		setLowCost(extraB);
		
	}
	
	//Methods
	public void setupSeats() {
		boolean window, extras = false;
		int removeOffset = 1;
		for(int i = 0; i < this.seats.length; i++) {
			for(int j = 0; j < this.seats[i].length; j++) {
				if(j == 0 || j == this.seats[i].length-1) {
					window = true;
				}
				else {
					window = false;
				}
				if( i < this.seats.length/5 ) {
					extras = true;
				}
				else {
					extras = false;
				}
				DoubleStream doubles = new Random().doubles(75, 175).limit(1); 
				OptionalDouble od = doubles.findFirst();
				Double d = od.getAsDouble();
				planeManager.Seat s = new Seat(d, window, extras, String.valueOf(i+removeOffset)+(char)(j+65) );
				this.seats[i][j] = s;
			}
			
		}
	}
	
}
