package kay.git.com;

public class Flag {
	public static void main(String[] args) {
		System.out.println("The Flag");
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {

				System.out.print("        " + "* ");
			}
			System.out.println();
		}
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("        " + "* ");
			}
			System.out.println();
		}
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 20; j++) {
				if (j % 2 == 0) {
					System.out.println("        " + "* ");
				}
			}
		}
		int rows = 5;

		for (int i = rows; i >= 1; --i) {
			for (int space = 1; space <= rows - i; ++space) {
				System.out.print("  ");
			}

			for (int j = i; j <= 2 * i - 1; ++j) {
				System.out.print("* ");
			}

			for (int j = 0; j < i - 1; ++j) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
