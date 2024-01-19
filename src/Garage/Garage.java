package Garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	List<Vehicle> vehicles = List.of(new Car(), new Bike(), new Plane(), new Car());

	private String name;
	private ArrayList<Vehicle> vehicle = new ArrayList<>();

	public Garage(String name) {
		super();
		this.name = name;
	}

	public void admit(Vehicle ver) {
		vehicle.add(ver);

	}

	public int total() {
		int totalBill = 0;
		for (Vehicle vehicle : vehicles) {
			totalBill += vehicle.calcBill();
		}
		return totalBill;

	}

	public Vehicle remove(int index) {
		return this.vehicle.remove(index);
	}

	/**
	 * @return the vehicle
	 */
	public ArrayList<Vehicle> getVehicle() {
		return vehicle;
	}

	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(ArrayList<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public void collect(Vehicle ver) {
		vehicle.remove(ver);
	}

	public void collect(int ver) {
		vehicle.remove(ver);
	}

}

//	public void print() {
//		System.out.println("lux cars Ltd");
//		for (Vehicle ver : vehicle) {
//			ver.print();

//		}

//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public String toString() {
//		return "Garage [name=" + name + ", vehicle=" + vehicle + "]";
//		
//
//	}
//
//}
