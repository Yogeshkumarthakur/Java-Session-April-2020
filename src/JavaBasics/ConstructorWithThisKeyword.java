package JavaBasics;

public class ConstructorWithThisKeyword {

	String name ;// Class or global var
	int age;// class or  global var
	
		
	public ConstructorWithThisKeyword(String name, int age) {
		//whenever you want to initallize the global var with the current value of const then this keyword is used
	this.name = name;
	this.age = age;
	
	System.out.println(name);
	System.out.println(age);
	
	
}
	public static void main(String[] args) {

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",30);		

}}