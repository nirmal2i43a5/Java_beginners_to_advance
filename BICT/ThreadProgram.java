class ThreadProgram{
	public static void main(String[] args) {
		 MyThread t1=new  MyThread();//thread-0 means thread 1
		  MyThread t2=new  MyThread();//obj of thread
		//starting thrad 
		  t1.start();
		  t2.start();
		  Thread t=Thread.currentThread();//main thread

		  for(int i=100;i<=105;i++){
			System.out.println(t.getName()+"--value is "+i);//getName() is main thread

			try{
				Thread.sleep(500);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}

	}
}
class MyThread extends Thread    //
{
	public void run(){
		Thread th=Thread.currentThread();    //sub thread 
		for(int i=0;i<=5;i++){
			System.out.println(th.getName()+"--value is "+i);//name of thread is thread1
			try{
				Thread.sleep(500);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}

	}
}

//at first go to main thread and then goto sub thread


