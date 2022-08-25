package kay.git.com;

public class PalindromeNumber {
	public static void main(String args[])
	{
		int number=1331;
		System.out.println("Number is "+number);
		int rev=0;
		int temp=number;
		while(number>0)
		{
			int rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		if(rev==temp)
		{
			System.out.println("Given number is palindrome number: "+rev);
		}
		else
		{
			System.out.println("Given number is not palindrome number: "+temp);
		}
	}

}
