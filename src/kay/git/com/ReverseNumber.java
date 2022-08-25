package kay.git.com;

public class ReverseNumber {
	public static void main(String args[]) {
		int number = 123456;
		int rev = 0;
		while (number > 0) {
			int rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;

		}
		System.out.println("Reverse number is: "+rev);
	}

}
