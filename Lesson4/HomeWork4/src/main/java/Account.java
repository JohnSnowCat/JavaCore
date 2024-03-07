public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Начальный баланс не может быть отрицательным.");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма депозита не может быть отрицательной.");
        }
        this.balance += amount;
        System.out.println("Депозит в размере " + amount + " успешно внесен. Текущий баланс: " + this.balance);
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма снятия не может быть отрицательной.");
        }
        if (amount > this.balance) {
            throw new InsufficientFundsException("Недостаточно средств на счете.", this.balance);
        }
        this.balance -= amount;
        System.out.println("Сумма " + amount + " успешно снята. Текущий баланс: " + this.balance);
    }

    public double getBalance() {
        return balance;
    }
}
