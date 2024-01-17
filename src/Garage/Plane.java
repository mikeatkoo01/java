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

	@Override
	public void print() {
		super.print();
		System.out.println("propella:" + this.propella);
	}

	public Plane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plane(String make, String engine, String fuel, boolean propella) {
		super(make, engine, fuel);
		this.propella = propella;
		// TODO Auto-generated constructor stub
	}

}
