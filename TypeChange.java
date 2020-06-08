package variable;

public class TypeChange {
	public static void main(String[] args) {
		char charValue = 'a';
		int intValue = 1;
		
		intValue = charValue;
		//intValue = (int)charValue
		
		charValue = '¿©';
		intValue = charValue;
		
		System.out.println(charValue);
		System.out.println(intValue);
		
		byte byvalue = Byte.MAX_VALUE;
		short shvalue = Short.MAX_VALUE;
		int invalue = Integer.MAX_VALUE;
		long lovalue = Long.MAX_VALUE;
		
		System.out.println(byvalue);
		System.out.println(shvalue);
		System.out.println(invalue);
		System.out.println(lovalue);
		
	}
}
