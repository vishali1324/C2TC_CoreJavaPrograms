package Tnsif_d5.Tnsif_d5;

class Parent {
    final void show() {
        System.out.println("Parent show");
    }

    void display(int x) {
        System.out.println("Parent display");
    }
}
//final class cannot be inherited
class Child extends Parent {
    // void show() {} // Error: can't override final method
    void display(int x, int y) { // Overloading, not overriding
        System.out.println("Child display Overloaded");
    }
}

public class trying_final {

	    // Final variable
	    final int MAX_VALUE = 1000;

	    // Static final variable
	    static final double PI = 3.14;

	    public void tryChange() {
	        // MAX_VALUE = 200; // Error: can't change final variable
	        System.out.println("MAX_VALUE: " + MAX_VALUE);
	        System.out.println("PI: " + PI);
	    }

	    // Final method
	    final void display() {
	        System.out.println("This is a final method");
	    }

	    public static void main(String[] args) {
	    	trying_final obj1 = new trying_final();
	    	Child obj2= new Child();
	    	obj2.display(13,12);
	    	obj2.show();
	        obj1.tryChange();
	        obj1.display();
	        
	    }
	}
