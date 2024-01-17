package Garage;

public class App {

	public static void main(String[] args) {
		Car focus = new Car();
		focus.setMake("focusRS");
		focus.setEngine("2litre");
		focus.setFuel("petrol");
		focus.setSunroof(true);

		Plane rolls = new Plane();
		rolls.setMake("rolls royce");
		rolls.setEngine("twin Turbo");
		rolls.setFuel("kerosene");
		rolls.setpropella(true);

		Bike ninja = new Bike();
		ninja.setMake("kwninja");
		ninja.setEngine("1litre");
		ninja.setFuel("petrol");
		ninja.setsidecar(false);

		Car rangerover = new Car("svr", "3litre", "petrol", true);
		Plane A300 = new Plane("a300", "bentley", "kerosene", false);

		focus.print();
		focus.sun();
		rolls.print();
		rolls.prop();
		ninja.print();
		ninja.side();

		rangerover.print();
		rangerover.sun();
		A300.print();
		A300.prop();

	}

}