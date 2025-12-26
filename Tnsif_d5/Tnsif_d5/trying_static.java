package Tnsif_d5.Tnsif_d5;

public class trying_static {

	    static int count = 0;

	    // Static block
	    static {
	        System.out.println("Static block: Initializing...");
	    }

	    // Constructor
	    public trying_static() {
	        count++;
	    }

	    // Static method
	    public static int getCount() {
	        return count;
	    }

	    public static void main(String[] args) {
	        System.out.println("Count before objects: " + trying_static.getCount()); // 0
	        trying_static e1 = new trying_static();
	        trying_static e2 = new trying_static();
	        System.out.println("Count after objects: " + trying_static.getCount()); // 2
	    }
	}

