package interfaceT;

public class Circle implements Shape {

	double radius;
	double Area;

	public Circle(double r) {
		this.radius = r;
	}

	public void draw() {
		System.out.println("Drawing Circle");
	}

	public void getArea() {
		Area = Math.PI * radius * radius;
		System.out.println("Area of a Circle is :" + Area);

	}

	public void Circumference() {
		System.out.println("Calculating Circumference");
	}

}
