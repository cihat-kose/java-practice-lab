package _29_Inheritance._03_Bank;

public class BankApp {
    public static void main(String[] args) {
        // CheckingAccount nesnesi oluşturuluyor
        CheckingAccount checkingAccount = new CheckingAccount(12345, 2000.0);

        // SavingsAccount nesnesi oluşturuluyor
        SavingsAccount savingsAccount = new SavingsAccount(67890, 5000.0);

        // CheckingAccount üzerinde işlemler yapılıyor
        checkingAccount.deposit(500.0);  // Yatırılan: 500.0. Yeni bakiye: 2500.0
        checkingAccount.withdraw(3000.0);  // Yetersiz bakiye: 3000.0 çekilemez.
        checkingAccount.withdraw(1000.0);  // Çekilen: 1000.0. Kalan bakiye: 1500.0

        System.out.println(); // Boşluk eklemek için

        // SavingsAccount üzerinde işlemler yapılıyor
        savingsAccount.deposit(1000.0);  // Yatırılan: 1000.0. Yeni bakiye: 6000.0
        savingsAccount.withdraw(2000.0);  // Çekilen: 2000.0. Kalan bakiye: 4000.0
    }
}
