package datatypes;

public class Loops {

	public static void main(String[] args) {
		//1. While loop . To print number from 1 to 10.
		
		int p=1; //initialization 
		while (p<=10) //Conditional
		{
			System.out.println(p);
			p++; //Incremental
			
		}
		
		System.out.println("***************");
		
	//2. for loop to print numbers from 1 to 10
		for( int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		System.out.println("***************");

   //3. for loop to print numbers from 10 to 1
		for( int j=10; j>=1; j--)
		{
			System.out.println(j);
		}
		
		
	}

}
