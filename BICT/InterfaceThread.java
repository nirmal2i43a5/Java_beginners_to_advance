
//Lab 9
class InterfaceThread{
	public static void main(String[] args) {

		Thread t1=new Thread();
		Thread t2=new Thread();
		t1.start();
		t2.start();
		Thread t=Thread.currentThread();
		for(int i=1;i<=10;i++){
			System.out.println(t2.getName()+"+value is "+i);//if i use t1 then it will give priority to t1 and print Thread-0+value is 1-
			//if i use t2.getName()+"+value is "+i then it gives priority to t2 and print Thread-2+value is 1----
			//if i use th.getName()+"+value is "+i then it gives priority to th and print main+value is 1----
			try{
				Thread.sleep(20);

			}
			catch(Exception e){
				e.printStackTrace();
			}
	}
}
}
class MyThread implements Runnable{


	public void run(){
		Thread th=Thread.currentThread();
		for(int i=1;i<=10;i++){
			System.out.println(th.getName()+"+value is "+i);
			try{
				Thread.sleep(500);

			}
			catch(Exception e){
				e.printStackTrace();
			}
		
	}

}
}