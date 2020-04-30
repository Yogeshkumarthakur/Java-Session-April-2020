package OOPConceptPart1;

public class LocalVsGlobalVariables {

	//Global or Class variables:
	String name = "tom";
	int age = 25;
		
	public static void main(String[] args) {
		int i = 10; // local variable of main method
		System.out.println(i);
		
		// As soon as u create object the copy of all non static method and non static global var will be given to that object
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		
	}

	public void sum() {
		System.out.println("sum method");
		int i = 10; // local variables of sum method
		int j = 20;
		
	}
	
	
}
