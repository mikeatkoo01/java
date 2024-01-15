package objectsexample;

public class App {

	public static void main(String[] args) {
		Cat moggy = new Cat();
//imported from a cat class //
		moggy.name = "Tiddles";
		moggy.breed = "Persian";
		moggy.age = 12;
		moggy.colour = "Blonde";

		System.out.println(moggy.name);
		System.out.println(moggy.breed);
		System.out.println(moggy.age);
		System.out.println(moggy.colour);

		Cat moggy2 = new Cat();

		moggy2.name = "gunther";
		moggy2.breed = "lion";
		moggy2.age = 5;
		moggy2.colour = "tiger stripe";

		System.out.println(moggy2.name);
		System.out.println(moggy2.breed);
		System.out.println(moggy2.age);
		System.out.println(moggy2.colour);

		Cat[] cats = { moggy, moggy2 };

		for (Cat cat : cats) {
			cat.print();
		}
	}

}
