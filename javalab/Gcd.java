class Gcd
{
	public static void main(String[] args) {
		int a=5,b=3;
		Hello o=new Hello();
		int h=o.hcf(a,b);
		System.out.println("Hcf of "+a+" and "+b+"  is:"+h);
	}
}
class Hello {
	int hcf(int a,int b){
		if(b==0)
			return a;
		else
			return hcf(b,a%b);
	}


class Gcd{
	public static void main(String[] args) 
	/{
		for(int i=1;i<=5;i++){
			System.out.print(i);
			System.out.print("+");

		}
		for(int i=4;i>=1;i--){
			System.out.print(i);
			System.out.print("+");
		}
		for(int i=2;i<=5;i++){
			System.out.print(i);
			System.out.print("+");
		}
	}
}
// class Gcd{
// 	public static void main(String[] args) {
// 		for(int i=1;i<=13;i++){
// 			System.out.print(i);
// 			System.out.print("+");
// 		}
// 		for(int i=9;i>=1;i--){
// 			System.out.print(i);
// 			System.out.print("+");
// 		}
// 		for(int i=9;i>=6;i--){
// 			System.out.print(i);
// 			System.out.print("+");
// 		}
// 	}
// }

// PS F:\javalab> javac Gcd.java
// PS F:\javalab> java Gcd
// 1+2+3+4+5+6+7+8+9+10+11+12+13+9+8+7+6+5+4+3+2+1+9+8+7+6+
// PS F:\javalab>


// class Gcd{
// 	public static void main(String[] args) {
// 		int a=1,z=26;
// 		for(int i=a;i<=z;i++){
// 			System.out.print(i);

            
// 		}
// 		System.out.print(nirmal);
// 	}
// }

// class Gcd{
// 	public static void main(String[] args) {
// 		int a[]={1,2,3,4,5};
// 		int b[]={1,2,3};
// 		for(int i=0;i<a.length;i++)
// 		{
// 			for(int j=0;j<b.length;j++)
// 			{

// 				if(a[i]==a[j])
// 				{

// 					System.out.print(a[i]);
// 					i++;
// 											//Interaaction
// 				}
// 				else
// 					break;
// 				
// 			}
// 			
// 		}
// 	}
// }


class Gcd{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int b[]={1,2,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{

				if(a[i]==a[j])
				{
					
					i++;
					continue;							//difference
				}
				else
					break;
				// else
				// 	System.out.print(a[i]);

			}
			System.out.print(a[i])};

		}
	}
}
import java.util.Scanner;
class Gcd{
	public static void main(String[] args) {
		
		System.out.println("Enter character");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next.charAt();
	
 }

}


