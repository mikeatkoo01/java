package objectsexer;

public class App {

	public static void main(String[] args) {
		People James = new People();

		James.name = "James";
		James.age = 23;
		James.occupation = "mortgage adviser";
		James.number = 077;

		People Mike = new People();

		Mike.name = "Mike";
		Mike.age = 36;
		Mike.occupation = "mortgage adviser";
		Mike.number = 077;

		James.Info();
		Mike.Info();

		People[] peoples = { James, Mike };

		for (People person : peoples) {
			person.Intro();
		}

	}

}
