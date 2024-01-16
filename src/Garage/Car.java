package Garage;

public class Car extends Vehicle {

	private boolean sunroof;

	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;

	}

	public boolean getsunroof() {
		return sunroof;
	}

	public void sun() {
		System.out.println(sunroof);
	}
}
