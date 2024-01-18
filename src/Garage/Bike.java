package Garage;

public class Bike extends Vehicle {

	private boolean sidecar;

	public void setsidecar(boolean sidecar) {
		this.sidecar = sidecar;

	}

	public boolean getsidecar() {
		return sidecar;
	}

	public void side() {
		System.out.println("sidecar :");
		System.out.println(sidecar);

	}

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public void print() {
//		super.print();
//		System.out.println("sidecar:" + this.sidecar);
//	}

	@Override
	public int calcBill() {
		return 10;
	}

	@Override
	public String toString() {
		return "Bike [sidecar()=" + getsidecar() + ", Make()=" + getMake() + ", Engine=" + getEngine() + ", fuel="
				+ getfuel() + "]";
	}

	public Bike(String make, String engine, String fuel, boolean sidecar) {
		super(make, engine, fuel);
		this.sidecar = sidecar;
		// TODO Auto-generated constructor stub

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
		Bike other = (Bike) obj;

		if (!super.equals(obj)) {
			return false;
		}

		if (this.sidecar != other.getsidecar()) {
			return false;
		}

		return true;
	}

//	if (sidecar = false) {
//		System.out.println("no");
//	}else {
//			System.out.println("yes");
//		
//	}

}
