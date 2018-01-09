package datatypes;

import javax.swing.plaf.synth.SynthStyle;

public class JavaFunctions {

	public static void main(String[] args) {
		JavaFunctions fncj= new JavaFunctions();
			fncj.sum();
			
	int mult=fncj.mult();
	System.out.println("Multiplication of 2 numbers is = " + mult);
	
	double area=fncj.areaCircle(12.5);
	System.out.println("Area of a circle is : "+ area);

	fncj.sum(10, 20);
	
	fncj.sum(20, 30, "Smith");
	

	}

	//functions are independent and parallel to each other & cannon be created into main function.
	
	//function with out any parameters & return vale
	public void sum()
	{
		int a= 10;
		int b= 20;
		System.out.println("Sum of 2 varaiable=  "+(a+b));
	}
	
	//functions with return value but no parameters
	
	public int mult()
	{
		int a=10;
		int b=20;
		int c = a*b;
		return(c);
	}
	
	//functions with return vale & parameters
	
	
	public double areaCircle(double r){
		double area=13.14*(r*r);
		return (area);
	}
	
	//method overloading
	//same function with 2 parameters
	
	public void sum(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition of 2 no [method overloading]  : " + c);
		
	}
	
	public void sum(int a, int b, String name)
	{
		int c=a+b;
		System.out.println("Addition of 2 no with string variable [method overloading]  : " + c + "and name is: " + name);
		
		
	}
	
}
