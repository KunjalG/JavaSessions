package oopsConcept;

public class TestAnimal {

	public static void main(String[] args) {
		
		//Object of Child Class
		
		System.out.println("Object of clid class - Bird");
		
		Bird b= new Bird();
		b.New(); //Compile time polymorphism
		b.fly();
		
		b.sleep();//parent class method
		
		b.eat(); //method overridden
		
		System.out.println("*********");
		
		System.out.println("Object of Clid class -Dog ");
		Dog d= new Dog();
		d.New(); //Compile time polymorphism
		
		d.barks();
		d.eat(); //parent class method
		d.sleep(); //method overridden
		
		
		System.out.println("*********");
		System.out.println("Object of Parent class");
		Animal A= new Animal();
		A.New();
		A.eat();
		A.sleep();
		
		System.out.println("*********");
		
		
		
		
		//Child class object can be referred by parent class reference variable 
		//Dynamic/ Run time polymorphism
		//Top Casting
		
		Animal A1=new Dog();
		
		A1.New();
		A1.sleep();
		A1.eat();
		System.out.println("*********");
		
		Animal A2= new Bird();
		A2.New();
		A2.sleep();
		A2.eat();
		
		System.out.println("*********");
			
	//	Bird B1= (Bird)new Animal(); //down casting :ClassCastException
		

	}

}
