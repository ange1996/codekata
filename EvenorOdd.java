import java.util.Scanner;
public class CheckEvenorOdd {
public static void main(String[] args)
{
	int number;
	System.out.println("enter the number");
	Scanner s=new Scanner(System.in);
	try{
	number=s.nextInt();
	 if(number%2==0)
	 {
		 System.out.println("the number is even");
	 }
	 else
	 {
		 System.out.println("the number is odd");
	 }
	}catch(Exception ex)
	{
		System.out.println("invalid input");
		
	}
	
	}
}
