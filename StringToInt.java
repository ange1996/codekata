import java.util.Scanner;
public class StringToInt {
	public static void main(String[] args)
	{
		String r=new String();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		r=s.next();
	    System.out.println("the num is"+Integer.parseInt(r));		
	}

}
