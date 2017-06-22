import java.util.Scanner;

public class reverse {
	public static void main(String[] args)
	{
		int i;
	   Scanner s=new Scanner(System.in);
	   String r=new String();
	   String n=new String();
	   System.out.println("enter the string:");
	   r=s.next();
	   for(i=r.length()-1;i>=0;i--)
	   {
		 n=n+r.charAt(i);  
	   }
	   System.out.println("the reversed string is :"+n);
	   
	}

}
