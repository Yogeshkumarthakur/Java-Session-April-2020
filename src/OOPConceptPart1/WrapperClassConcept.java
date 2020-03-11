package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x ="100";
		System.out.println(x+20);
        
		//I want to convert this String into integer so there is a method available
		//data conversion
		
		// String to int conversion:
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Character, Boolean
		
		//String to double conversion
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean:
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		// int to String Conversion
		
		int j = 200;
		System.out.println(j+20);
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		//String to int which is not pure integer
		String u = "100A";
		Integer.parseInt(u);//NumberFormatException: For input string: "100A"
	}

}
