class ReferenceSwap {
	public static void main(String[] args) {

		Var h=new Var();
		h.a=5;
		h.b=10;
		// Var h1=new Var();
		// h1.b=10;
		Hello o=new Hello();
		o.swap(h,h);

		
	}
}

class Hello{
	void swap(Var h1,Var h2){
		int t=h1.a;
		h1.a=h2.b;
		h2.b=t;

		System.out.println("After swaping value of a and b  is "+h1.a+" and "+h2.b+"");
	}
}
class Var{
	int a;
	
	int b;
}
