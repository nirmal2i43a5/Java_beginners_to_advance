import java.util.Scanner;
 class Sturesult{
	public static void main(String[] args) {
		float m1,m2,m3,m4,m5;
		System.out.println("Enter m1,m2,m3,m4,and m5");
		Scanner s=new Scanner(System.in);

		float m1=s.nextFloat();
		float m2=s.nextFloat();
		float m3=s.nextFloat();
		float m4=s.nextFloat();
		float m5=s.nextFloat();
		if(m1>=40&&m2>=40&&m3>=40&&4>=40&&m5>=40)
		{
			m=(float)(m1+m2+m3+m4+m5)/5;
			if(m>80)
				System.out.println("Examplary");
			else if(75<m<80)
				System.out.println("Distinction");
			else if(60<m<75)
				System.out.println("First class");
			else if(50<m<60)
				System.out.println("Second class");
			else
				System.out.println("Fail");
		}
		else
			System.out.println("Your mark should be "+>+"or"+=+"to"+40+"for requirement");
	}
}