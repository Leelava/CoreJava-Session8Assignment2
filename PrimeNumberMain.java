package Session8_Assignment2;

public class PrimeNumberMain {

	public static void main(String[] args) {
		
		ThreadClass thread1 = new ThreadClass();//creating thread class object
		System.out.println("Going to start thread1 using Thread class");
				thread1.start();
        
				
	   RunnableThread runThread = new RunnableThread();
	    Thread thread2 = new Thread(runThread);
	    System.out.println("Going to start thread2 using runnable interface");
	    thread2.start();
	}

}
