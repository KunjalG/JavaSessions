package datatypes;

public class IncrementalAndDecremental {

	public static void main(String[] args) {
		
		int i=1;
		int j= i++; // post increment
		System.out.println("Value of i=" + i);
		System.out.println("Value of j=" + j);
		
		int m=1;
		int n=++m; // pre increment
		System.out.println("Value of m=" + m);
		System.out.println("Value of n=" + n);
		
		int x=2;
		int y= x--; // post decrement
		System.out.println("Value of x=" + x);
		System.out.println("Value of y=" + y);
		
		int p=2;
		int q=--p; // pre decrement
		System.out.println("Value of p=" + p);
		System.out.println("Value of q=" + q);

	}

}
