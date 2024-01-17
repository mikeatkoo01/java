package Garage;

public class Vehicle {

	private String make;

	private String engine;

	private String fuel;

	public void Print() {
		System.out.println(make);
	}

	public Vehicle(String make, String engine, String fuel) {
		super();
		this.make = make;
		this.engine = engine;
		this.fuel = fuel;

	}

	public void print() {
		System.out.println("make: " + this.make);
		System.out.println("engine: " + this.engine);
		System.out.println("fuel: " + this.fuel);

	}

	public Vehicle() {
		super();
	}

	public void setMake(String make) {
		this.make = make;

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
