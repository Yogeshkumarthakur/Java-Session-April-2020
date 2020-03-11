package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		System.out.println(ar.size());

		ar.add(400);//3
		ar.add(500);//4
		System.out.println(ar.size());
		
		ar.add("Tom");//5
		ar.add(12.33);//6
		ar.add('C');//7
		ar.add(true);//8
		ar.add(600);//9
		
		System.out.println(ar.size());
		
		// remove method is there to remove the index
		ar.remove(9);
		
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		//System.out.println(ar.get(9));//IndexOutOfBoundsException: because 9th value doesn't exists
		
		//Print all the value of arraylist: for loop need to use
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Yogesh");
		ar2.add("12");
		
		
	}

}
