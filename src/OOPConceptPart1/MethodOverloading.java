package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
	}
	
	// Method overloading--> When the method name is same with different arguments or input parameters with different data type within the same class
	// Duplicate method are not allowed--> same method with same no of arguments are not allowed
	// We can not create method inside a method
	// main method can be overloaded but with different data type or input parameters
	// below are the non static methods so we need to call them by creating Object 
	
	public void sum() {// 0 input parameter
		System.out.println("Sum method with zero input parameter");
	}
	
	public void sum(int i ) {// 1 input parameter
		System.out.println("Sum method with 1 input paramter");
		System.out.println(i);
	}
	
	public void sum(int k, int l) { // 2 input parameter 
		System.out.println("Sum method with 2 input Paramter");
		System.out.println(k+l);
	}
	
	
	
}
