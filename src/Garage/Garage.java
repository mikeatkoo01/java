package Garage;

import java.util.ArrayList;

public class Garage {

	private String name;
	private ArrayList<Vehicle> vehicle = new ArrayList<>();

	public Garage(String name) {
		super();
		this.name = name;
	}

	public void admit(Vehicle ver) {
		vehicle.add(ver);

	}

	public void collect(Vehicle ver) {
		vehicle.remove(ver);
	}

	public void collect(int ver) {
		vehicle.remove(ver);
	}

//	public void print() {
//		System.out.println("lux cars Ltd");
//		for (Vehicle ver : vehicle) {
//			ver.print();

//		}

//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Garage [name=" + name + ", vehicle=" + vehicle + "]";
	}

}
