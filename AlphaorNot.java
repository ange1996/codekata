import java.util.Scanner;
public class AlphaorNot {
	public static void main(String[] args)
	{
	 char a;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the character");
	 try{
	 a=s.next(".").charAt(0);
	 if(Character.isAlphabetic(a))
	 {
		 System.out.println("the character is an alphabet");
	 }
	 else
		 System.out.println("the character is not an alphabet");
	 }catch(Exception ex)
	 {
		 System.out.println("invalid input");
	 }
	}
}
