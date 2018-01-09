package datatypes;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		
		ArrayList arl=new ArrayList();
		arl.add(25);
		arl.add(26.53);
		arl.add("Smith");
		arl.add('S');
		arl.add(true);
		
		
		for(int i=0;i<arl.size();i++)
		{
			System.out.println("Value of "+ i+" index is : " +arl.get(i));
			
		}
		arl.remove(1); //to remove the value
		System.out.println("Vale of 2nd index is :" + arl.get(1));
		
	arl.add(3,'R'); //to update the value of 3rd position
	System.out.println("Vale of 3nd index is :" + arl.get(3));
	
	//Generics
	
	ArrayList<Integer> ar= new ArrayList<Integer>() ; //To create a dynamic array list only of integer
	
	ar.add(25);
	ar.add(38);
	ar.add(40);
	
	
	//ar.add('c'); //Only integer values can b stored
	
	for(int j=0;j<ar.size();j++)
	{
		System.out.println(ar.get(j));
	}
	
	
	}

}
