package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal); // this var has been called from US bank interface and it is static in nature so called by interface name 
		//this var is static and final in nature you cannot change the value here
		// remember we can not create the object of interface but we can create object of hsbc bank
				
		HSBCBank hs = new HSBCBank();
				
		//Compile time polymorphism
		hs.credit(); // overridden method called
		hs.debit(); // overridden
		hs.transferMoney(); // overridden
		hs.educationLoan(); // separate method of hsbc
		hs.carLoan(); // separate method of hsbc
		
		
		//Dynamic polymorphism:
		//child class object can be referred by parent interface reference variable
		 USBank b = new HSBCBank();
		 b.credit();
		 b.debit();
		 b.transferMoney();
		// b.education(); not allowed only overridden method can be called
		 
		 	}

}
