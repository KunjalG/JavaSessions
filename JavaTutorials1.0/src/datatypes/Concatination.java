package datatypes;

public class Concatination {

	public static void main(String[] args) {
		
		//Java executes the statements from top to down and left to right
		
		int a=100;
		int b=200;
		String x= "Hello";
		String y="World";
		System.out.println("the sum of a and b is:"+ (a+b));
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);//it will first add a & b that comes to 300 then will concatenate string
		System.out.println(x+y+a+b); //java executes from left to right so it will concatenate Helloworld & if 100 is added it will become string as helloworld100200
		
		double d1=12.33;
		double d2=10.33;
		System.out.println(x+y+d1+d2);
		System.out.println(d1+d2+x+y);
		System.out.println(x+y+(d1+d2));//it will first solve the equation in bracket & resultant will be added to outer expression.
		
		
		int i=10;
		System.out.println("The value of i is= " + i);
		
		long id=12345;
		System.out.println("Your transaction id is "+ id);
		
		
		
		
		

	}

}
