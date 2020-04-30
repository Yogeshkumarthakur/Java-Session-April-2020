package OOPConceptPart1;

public class Car {

	//Global/Class variable:
	
	int mod;
	int wheel;
	
	public static void main(String[] args) {

		//new keyword is used to create the object
		//new Car();--> this is Object of Car Class
		//a,b,c --> this is object reference variable
		
		Car a = new Car();
		Car b = new Car();
	    Car c = new Car();
	    
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel = 4;
		
		c.mod = 2013;
		c.wheel = 4;
		
		System.out.println("before assigning the reference");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("After assigning the reference");
		
		a=b;
		b=c;
		c=a;
		
		a.mod = 10;
		System.out.println(a.mod); // 10
		c.mod = 20;
		System.out.println(a.mod); // 20
		System.out.println(c.mod); // 20
		
	}

}
