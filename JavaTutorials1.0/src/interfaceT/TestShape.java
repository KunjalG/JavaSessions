package interfaceT;

public class TestShape {

	public static void main(String[] args) {
		// we can access parent class variable in case of Interface
		System.out.println("Lables are: " + Shape.Lable);

		Shape SP1 = new Circle(10.25);
		SP1.draw();
		SP1.getArea();

		Shape SP2 = new Rectangle(10.5, 15.27);
		SP2.draw();
		SP2.getArea();

		// Creating new object of circle
		// But we can access Child class variables in order to access child
		// class variable we have to create its object

		Circle c1 = new Circle(10);
		System.out.println("Value for radius is :" + c1.radius);
		c1.getArea();
		System.out.println(" Area is: " + c1.Area);
		c1.Circumference();

	}

}
