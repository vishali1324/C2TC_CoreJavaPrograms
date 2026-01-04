package Tnsif_Threading;
class Table {
	    // Synchronized
		synchronized  void printTable(int n) {
			System.out.println("12 Tables");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(n + " x " + i + " = " + (n * i));
	            try {
	                Thread.sleep(500);
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	        System.out.println("ThankYou For Learning");
	    }
	}
class firstThread extends Thread {
	    Table t;

	    firstThread(Table table) {
	        this.t = table;
	    }

	    public void run() {
	        t.printTable(12);
	    }
	}

public class ImpSynchronize {
		public static void main(String[] args) {
	        Table obj = new Table(); // Shared object

	        firstThread t = new firstThread(obj);
	           t.start();
	 
	    }
}