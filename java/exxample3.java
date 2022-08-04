package packager.multithreading.java;

public class exxample3 extends Thread {
public void run() {
	System.out.println("run the thread");
}

public static void main (String[]args) {
	exxample3 w=new exxample3();
	exxample3 q=new exxample3();
	w.start();
	q.start();
}	
}