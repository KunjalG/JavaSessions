package datatypes;

public class PrimitiveNonPrimitive {

	public static void main(String[] args) {
		//This is my first java code
/*Data types concepts
		
		Primitive Data Types :int, double boolean char
		Non- Primitive Data Types: String, Array
		
		//1. int(4 bytes) : byte(1 byte) : long(8 bytes) :short(2 bytes)
		 
		*/
		int i=10;
		i=20;
		int i1=20;
		int j=100;
		//int k=-10;
		//int p=0;
		int age = 25;
		System.out.println(i);
		System.out.println(age);
		System.out.println(i+j);
			
		
		
		//2. double(8bytes) float(4bytes)
		
		double d1=12.33;
		//double d2= -12.33;
		double d3=100;//it will print 100.0
		System.out.println(d1);
		
		System.out.println(d3);
		float height= 4.6f; //declare float values with precision f 
		System.out.println(height);
		
		//3. Char:
		//char c1 = 'a';
		char c2='2';
		char c3='3';
		
		System.out.println("Concatination of C1 & C2 is :"+ (c2+c3));//Addition of char values printing the ANCII code
		
		System.out.println(c2);
		
		
		//4. Boolean 
		
		boolean b1=true;
		boolean b2=false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		
		//5.String : String is a class in java. 'S' should b capital.
		
		String s1= "Hello World";
		String s2= "Selinium";
		String s3= "This is my first java cose";
		String s4="1000";
		String s5="12.33";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

				
	}

}
