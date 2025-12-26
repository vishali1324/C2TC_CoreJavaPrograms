package HandlingException;
class InvalidBalanceException extends Exception {
    InvalidBalanceException(String msg) {
        super(msg);
    }
}
public class CustomException {
	static void withdraw(int balance) throws InvalidBalanceException {
        if (balance < 1000) {
            throw new InvalidBalanceException("Insufficient balance");
        }
        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {
        try {
            withdraw(1500);
        } catch (InvalidBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
