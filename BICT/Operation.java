class Division
{
	int div(int a,int b)
		{
			return a/b;
		}
	
}
class Subtraction
{
	int sub(int a,int b)
		{
			return a-b;
		}
	
}
class Addition
{
	int add(int a,int b)
		{
			return a+b;
		}
	
}
class Multiplication
{
	int mul(int a,int b)
		{
			return a*b;
		}
	
}
class Operation
{
public static void main(String args[])
	{
		int a=5,b=10;
	
	Addition c=new Addition();
	c.add(a,b);

	Multiplication m=new Multiplication();
	m.mul(a,b);

		Division d=new Division();
		d.div(a,b);
		 Subtraction s=new Subtraction();
		s.sub(a,b);

		System.out.println(a/b);
		System.out.println(a-b);
		System.out.println(a+b);
		System.out.println(a*b);
	}
}