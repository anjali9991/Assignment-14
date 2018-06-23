
public class Main {
public static void main(String[] args)
{
	Threads t=new Threads();
	Thread t1=new Thread(t);
	Thread t2=new Thread(t);
	t1.start();
	t2.start();
}
}
