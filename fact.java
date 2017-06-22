import java.util.Scanner;
public class fact {
public static void main(String[] args)
{
	int n,i,fact=1;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number:");
	n=s.nextInt();
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
		
	}
	System.out.println("the factorial of a number is:"+fact);
	}
}
