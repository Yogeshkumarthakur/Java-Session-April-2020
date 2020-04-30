package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank{ // we are achieving multiple inheritance here
	//this concept is called is-a-relationship (is a means interface and class relationship. here we user "implements" keyword
	//has-a-relationship means class to class relationship here we use "extend" keyword
	// if a class is implementing any interface it is mandatory to define all the methods of interface and class can have their own methods as well.
	
	//top three method we are overriding from US bank
	@Override
	public void credit() {
	System.out.println("hsbc---credit");
	}

	@Override
	public void debit() {
		System.out.println("hsbc---debit");
	
	}

	@Override
	public void transferMoney() {
	System.out.println("hsbc---transferMoney");	
	}
	
	
	//below 2 are Separate method of hsbc bank
	public void educationLoan() { //hsbc own method
		System.out.println("hsbc edu loan");
	}
	
	public void carLoan(){ // hsbc own method
		System.out.println("hsbc car l oan");
	}

	//below method we are overriding from Brazil bank
	 
	public void mutualFund() {	//Brazil Bank method
		System.out.println("hsbc mutual fund");
	}
}
