// class Lab{
// 	public static void main(String[] args) {
		
// 		Student o=new Student();

// 		 Student o1 =new Student(1,"Nirmal");
// 		 o1.show();
// 	}
// }

// class Student
// {
// 	int id;
// 	String name;
// 	Student()
// 	{
// 		System.out.println("Default constructor");
// 	}

// 	Student(int sid,String sname)
// 	{
// 		id=sid;
// 		name=sname;
		

// 	}
// 	 void show()
// 	 {
// 	 	System.out.println(id+" "+name);
// 	 }
// }

// class Lab1
// {
// 	static int a=1;
	
// 	public static void main(String[] args) {
// 		 Student o=null;
// 		 o.show(a);
// 		 System.out.println("Value of a is ::"+a);
// 	}
// }
// class Student
// {
// 	// static int A;
//  static int show(int a)
//  {
//  	return a;


//  }
// }

// class Lab1{
// 	public static void main(String[] args) {
		
// 		// arr=new int[5];
		
// 		Hello o=new Hello();
// 		o.show(new int[] {1,2,3,4,5});
// 	}
// }
// class Hello{
// 	void show(int[] arr){
// 		int sum=0;
// 		System.out.println("Length of array is  :"+arr.length);
		

// 		for(int i : arr){
// 			sum=sum+i;
// 		}
		
// 		System.out.println("Sum is  ::"+sum);
// 	}
// }

//Call by value
// class Lab{
// 	public static void main(String[] args) {
// 		int a=20;
// 		int b=10;
// 		Value o =new Value();
// 		System.out.println(" Before swap a is "+a+" and b is "+b);
// 		o.show(a,b);
// 		System.out.println("Inside main method");
// 		System.out.println("After swap a is "+a+" and b is "+b);
// 	}
// }
// class Value{
// 	int t;
	
// 	void show(int x,int y)
// 	{
// 		t=x;
// 		x=y;
// 		y=t;
// 		System.out.println("Inside method");
// 		System.out.println("After swap a is "+x+" and b is "+y);
		

// 	}
	

// 
//Call by reference

// class Lab{
// 	public static void main(String[] args) {

// 		Reference h=new Reference();
// 		h.a=10;
// 		h.b=20;
// 		Value o =new Value();

// 		System.out.println(" Before swap a is "+h.a+" and b is "+h.b);
// 		o.show(h,h);
// 		System.out.println("Inside main method");
// 		System.out.println("After swap a is "+h.a+" and b is "+h.b);
// 	}
// }
// class Value{
// 	int t;
	
// 	void show(Reference h1,Reference h2)
// 	{
// 		t=h1.a;
// 		h1.a=h2.b;
// 		h2.b=t;
// 		System.out.println("Inside method");
// 		System.out.println("After swap a is "+h1.a+" and b is "+h2
// 			.b);
// 	}
// }
// class Reference{
// 	int a,b;
// }

// class Overloading
// {
//     public void disp(char c)
//     {
//          System.out.println(c);
//     }
//     public void disp(char c, int num)  
//     {
//          System.out.println(c + " "+num);
//     }
// }
// class Lab
// {
//    public static void main(String args[])
//    {
//        Overloading  obj = new Overloading();
//        obj.disp('a');
//        obj.disp('a',10);
//    }
// }
// class Lab{
// 	public static void main(String[] args) {

// 			System.out.println("Program starts hare");
		
// 		try
// 	{
			
			
// 			System.out.println("This is 3rd ");
		    
// 			catch(Exception e)
// 			{
// 			System.out.println("Step 2's catch block");
// 		    }
// 		finally
// 		   {
// 			System.out.println("Finally block of step 3");

// 		   }
// 	}
// 	catch(Exception e)
// 	{  
// 			System.out.println("ccatch block of second step");

// 			try{
// 				System.out.println("try block of catch block");
// 			}
	
			
// 			catch(Exception e)
// 			{
// 			System.out.println("Catch block of internal try block ");
// 		    }
// 		finally
// 		{
// 			System.out.println("Finally block of main try block");
// 			try{
// 				System.out.println(" try block of finally");
// 			}
	
			
// 			catch(Exception e)
// 			{
// 			System.out.println("catch block of finally");
// 		    }
// 		    finally{
// 		    	System.out.println(" finally block of finally");

// 		    }
// 		    System.out.println("I am out of finally");

// 		}
// 		System.out.println(" Continue after try block");
// 	}
// 	}
// 	}
// }
