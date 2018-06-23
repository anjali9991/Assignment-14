
public class Threads implements Runnable{
int i=1;
public synchronized void run(){
	 for(;i<1001;i++)
	 {
		 try {
			 Thread.sleep(50);
		 }
		 catch(InterruptedException e)
		 {
			 System.out.println("Error occured");
		 }
		 System.out.println(Thread.currentThread().getName()+"  "+i);
	 }
}
}
