import java.util.Scanner;
class Sumofdigit{
	public static void main(String[] args) {
		int r;
		int  s=0;
		System.out.println("Enter any number:   ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a!=0){
			r=a%10;
			s=s+r;
			a=a/10;

		}
		System.out.println("The sum of digits is:"+s);

		
	}
}		