import java.util.Scanner;
public class LargestNum {
	public static void main(String[] args)
	{
		int a,b,c;
		//String a=large;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the 1st number");
		try{
		a=s.nextInt();
		System.out.println("enter the 2nd number");
		b=s.nextInt();
		System.out.println("enter the 3rd number");
		c=s.nextInt();
		if(a>b)
		{
		  if(a>c)
		  {
			  System.out.println("a is  the largest");
		  }
		}
		else if(b>c)
			System.out.println("b is the largest");
		
		else
			System.out.println("c is the largest");
		}catch(Exception ex)
		{
			System.out.println("invalid input");
		}
	}
		

}
