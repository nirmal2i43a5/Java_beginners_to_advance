import java.util.Scanner;
class Input
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string:");
		String name=s.next();
		System.out.println("Name="+name);
		System.out.println("Enter gender:");
		char gender=s.next().charAt(0);
		System.out.println("Gender="+gender);

	}
}