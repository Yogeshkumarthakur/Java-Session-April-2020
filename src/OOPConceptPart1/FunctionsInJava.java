package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		// if you want to call any non static method you need to create an object
		//After creating an object the copy all non static method will be given to that object
		FunctionsInJava obj = new FunctionsInJava();
		//in above method "obj" is object reference variable referring to object "new FunctionsInJava();"
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.division(10, 2);
		System.out.println(div);
		
		//main method is void it never returns a value
	}

	//Non Static methods	
	public void test() { // No input no output
		System.out.println("test method");
	}
	
	public int pqr() {//no input some output
	System.out.println("pqr method");
	int a = 10;
	int b = 20;
	int c = a+b;
	return c;
	
	}
	 public String qa() {
		 System.out.println("qa method");
		 String s = "selenium";
		 return s;
	 }
	
	 public int division(int x, int y) { // some input some output
		 System.out.println("division method");
		 int d = x/y;
		 return d;
	 }
	}
