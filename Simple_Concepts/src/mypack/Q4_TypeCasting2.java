package mypack;
import java.util.Scanner;
public class Q4_TypeCasting2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal value (double): ");
        double doubleValue = sc.nextDouble();
        int intValue = (int) doubleValue;
        System.out.println("Original double value : " + doubleValue);
        System.out.println("Converted int value   : " + intValue);

	}

}
