public class Program {
    public static void main(String[] args) {
        try {
            Account account = new Account(1000); // Начальный баланс счета
            System.out.println("Текущий баланс: " + account.getBalance());
            account.deposit(500); // Внесение депозита
            account.withdraw(200); // Снятие средств
            account.withdraw(2000); // Попытка снять больше, чем есть на счете
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage() + " Текущий баланс: " + e.getBalance());
        }
    }
}
