import java.util.Scanner;
public class LeapYears {
	public static void main(String[] args)
	{
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		try{
		year=s.nextInt();
		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println("the year is a leap year");
			}
			else
				System.out.println("the year is not a leap year");
				
		}
		else if(year%4==0)
		{
			System.out.println("the year is a leap year");
		}
		else
			System.out.println("the year is not a leap year");
		}catch(Exception ex)
		{
			System.out.println("invalid input");
		}
	}
}
