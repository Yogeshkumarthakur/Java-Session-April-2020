package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array: we can store multiple values of similar data type in a single array variable 
		//lowest bound/index = 0
		//upper bound index = 3
		//one dim array
		
		//disadvantages of array:
		//1. Size is fixed. this is called static array. To overcome this problem we use collections like: Array list, Hash table. this is also called dynamic array
		//2. stores only similar data type values-- To overcome this problem we use object array 
		
		int i[] = new int [4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]); // ArrayIndexOutOfBoundsException
		System.out.println(i.length); // size of array which is 4
		
		//To Print all the values of array we need to use for loop
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//3. double array:
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 13.33;
		d[2] = 15.55;
		System.out.println(d[2]);
		
		//4. char array:
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = '$';
		System.out.println(c[2]);
		
		//5. boolean array:
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		//6. String array:
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "Hello";
        s[2] = "hi";
              
        System.out.println(s[1]);
        System.out.println(s.length);
        
        System.out.println("*********");
        
        
        //6. Object array: this is the super class of all the classes-- it is used to store different data type values.
        Object ob[] = new Object[6];
        ob[0] = "Tom";
        ob[1] =  25;
        ob[2] = 12.33;
        ob[3] = "1/1/1990";
        ob[4] = 'M';
        ob[5] = "London";
        System.out.println(ob[5]);
        System.out.println(ob.length);
        System.out.println("*********");
        
        //Print all the values of object array
            for(int j=0;j<ob.length;j++) {
        	System.out.println(ob[j]);
        }
 

}}
