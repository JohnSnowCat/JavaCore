public class Program {
    public static void main(String[] args) {
        try {
            Account account1 = new DebitAccount(1000); // Дебетовый счет
            Account account2 = new CreditAccount(500); // Кредитный счет
            System.out.println("Текущий баланс счета 1: " + account1.getBalance());
            System.out.println("Текущий баланс счета 2: " + account2.getBalance());

            double amount = 300;
            System.out.println("Пытаемся перевести " + amount + " со счета 1 на счет 2.");
            Transaction.transfer(account1, account2, amount);

            System.out.println("Текущий баланс счета 1: " + account1.getBalance());
            System.out.println("Текущий баланс счета 2: " + account2.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage() + " Текущий баланс: " + e.getBalance());
        }
    }
}
