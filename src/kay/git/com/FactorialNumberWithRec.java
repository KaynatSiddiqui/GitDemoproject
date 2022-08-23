package kay.git.com;

public class FactorialNumberWithRec {
	
	public static int fact(int num)
	{
		if(num==0)
		{
			return 1;
		}
		else
		{
			return (num*fact(num-1));
		}
		
		
	}
	
	public static void main(String args[]) {
		int number=5;
		int result=1;
		  result = fact(number);
		  System.out.println("Factorial of "+number+" is: "+result);    

	}

}
