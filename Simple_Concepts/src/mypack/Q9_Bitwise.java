package mypack;
import java.util.Scanner;
public class Q9_Bitwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = sc.nextInt();

        System.out.printf("a       = %d (%s)\n", a, Integer.toBinaryString(a));
        System.out.printf("b       = %d (%s)\n\n", b, Integer.toBinaryString(b));

        System.out.printf("a & b   = %d (%s)\n", a & b, Integer.toBinaryString(a & b));
        System.out.printf("a | b   = %d (%s)\n", a | b, Integer.toBinaryString(a | b));
        System.out.printf("a ^ b   = %d (%s)\n", a ^ b, Integer.toBinaryString(a ^ b));
        System.out.printf("a << 1  = %d (%s)\n", a << 1, Integer.toBinaryString(a << 1));
        System.out.printf("b >> 1  = %d (%s)\n", b >> 1, Integer.toBinaryString(b >> 1));

	}

}
