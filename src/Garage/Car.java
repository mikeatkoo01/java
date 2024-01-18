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

//	@Override
//	public void print() {
//		super.print();
//		System.out.println("sunroof:" + this.sunroof);
//	}

	@Override
	public int calcBill() {
		return 15;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		// Casts the other obj to be a Cat
		Car other = (Car) obj;

		if (!super.equals(obj)) {
			return false;
		}

		if (this.sunroof != other.getsunroof()) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return "Car [ Make=" + getMake() + ", Engine=" + getEngine() + ", fuel=" + getfuel() + ",sunroof="
				+ getsunroof() + "]";
	}

// this was before override
//	public void sun() {
//		System.out.println("sunroof :" + sunroof);
//	}
//
//	public void printcar() {
//		System.out.println();
//	}
}
