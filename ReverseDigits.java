import java.util.Scanner;
public class ReverseDigits {
	public static void main(String[] args)
	{
		int n,i,r;
		Scanner s=new Scanner(System.in);
		String rev=new String();
		System.out.println("enter the number:");
		n=s.nextInt();
		
		while(n!=0)
		{
			r=n%10;
			n=n/10;
		    rev=rev+r;
		
		}
		System.out.println("reversed digit:"+rev);
	}
}
