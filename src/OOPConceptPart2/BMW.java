package OOPConceptPart2;

public class BMW extends Car { //"has a relationship"
	
	
	//Method overriding: When same methods is present in parent class as well as in child class with the same name and same no of arguments it is called method overriding 
	public void start() {
		System.out.println("BMW---start");// overridden method and the preference will be given to overridden method.
	}
	
	public void theftSafety() {
		System.out.println("BMW---theftsafety");
	}
	
}
