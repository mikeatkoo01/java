package objectsexer;

public class App {

	public static void main(String[] args) {
		People James = new People("James", 23, "mortgage Adviser");
//		James.setName("James");
//		James.setAge(23);
//		James.setOccupation("Mortgage Adviser");

		People Alfie = new People("Alfie", 13, "at School");

		People Mike = new People();
		Mike.setName("Mike");
		Mike.setAge(36);
		Mike.setOccupation("Mortgage Admin");

		People[] peoples = { James, Mike, Alfie };
// this allows set methods to be passed through as the loop happens//
		for (People person : peoples) {
			person.Intro();
			person.Info();
		}

		James.setAge(James.getAge() + 1);
		James.setName(James.getName());
		James.setOccupation(James.getOccupation());

		Mike.setAge(Mike.getAge() + 1);
		Mike.setName(Mike.getName());
		Mike.setOccupation(Mike.getOccupation());
// this is the method of set age and get age//
	}

}
