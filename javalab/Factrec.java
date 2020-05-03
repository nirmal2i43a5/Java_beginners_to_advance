// class Factrec{
// 	public static void main(String[] args) {
		
	
// 		Hello o =new Hello();
// 			int n=5;
// 		long fact=o.fact(n);
// 		System.out.println("Factorial is:"+fact);
// 	}
// }
//  class Hello
//  {
//  long fact(int n){
//  	if(n==0||n==1)
//  		return 1;
//  	else
//  		return n*fact(n-1);
//  }
//  }
class Factrec{
	public static void main(String[] args) {
		
		int a=50;
		Hello o =new Hello();
		System.out.println("Main method begin"+a);
		o.print(a);
			System.out.println("Main method ends"+a);
	}
}
class Hello{
	void print(int a){
			System.out.println("Method begin"+a);
		a=a+10;
			System.out.println(" Method ends"+a);
	}
}