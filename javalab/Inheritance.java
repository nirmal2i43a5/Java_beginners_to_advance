class Inheritance{
	public static void main(String[] args) {
		Father h=new Father();
		System.out.println("Father");
		System.out.println(h.a);


		Son h1 =new Son();
		System.out.println("Son");
		System.out.println(h1.a);
		System.out.println(h1.b);

		Elder_sister h2=new Elder_sister();
		System.out.println("Elder_sister");
		System.out.println(h2.a);
		System.out.println(h2.b);
		System.out.println(h2.c);
		System.out.println(h2.d);

		Sister h3=new Sister();
		System.out.println("Sister");
		System.out.println(h3.a);
		System.out.println(h3.b);
		System.out.println(h3.c);
	}
}

class Father{
	int a=10;

}

class Son extends Father{
	int b=20;

}

class Sister extends Son{
	int c=30;
}


class Elder_sister extends Sister{
	int d=40;
}




