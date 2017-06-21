import java.util.Scanner;
public class SumOfNForLoop {
	public static void main(String[] args)
	{
		int n,i;
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		try{
			n=s.nextInt();
			for(i=1;i<=n;i++)
			{
				sum=sum+i;
			}
			System.out.println("the sum of natural numbers are:"+sum);
		}catch(Exception ex)
		{
			System.out.println("invalid input");
		}
	}
}
