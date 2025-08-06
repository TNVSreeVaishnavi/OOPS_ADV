package mypack;
import java.util.Scanner;
public class Q10_Divisibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by BOTH 3 and 5.");
        } else {
            System.out.println(number + " is NOT divisible by both 3 and 5.");
        }

	}

}
