package JavaBasics;

public class B extends A {

	public B() {
		// Super keyword is used to call parent class const in java
		// we can not create more than 1 Super keyword in 1 cont
		// Super keyword is always the 1st statement in the const

		super(10, 20);
		System.out.println("Child Class const");
	}

	public static void main(String args[]) {

		B obj = new B();
	}
}
 