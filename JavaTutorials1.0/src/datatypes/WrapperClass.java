package datatypes;

public class WrapperClass {

	public static void main(String[] args) {
	
		//To convert string to integer value
		
		String x="100";
		System.out.println(x+20);
		
		//String to Integer
		int i= Integer.parseInt(x);
		
		System.out.println("Addition after String to interger:" + (i+100));
		
		/* String h="100h";
		int k= Integer.parseInt(h);
		System.out.println("Vale is :"+ k); */ //Number format exception for input string 100h
		
		
		//String to double
		String height= "9.5";
		double h= Double.parseDouble(height);
	    double g=10.5;
	    
	    System.out.println("Addition after conversion from string to double: " + (h+g));
	    
	    
	    //Integer to String 
	    int k=200;
	    
	    System.out.println("Addition is "+ (k+10));
	
		String p= String.valueOf(k);
		System.out.println(p+10);
		
		//Double to String
		String q= String.valueOf(g);
		System.out.println(q+10);
		

	}

}
