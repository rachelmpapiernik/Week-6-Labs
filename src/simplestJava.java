//import scanner
import java.util.Scanner;

public class simplestJava {
	public static int cubic(int n) {
		int sum = 0;
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < n; k++) {
				for (int l = 0; l < n; l++) {
					sum += j * k / (l + 1);
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// prompt user to enter a number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer :");

		int n = sc.nextInt();
		// output sum after using the equation
		System.out.println("Sum is :" + cubic(n));

		// close scanner
		sc.close();
	}
}