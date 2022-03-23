package Ej01;

import java.util.Objects;

public class Suite extends Habitacion {
	private double roomArea;
	private double moneyWasted; //Quantity of money wasted by the clients in room service
	private int discount; //Discount percentage to apply in the final price.
	
	
	public Suite(double basePrice, double roomArea, int discount) {
		super(basePrice);
		this.roomArea = roomArea;
		this.discount = discount;
	}

	public Suite(double basePrice, boolean occupied, String clientName, int daysStaying, int numberOfPeopleStaying,
			double roomArea, int discount) {
		super(basePrice, occupied, clientName, daysStaying, numberOfPeopleStaying);
		this.roomArea = roomArea;
		this.discount = discount;
	}

	public double getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(double roomArea) {
		this.roomArea = roomArea;
	}

	public double getMoneyWasted() {
		return moneyWasted;
	}

	public void setMoneyWasted(double moneyWasted) {
		this.moneyWasted = moneyWasted;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	

	@Override
	public String toString() {
		return "Suite [roomArea=" + roomArea + ", moneyWasted=" + moneyWasted + ", discount=" + discount
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(discount, moneyWasted, roomArea);
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
		Suite other = (Suite) obj;
		return discount == other.discount
				&& Double.doubleToLongBits(moneyWasted) == Double.doubleToLongBits(other.moneyWasted)
				&& Double.doubleToLongBits(roomArea) == Double.doubleToLongBits(other.roomArea);
	}
	
	@Override
	public double calculateRoomPrice() {
		int CIEN = 100;
		double finalPrice;
		finalPrice = this.getBasePrice()*this.getDaysStaying(); //Without discount applied. ¿¿¿¿Do i need to apply room service money?????
		finalPrice = finalPrice-(finalPrice*this.discount/CIEN); //Discount applied
		return finalPrice;
		
	}
	
	
	
	
}
