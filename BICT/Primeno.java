import java.util.Scanner;
class Primeno
{
	public static void main(String[] args) {
		
		int i;
		
		int c=0;
  	System.out.println("Enter n::");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
		for(i=1;i<=n;i=i+1)
		{
			if(n%i==0)
			{
				c=c+1;
			}
		}
		if(c==2)
		{
			System.out.println(" "+n+" is prime");
		}
		else
		{
			System.out.println(" "+n+" is not prime");
		}
	}
}