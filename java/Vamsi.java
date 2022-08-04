package packager.multithreading.java;

class Count extends Thread 
{
	Count()
	{
		System.out.println("My Thread Created");
		start();
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			
			try {
				System.out.println("Main Thread is Alive until Child Thread is alive");
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
			System.out.println(e);
			}
		}
	}

}
public class Vamsi extends Count
{
	public static void main(String[] args) {
		Count cnt=new Count();
		
			while(cnt.isAlive())
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				
		System.out.println(e);
				}
			}
			System.out.println("Main Thread Running is also over");
		}
	}


