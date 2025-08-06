package mypack;

public class Q3_TypeCastingLowtoHigh {

	public static void main(String[] args) {
		int intValue = 12345;              
        long longValue = intValue;         
        float floatValue = longValue;      

        
        System.out.println("Widening Conversion Demonstration:");
        System.out.println("int value    : " + intValue);
        System.out.println("long value   : " + longValue);
        System.out.println("float value  : " + floatValue);
	}

}
