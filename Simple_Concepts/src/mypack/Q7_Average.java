package mypack;
import java.util.Scanner;
public class Q7_Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        double average = (num1 + num2 + num3) / 3;

        System.out.println("\nAverage of the three numbers: " + average);

	}

}
