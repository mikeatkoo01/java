package objectsexer;

public class People {

	private String name;

	private int age;

	private String occupation;

	public void Intro() {
		System.out.println("hello, pleased to me you, my name is " + name);
	}

// this is an argue method//
	public People(String name, int age, String occupation) {
		this.name = name;
		setAge(age);
		this.occupation = occupation;

	}

// default constructor this is a non arguments method//
	public People() {

	}

// method to apss the data and print it can be use in the loop//
	public void Info() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(occupation);

	}

//restricts the age to a set number//
	public void setAge(int age) {
		if (age >= 0 && age < 120) {
			this.age = age;
		} else {
			System.out.println("invalid");
		}
	}

// sets the get age//
	public int getAge() {
		return this.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getOccupation() {
		return occupation;
	}
// this section does getter and setters//
}
