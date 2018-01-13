package superExample;

public class ParentClass {

	public ParentClass() {
		System.out.println("Parent class constructor");
	}

	public ParentClass(int age) {
		System.out.println("Parent class Constructor with variable.: " + age);
	}

	public ParentClass(int age, String Name) {
		System.out.println("Parent class Constructor with 2variable : Age .: " + age);
		System.out.println("Parent class Constructor with 2variable : Name .: " + Name);
	}

}
