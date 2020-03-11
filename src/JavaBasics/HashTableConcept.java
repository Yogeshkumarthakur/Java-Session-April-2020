package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("A", "TEst");
		h.put("B", "Hello");
		h.put("C", "Sel");
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		System.out.println(h.get("A"));
		System.out.println(h.get(1));
		System.out.println(h.size());
		
		// you can also use any combination like int and string etc...
		
		h.put(3,"Tom");
		System.out.println(h.get(3));
		
		// We can also restrict the size
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();

		h1.put(1, 400);
		// h1.put("A", 200); can not write this way
		
		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
		h.put(4,"Tommy");
		System.out.println(h.get(4));
		
		
		
		
		
	}

}
