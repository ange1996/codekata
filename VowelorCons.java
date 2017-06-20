import java.util.Scanner;
public class VowelorCons {
	public static void main(String[] args)
	{
		char a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character");
		try{
		a=s.next(".").charAt(0);
		if(Character.isAlphabetic(a))
		{
			
		if(a=='a'|| a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
		{
			System.out.println("the character is vowel");
		}
		else
		{
			System.out.println("the character is consonant");
		}
		
		}
		else
		{
			System.out.println("the input should be character");
		}
		}catch(Exception ex)
		{
			System.out.println("invalid input");
		}
	}

}
