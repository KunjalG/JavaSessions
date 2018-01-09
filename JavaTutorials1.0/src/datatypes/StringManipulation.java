package datatypes;

public class StringManipulation {

	public static void main(String[] args) {
		
		String S= "This is my first class for Web Driver";
		
		System.out.println("String is : " + S);


		System.out.println("Length of string is "+ S.length());
		
		System.out.println(S.charAt(25)); //to find character at
		System.out.println(S.charAt(31));

		
		System.out.println("Index of c is :"+S.indexOf('c')); // to find index of a char
		System.out.println("Index of Web is :" + S.indexOf("Web")); // to find index of a string
		
		//to find first occurence of s
		
		System.out.println("First Occurance of s : "+ S.indexOf('s'));
		
		//to find second occurence of s
		
		System.out.println("Second Occurence of s is : " + S.indexOf('s',S.indexOf('s')+1));
		
		//to find 3rd occurance of s
		
		int k= S.indexOf('s',S.indexOf('s')+1);
		
		System.out.println("Third occurance of s if : "+ S.indexOf('s',k+1));
		
		
		String S1= "This is my first class for web driver";
		
		System.out.println("The Strings are equal  :"+S1.equals(S));
		
		System.out.println("The Srtings are equal after ignoring cases: " + S1.equalsIgnoreCase(S));
		
		
		//Trim
		
		String Dept= "   Electronics & Telicommunication  ";
		System.out.println("After removing spaces:  " + Dept.trim());
		
		//Replace
		
		String Date="12/25/07";
		
		System.out.println(Date.replace('/', '-'));
		
		//To remove all spaces in a string
		String Name=" Smith  Kippling";
		
		System.out.println(Name.replace(" ",""));
		
		
		//Sub String
		String Depart= "Computers Electronics ";
		System.out.println(Depart.substring(0,9));
		
		
		//Split String
		String Address=" 198_Bajajnagar_Nagpur ";
		
		String arr[]= Address.split("_");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		String Subject="XxComputersXxScienceXxMaths";
		
		String Sub[]=Subject.split("Xx");
		
		for (int j=0; j<Sub.length;j++)
		{
			System.out.println(Sub[j]);
		}
		
		
		
		
		
	}

}
