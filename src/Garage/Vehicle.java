package Garage;

import java.util.Objects;

public abstract class Vehicle implements Comparable<Vehicle> {

	private int id;

	private String make;

	private String engine;

	private String fuel;

	private static int count;

	public void Print() {
		System.out.println(make);
	}

	public Vehicle(String make, String engine, String fuel) {
		super();
		this.id = ++count;
		this.make = make;
		this.engine = engine;
		this.fuel = fuel;

	}

//	public void print() {
//		System.out.println("make: " + this.make);
//		System.out.println("engine: " + this.engine);
//		System.out.println("fuel: " + this.fuel);
//
//	}

	@Override
	public int compareTo(Vehicle o) {
		// TODO Auto-generated method stub
		return this.make.compareTo(o.make);
	}

	public abstract int calcBill();

	public Vehicle() {
		super();
		this.id = ++count;
	}

	public void setMake(String make) {
		this.make = make;

	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Vehicle id=" + id + ", make=" + make + ", engine=" + engine + ", fuel=" + fuel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(engine, fuel, make);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Vehicle)) {
			return false;
		}
		Vehicle other = (Vehicle) obj;
		return Objects.equals(engine, other.engine) && Objects.equals(fuel, other.fuel)
				&& Objects.equals(make, other.make);
	}

	public String getMake() {
		return make;
	}

	public void setEngine(String engine) {
		this.engine = engine;

	}

	public String getEngine() {
		return engine;

	}

	public void setFuel(String fuel) {
		this.fuel = fuel;

	}

	public String getfuel() {
		return fuel;
	}
}
