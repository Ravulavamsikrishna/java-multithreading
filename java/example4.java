package packager.multithreading.java;

public class example4 extends Thread {
	 
	 
	    public static void main(String[] args)  
	    {  
	        Thread th1 = new Thread()  
	        {  
	            public void run()  
	            {  
	                System.out.println("Start task one");  
	            }  
	        };
	        Thread th2 = new Thread()  
	        {  
	            public void run()  
	            {  
	                System.out.println("Start task two");  
	            } 
	        };
	        th1.start();  
	        th2.start();  
	    
	        }
}
	    
	        
