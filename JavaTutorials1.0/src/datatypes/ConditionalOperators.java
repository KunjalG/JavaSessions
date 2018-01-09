package datatypes;

public class ConditionalOperators {

	public static void main(String[] args) {
		//"=" is assignment operator and "==" is comparison operator in java.
		// "<" , ">" , ">=" , "<=", "!=", "<>" are comparison operators.
		
		int p=50;
		int q=70;
		if(p!=q)
		{
			System.out.println("Value of p is not equal to q.");
		}
		
		int a=500;
		int b=100;
		
		//If-Else statement to compare 2 values
		if(a==b)
		{
			System.out.println("Values for a and b are equal.");
			
		}
		else if(a>b)
		{
			System.out.println("Value of a is greater than b");
		}
		else
			System.out.println("Value of b is greater than a");
		
		//If-Else statement to highest value among three.
		
		int x= 50; 
		int y=90;  
		int z=80;  
		
		if ((x>y)&& (x>z))
		{
			System.out.println("Value of x is greater than y & z.");
		}
		
		else if(y>z)
		{
			System.out.println("Value of y is greater than x & z.");
		}
		else
		{
			System.out.println("Value of z is greater than x & y");
		}
	}

	
	
	
	
}
