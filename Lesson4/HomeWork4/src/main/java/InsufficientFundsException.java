public class InsufficientFundsException extends RuntimeException {
    private double balance;

    public InsufficientFundsException(String message, double balance) {
        super(message);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
