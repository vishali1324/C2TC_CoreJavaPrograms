package Tnsif_Threading;


class ChildThread extends Thread {
	private int n;
	private String msg;

	// Constructor
	public ChildThread(int num, String msg) {
		this.n = num;
		this.msg = msg;
	}

	@Override
	public void run() {
		for (int i = 0; i < n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.println("*");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.err.println("Thread interrupted: " + e.getMessage());
			}
			System.out.println(msg + i + " " + Thread.currentThread().getName()); 
			}
		}
	}
} 
class MyChildThread extends Thread {
	@Override
	public void run() {
		System.out.println("In side run() Thread is alive or not? " + this.isAlive());
		int no = 0;
		while (no <= 5) {
			
			System.out.println("number = " + no);
			no++;
			try {
				sleep(500);

			} catch (InterruptedException exp) {
				System.err.println("Thread Interrupted ...");
			}
		}
	}
}
public class UsingThreadClass {

	public static void main(String[] args) throws Exception {

				ChildThread threadOne = new ChildThread(3, "\"Hello\" From First");
				ChildThread threadTwo = new ChildThread(3, "\"Hi\" From Second");

				threadOne.start();
				threadOne.join();
				//threadOne.start(); // throws IllegalStateException
				// threadOne.run(); // single threaded application 
				threadTwo.start();
				threadTwo.join(2000);

				System.out.println("Programs are Running from ChildThread");
				
				
			
				MyChildThread myThread = new MyChildThread();
				System.out.println("Before Runnable stage Thread is alive or not? " + myThread.isAlive());
				myThread.start();
		
				try {
					System.out.println("On Runnable stage Thread is alive or not? " + myThread.isAlive());
					Thread.sleep(4000);
					} catch (InterruptedException exp) {
					System.err.println("Thread is interrupted !");
					} 
				System.out.println("After complete execution of Thread ,it is alive or not? " + myThread.isAlive());
			}
		
	

}
