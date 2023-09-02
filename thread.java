import java.io.*;
class Example
{
	synchronized static void display()
	{
		Thread g=Thread.currentThread();
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println(g.getName()+":"+i);
			}
			catch(Exception e)
			{}
		}
	}
}

class T extends Thread
{
	public void run()
	{
		Example.display();
	}
}

class TSynch
{
	public static void main(String args[])
	{	
		T t1=new T();
		T t2=new T();
		T t3=new T();
		t1.start();
		t2.start();
		t3.start();
	}
}


		