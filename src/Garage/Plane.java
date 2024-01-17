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
		System.out.println("propella :");
		System.out.println(propella);
	}

	public Plane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plane(String make, String engine, String fuel, boolean propella) {
		super(make, engine, fuel);
		// TODO Auto-generated constructor stub
	}

}
