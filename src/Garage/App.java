package Garage;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
//		Car focus = new Car();
//		focus.setMake("focusRS");
//		focus.setEngine("2litre");
//		focus.setFuel("petrol");
//		focus.setSunroof(true);
//
//		Plane rolls = new Plane();
//		rolls.setMake("rolls royce");
//		rolls.setEngine("twin Turbo");
//		rolls.setFuel("kerosene");
//		rolls.setpropella(true);
//
//		Bike ninja = new Bike();
//		ninja.setMake("kwninja");
//		ninja.setEngine("1litre");
//		ninja.setFuel("petrol");
//		ninja.setsidecar(false);
//
//		Car rangerover = new Car("svr", "3litre", "petrol", true);
//		Plane A300 = new Plane("a300", "bentley", "kerosene", false);
//		Bike honda = new Bike("honda", "2 litre", "diesel", true);
//
//		Vehicle v1 = new Car("svr", "3litre", "petrol", true);
//		Vehicle v2 = new Bike("honda", "2 litre", "diesel", true);
//		Vehicle v3 = new Plane("a300", "bentley", "kerosene", false);
//		Vehicle v4 = new Car("FocusRS", "3.2litre", "petrol", true);
//		Vehicle v5 = new Bike("Kw Ninja", "1 litre", "diesel", true);
//		Vehicle v6 = new Plane("747", "jt turbo fan", "kerosene", false);
//
//		Vehicle[] vehicles = { v1, v2, v3, v4, v5, v6 };
//
//		for (Vehicle ver : vehicles) {
//			ver.print();
//		}

//		Garage myGarage = new Garage("lux cars ltd");
//
//		myGarage.admit(new Car("svr", "3litre", "petrol", true));
//		myGarage.admit(new Car("focusRS", "3.2litre", "petrol", true));
//		myGarage.admit(new Car("Lambo", "6.8litre", "petrol", true));
//		myGarage.admit(new Car("Porsche", "3litre", "petrol", true));
//
//		myGarage.admit(new Car("focusRS", "3.2litre", "petrol", true));

//		myGarage.print(); this is due to.string replacing print. 

//		Vehicle Car1 = new Car("focusRS", "3.2litre", "petrol", true);
//		Vehicle Car2 = new Car("focusRS", "3.2litre", "petrol", true);

//syntax (x.equals(y) this is to compare values.

//		System.out.println(Car1.equals(Car2));

//		System.out.println(Car1);
//		System.out.println(Car2);

//		System.out.println(myGarage);

//		System.out.println(myGarage.total());

		ArrayList<Vehicle> vehicles = new ArrayList<>();

		Vehicle v1 = new Car("svr", "3litre", "petrol", true);
		Vehicle v2 = new Car("focusRS", "3.2litre", "petrol", true);
		Vehicle v3 = new Car("Lambo", "6.8litre", "petrol", true);
		Vehicle v4 = new Plane("Boeing", "747", "White", false);
		Vehicle v5 = new Plane("Rolls Royce", "Spitfire", "Green", true);

		vehicles.add(v3);
		vehicles.add(v4);
		vehicles.add(v1);
		vehicles.add(v5);
		vehicles.add(v2);

		System.out.println("VEHICLES: " + vehicles);

		Collections.sort(vehicles);

		System.out.println("VEHICLES: " + vehicles);

	}

}