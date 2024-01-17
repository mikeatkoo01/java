package Garage;

public class Car extends Vehicle {

	private boolean sunroof;

	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;

	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String make, String engine, String fuel, boolean sunroof) {
		super(make, engine, fuel);
		this.sunroof = sunroof;
		// TODO Auto-generated constructor stub
	}

	public boolean getsunroof() {
		return sunroof;
	}

	public void sun() {
		System.out.println("sunroof :" + sunroof);
	}

	public void printcar() {
		System.out.println();
	}
}
