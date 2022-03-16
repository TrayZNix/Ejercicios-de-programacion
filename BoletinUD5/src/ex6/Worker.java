package ex6;

import java.util.Objects;

public class Worker {
	//Atributtes
	private String dni;
	private int workedHours;
	private double totalSalary;
	//Constructor
	public Worker(String dni) {
		this.dni = dni;
	}
	public Worker(String dni, int workedHours) {
		this.dni = dni;
		this.workedHours = workedHours;
	}
	//Getters, setters, toString, equals
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getWorkedHours() {
		return workedHours;
	}
	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}
	public double getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
	@Override
	public String toString() {
		return "Worker [dni=" + dni + ", workedHours=" + workedHours + ", totalSalary=" + totalSalary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni, totalSalary, workedHours);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return Objects.equals(dni, other.dni)
				&& Double.doubleToLongBits(totalSalary) == Double.doubleToLongBits(other.totalSalary)
				&& workedHours == other.workedHours;
	}
	
}
