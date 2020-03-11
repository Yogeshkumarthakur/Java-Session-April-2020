package OOPConceptPart2;

public interface USBank {
	//interface doesn't have main method means only declaration of the method
	//in interface we don't give method body means only method prototype 
	
	int min_bal = 100; 
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//In interface we can declare the variable and var are by default static
	//vars values can not be changed means it is constant in nature can not be changed once define 
	// No static method in interface
	//interface are abstract in nature means we can not create object of interface
}
