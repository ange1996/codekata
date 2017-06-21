import java.util.Scanner;
public class CountNum {
	public static void main(String[] args)
	{
		int n,i,r;
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		try{
			n=s.nextInt();
			while(n!=0)
				
			{
				r=n%10;
				n=n/10;
				count=count+1;
			}
			System.out.println("count of the digits :"+count);
			
		}
		catch(Exception ex)
		{
			System.out.println("invalid input");
		}
			
		
	}

}
