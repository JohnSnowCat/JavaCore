public class Transaction {
    public static void transfer(Account from, Account to, double amount) {
        try {
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println("Перевод успешно выполнен.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка в транзакции: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка в транзакции: " + e.getMessage());
        }
    }
}
