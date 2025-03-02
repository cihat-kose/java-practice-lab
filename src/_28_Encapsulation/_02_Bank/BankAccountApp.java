package _28_Encapsulation._02_Bank;

public class BankAccountApp {
    public static void main(String[] args) {
        // Banka hesabı oluşturuluyor
        BankAccount account = new BankAccount("Ahmet", 123456, 5000.0);

        // Para yatırma işlemi
        account.deposit(1500.0);

        // Para çekme işlemi
        account.withdraw(500.0);

        // Yetersiz bakiye ile para çekme denemesi
        account.withdraw(7000.0);

        // Negatif değer ile işlem denemesi
        account.deposit(-200);
        account.withdraw(-100);
    }
}
