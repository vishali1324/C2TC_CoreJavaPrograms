package Tnsif_Threading;
class UsingRunnable implements Runnable {

    private	int max, initail;
	private String msg;

	public UsingRunnable(int low, int high, String msg) {
		this.max = high;
		this.initail = low;
		this.msg = msg;
	Thread	thread = new Thread(this, "Child Thread");
		thread.start();
	
	}

	@Override
	public void run() {
		for (int i = initail; i <= max; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Error " + e.getMessage());
			}
			System.out.println(msg + i);
		
		}
		System.out.println("-------------------------------------------------------");
		
		System.out.println("But \"WE WILL WIN ONE DAY!!!\"");
		System.out.println("Hope the Brighter Future and WorkHard for it.");
	}
}
public class UsingRunnableInterface {
	
public static void main(String[] args) throws Exception{
		
			UsingRunnable obj = new UsingRunnable(1,13, "WorkHard Consistency Matters, We may fail ");
		   

			Runnable runnable = new Runnable() {
				@Override
				public void run() { // anonymous class
				//	System.out.println("Runnable with Anonymous Class");
				}
			};
			Thread thread = new Thread(runnable);
			thread.start();
			thread.join();
			
			// lambda expression
			runnable = () -> { 
				//System.out.println("Runnable with Lambda Expression");
			};
			
			new Thread(runnable).start();

			System.out.println("-------------------------------------------------------");
		
		

		}

}
