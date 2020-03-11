package OOPConceptPart1;

public class LocalVsGlobalVariables {

	//Global or Class variables:
	String name = "tom";
	int age = 25;
		
	public static void main(String[] args) {
		int i = 10; // local variable of main method
		System.out.println(i);
		
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
