/*class Character
{
	public static void main(String arg[])
	{
		char A,e,U;
		float a=56.9f;
		System.out.println("'A','e', and 'U'");
		System.out.println(""+a+"");

	}	
}*/
import java.util.Scanner;

public class Student 
{
	static int mark;
 	char grade;
 
 public static void main (String args[])
  {	Student S1 = new Student();
	S1.mark=markEntry();
	System.out.println(" Grade : " + myGrade(mark));
 	}
					
	public static int markEntry()
	{ Scanner input = new Scanner (System.in);
	  System.out.print("Enter Mark:");
	  int mark = input.nextInt();
	  return mark;
        	 }
		
	public static int myGrade(int a) 
		{ if (a >= 75)  return 'A'; 
			else if (a >= 66) return 'B'; 
			     	else if (a >= 50) return 'C'; 
				    	else if (a >= 40) return 'D' ;
					       else return 'F'; 
			}
}
