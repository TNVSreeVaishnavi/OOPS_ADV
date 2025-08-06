package mypack;
import java.util.Scanner;
public class Q11_Constant_variable {

	public static void main(String[] args) {
		final double PI = 3.14159; // defining a constant

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.printf("Area         = %.4f\n", area);
        System.out.printf("Circumference = %.4f\n", circumference);

	}

}
