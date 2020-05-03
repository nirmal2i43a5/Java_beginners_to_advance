import java.util.Scanner;
class Primeusingobj
{
	public static void main(String[] args) {
		
	
         System.out.println("Enter n::");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
       

	Primeusingobj a=new Primeusingobj();
    	a.test(n);

		
	}
}
class Testprime
{
    int i,c=0;
    void test(int n)
    {
        for(i=1;i<=n;i=i+1)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }
        if(c==2)
		{
			System.out.println(" num is prime");
		}
	else
		{
			System.out.println(" not prime");
		}
    }
}
