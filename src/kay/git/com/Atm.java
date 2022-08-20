package kay.git.com;

public class Atm {
	public static void main(String args[])
	{
		float amt=5000;
		String userPassword="123";
		float withdrawAmt=600;
		
		if(userPassword=="000")
		{
		if(withdrawAmt>amt)
		{
			System.out.println("insufficient balance");
		}
		else
		{
			float rem=amt-withdrawAmt;
			System.out.println("your balance is:"+rem);
		}
		}else
		{
			System.out.println("wrong password");
		}
	}

}
