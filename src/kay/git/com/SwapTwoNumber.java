package kay.git.com;

public class SwapTwoNumber {
	public static void main(String args[])
	{
			int a=10;
			int b=20;
			System.out.println(a+" **** before swapping **** "+b);
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println(a+" **** after swapping ****  "+b);
			
	}

}
