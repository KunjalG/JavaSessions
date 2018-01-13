package superExample;

public class ChildClass extends ParentClass {

	public ChildClass() {
		// super();
		System.out.println("Child Class Constructors.");
	}

	public ChildClass(int i) {
		super(i);
		System.out.println("Child Class Constructors with one variable i :  " + i);

	}

	public ChildClass(int age, String Name) {
		super(age, Name);
		System.out.println("Child Class Constructors with two variables Age & Name:  " + age + " " + Name);
	}

	public static void main(String args[]) {

		ChildClass CH1 = new ChildClass();
		ChildClass CH2 = new ChildClass(25);
		ChildClass CH3 = new ChildClass(35, "Smith");

	}
}
