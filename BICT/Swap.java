class Primeno{
	public static void main(String[] args) {
		
		int i,c,n;
		n=5;
		c=0;
		for(i=0;i<=n;i++)
		{
			if(n%i==0)
			{
				c=c+1;
			}
		}
		if(c==2)
		{
			System.out.println("prime");
		}
		else{
			System.out.println(" not prime");
		}
		}
	}
}