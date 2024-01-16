package Garage;

public class Plane extends Vehicle {

	private boolean propella;

	public void setpropella(boolean propella) {
		this.propella = propella;

	}

	public boolean getpropella() {
		return propella;
	}

	public void prop() {
		System.out.println(propella);
	}

}
