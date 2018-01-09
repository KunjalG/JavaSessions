package datatypes;

public class StaticNonStatic {
	
	//Class variables Global variables
	String name="smith";
	static int age=25;
	
	public static void main(String[] args) {
		//Call to non-static members
		StaticNonStatic object= new StaticNonStatic();
		object.sendmail();
        System.out.println("Name of client is :" + object.name);
        
        //Call to static members
        
        sum();
        System.out.println("Age of clientis : " + age);
		
		
		
	}
	
	public void sendmail()
	{
		System.out.println("Send Mail.");
	}

	public static void sum(){
		int a= 20;
		int b=10;
		int sum= a+b;
		System.out.println("Sum of a & b is " + sum);
		
	}
}
