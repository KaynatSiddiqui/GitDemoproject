package kay.git.com;

public class PalindromeOfString {
	public static void main(String args[]) {
		String name = "madam";
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		if (name.equals(rev)) {
			System.out.println("Given string is palindrome: " + rev);
		} else {
			System.out.println("Given string is not palindrome: " + name);
		}
	}

}
