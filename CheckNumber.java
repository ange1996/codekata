import java.util.Scanner;
public class CheckNumber {
public static void main(String[] args)
{
	
	int number;
	System.out.println("enter the number");
	Scanner s=new Scanner(System.in);
	try{
	number=s.nextInt();
	
	if(number>0)
	{
		System.out.println("the number is positive");
	}
	else if(number<0)
	{
		System.out.println("the number is negative");
	}
	else
	{
		System.out.println("the number is zero");
	}
	}catch(Exception ex)
	{
		System.out.println("tne input is invalid");
	}
}
}
