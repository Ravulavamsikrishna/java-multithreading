package packager.multithreading.java;

public class example2 extends Thread  {

	public void run() {

	}


	public static void main(String[] args) {
		Thread obj=new Thread();
		obj.start();
	
	try {

		obj.sleep(100);
	}
	catch (InterruptedException e) {
		System.out.println(e);
	}
	
	obj.setPriority(6);
int priority = obj.getPriority();
System.out.println(priority);
System.out.println("Thread Running");
}
}

