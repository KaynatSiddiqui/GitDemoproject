package kay.git.com;

public class FactorialNumber {

	public static void main(String[] args) {
	
		int number =5;
		int res=1;
		for(int i=1;i<=number;i++)
		{
			res=res*i;
		}
		System.out.println(" Factorial of "+ number+" is "+ res);

	}

}
