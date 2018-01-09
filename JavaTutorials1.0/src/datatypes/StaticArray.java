package datatypes;

public class StaticArray {

	public static void main(String[] args) {
int i[]=new int[3];
i[0]=10;
i[1]=20;
i[2]=30;

System.out.println("addition of 2 no : "+ (i[0]+i[1]));
//int m= i.length;


for(int j=0;j<i.length;j++)
{
System.out.println(("Value of i is= ")+ i[j]);
	}

double d[]=new double[2];
d[0]=12.56;
d[1]=15.63;
System.out.println("2nd Value of array d is : "+ d[1] );

char s[]={'a','b','c','d'};
for(int t=0;t<s.length;t++)
{
	System.out.println(t +". Value in character array is " + s[t]);
}


char m[]=new char[2];
m[0]='c';
System.out.println("first value of character array is: "+ m[0]);

String name[]= new String[3];
name[0]="John";
name[1]="Smith";
name[2]="Rosy";

for(int l=0;l<name.length;l++)
{
	System.out.println("Name of  :"+ l + "vale of String array is  : " + name[l]);
}

//Creating Object Array/Dynamic Array

Object ob[]=new Object[5];
ob[0]=12.55;
ob[1]="Smith";
ob[2]= 'g';
ob[3]=25000;
ob[4]="HR";
System.out.println("Values in Object array are:");
for (int n=0;n<ob.length;n++)
{
System.out.println( ob[n]);

}


	}	
	
	
}