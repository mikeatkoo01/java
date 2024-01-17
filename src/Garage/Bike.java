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

	public Bike(String make, String engine, String fuel, boolean sidecar) {
		super(make, engine, fuel);
		// TODO Auto-generated constructor stub
	}

//	if (sidecar = false) {
//		System.out.println("no");
//	}else {
//			System.out.println("yes");
//		
//	}

}
