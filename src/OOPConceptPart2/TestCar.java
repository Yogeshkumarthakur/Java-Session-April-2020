package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		// static or compile time polymorphism
		// what is polymorphism: it means 1 to many method means method over ridding 
		BMW b = new BMW();
		b.start(); // overridden method
		b.stop(); // this method is inherited from parent class
		b.refuel(); // this method is inherited from parent class
		b.theftSafety(); // overridden method
		b.engine();
		
		System.out.println("*************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
	
		System.out.println("*************");
		
		//Top Casting: it is possible small thing can be fit into big thing means child can be fit into parents home
		Car c1 = new BMW(); // child class object can be refereed by parent class ref variable and this is called dynamic or Run time polymorphism
		c1.start();
		c1.stop();
		c1.refuel();

		//Down casting: not allowed it will give us Class cast Exception
		//BMW b1 = new Car();// Not allowed small thing can be fit into big thing not vice versa
		// but we can do it in another way, we can just cast it by converting  new Car() object into BMW cast like below
		BMW b1 = (BMW)new Car();//ClassCastException
		}
	
}
