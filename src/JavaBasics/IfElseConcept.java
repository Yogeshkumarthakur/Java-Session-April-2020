package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {

		//if else condition:
		
		int a = 10;
		int b = 20;
		
		if (b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
			
		//Comparison Operator:
		//<> <= >= == !=
		
		//= is a assignment operator
		// == is comparison operator
		
		int c = 40;
		int d = 40;
		if(c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and are not equal");
		}
		
		//Write a logic to find the highest no
		
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		
		 // nested if-else we use here 
		
		if (a1>b1 & a1>c1) { 
			//False and false = false
			//true and True = true
			//false and true = false
			System.out.println("a1 is the greatest");
		}
		
		else if (b1>c1){
			System.out.println("b1 is the greatest");
		}
		
		else{
			System.out.println("c1 is the greatest");
		}
	}}
		
		