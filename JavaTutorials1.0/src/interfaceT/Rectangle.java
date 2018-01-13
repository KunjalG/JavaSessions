package interfaceT;

public class Rectangle implements Shape {

	double Width;
	double Height;
	double Area;

	public Rectangle(double w, double h) {
		this.Width = w;
		this.Height = h;

	}

	public void draw() {
		System.out.println("Drawing Rectangle");
	}

	public void getArea() {

		Area = Width * Height;
		System.out.println("Area of a Rectangle : " + Area);
	}

}
