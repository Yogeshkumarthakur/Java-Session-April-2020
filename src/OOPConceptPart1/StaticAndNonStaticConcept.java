package OOPConceptPart1;

public class StaticAndNonStaticConcept {

	//the scope of global var will be available across all the functions with some conditions
	String name = "Tom"; // non static global variable
	static int age = 25; //static global variable
	
	public static void main(String[] args) {
				
		// how to call static methods and variables
		//1. direct calling
		sum();
		//2. Calling by class name
		StaticAndNonStaticConcept.sum();
        // static var
		System.out.println(age);//direct calling
		System.out.println(StaticAndNonStaticConcept.age);//by class name
		
		//how to call non static methods and variables
		//1. by obj name
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		// can i access static method by using object reference method ? Yes
		obj.sum(); // warning will be given because this is not a good practice it is freely availble
				
	}
	
	public void sendMail() { // non static method
    System.out.println("send mail method");
}
	
	public static void sum() { // static method
		System.out.println("sum method");
	}
}