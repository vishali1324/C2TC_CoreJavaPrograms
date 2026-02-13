package Tnsif_d5.Tnsif_d5;

abstract class payment{
	abstract void process_payment(double amount);
}
class credit_card extends payment{
	void process_payment(double amount) {
		System.out.println("Processing credit card payment of ₹" + amount);
	}
	void show() {
		System.out.println("thank you for the payment");
	}
}
class UPI extends payment{
	void process_payment(double amount) {
		System.out.println("Processing UPI payment of ₹" + amount);
	}
	void show() {
		System.out.println("thank you for the payment");
	}
}
public class trying_abstract {
	public static void main(String[] args) {
		credit_card p1=new credit_card ();
		p1.process_payment(5000);
		p1.show();
		
		UPI p2= new UPI();
		p2.process_payment(1000);
		p2.show();	
	}

}

