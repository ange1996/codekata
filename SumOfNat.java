import java.util.Scanner;
public class SumOfNat {
	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		try
		{
		n=s.nextInt();
		int sum=(n*(n+1))/2;
		System.out.println("the sum of natural numbers are:"+sum);
		}catch(Exception ex)
		{
			System.out.println("invalid input");
		}
		
	}

}
