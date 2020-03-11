package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1. While loop:
		//dis advantage: of while loop it will generate infinite loop if don't add incremental or decremental part 	 	
		//Print 1 to 10
		int i = 1; //Initialisation
		while(i<=10) { //conditional
			System.out.println(i);
			i=i+1; // incremental
		}
		System.out.println("**********");
		
		
		//2. For loop:
		// J++ means J=J+1
		//Print 1 to 10
		for(int j=1;j<=10;j++) { //Initialisation, conditional, incremental
			System.out.println(j);
		}
		System.out.println("*******");
		
		//Print 10 to 1
		//k-- means k=k-1
		//below o/p 10 9 8 7 6 5 4 3 2 1
		
		for (int k=10; k>=1; k--) {  //Initialisation, conditional, decremental
			System.out.println(k);
		}
	}

}
