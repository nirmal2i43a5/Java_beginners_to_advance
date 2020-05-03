class InheritanceMethod{
	public static void main(String[] args) {

		Father o=new Father();
		o.m1();

       Son o2=new Son();
       o2.m1();

	}
}

class Father{
	void m1(){
		int a=10;
		System.out.println("Value of a in Father class is"+a+"");

	}

}

class Son extends Father{

	void m1(){
		int b=20;
		System.out.println("Value of a in Son class is"+a+"");
		System.out.println("Value of b in Son class is"+b+"");

	}

}