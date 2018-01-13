package constructors;

public class ConstructorWithThis {

	// class variables
	String Name;
	int Age;

	public ConstructorWithThis(String n, int a) {
		this.Name = n;
		this.Age = a;

		System.out.println("Name is : " + n);
		System.out.println("Age is : " + a);

	}

	public static void main(String[] args) {

		ConstructorWithThis const1 = new ConstructorWithThis("Tom", 27);

	}

}
