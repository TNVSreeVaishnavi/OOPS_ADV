package mypack;
import java.util.Scanner;
public class Q5_AsciiValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int asciiValue = (int) ch;
        System.out.println("Character entered: " + ch);
        System.out.println("ASCII value       : " + asciiValue);
        System.out.println("Integer equivalent: " + asciiValue);

	}

}
