package JavaBasics;

public class ConstructorConcept {

	//Constructor looks like a function or method but it is not a function 
	//Cons name should be same as class name
	//it can not return anything
	//Constructor also can be overloaded like below same method name with different parameter
	//cons will be called immediately after we create object of the class	
	//default const is a hidden const
	
	
	
	public ConstructorConcept() {
		System.out.println("Default Cons");//coz not passing anything zero parameter so it is default cont
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single param Const");
		System.out.println("the value of i is:" +i);
	}
	
	public ConstructorConcept(int i, int j) {
		System.out.println("double param const");
		System.out.println("the value of i:" +i);
		System.out.println("the value of j:" +j);
	}
	
	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10, 20);
		
		
	}

}
