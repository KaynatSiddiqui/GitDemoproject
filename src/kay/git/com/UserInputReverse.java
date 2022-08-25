package kay.git.com;

import java.util.Scanner;

public class UserInputReverse {

	public static void main(String args[]) {

		System.out.println("Please enter  numbers: ");

		Scanner sc = new Scanner(System.in);
		int userNumber = sc.nextInt();
		int num = userNumber;
		int rev = 0;
		while (userNumber > 0) {
			int rem = userNumber % 10;
			rev = rev * 10 + rem;
			userNumber = userNumber / 10;

		}
		System.out.println("You entered: " + num + " and reverse number is " + rev);

	}
}
