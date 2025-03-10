package _30_Polymorphism._04_Bank;

public class BankApp {
    public static void main(String[] args) {
        // CheckingAccount ve SavingsAccount nesneleri oluşturuluyor
        BankAccount checkingAccount = new CheckingAccount(1500.0);
        SavingsAccount savingsAccount = new SavingsAccount(5000.0);

        // CheckingAccount üzerinde işlemler
        checkingAccount.deposit(500.0);  // Yatırılan: 500.0. Yeni bakiye: 2000.0
        checkingAccount.withdraw(2500.0);  // Yetersiz bakiye: 2500.0 çekilemez.
        checkingAccount.withdraw(1000.0);  // Çekilen: 1000.0. Kalan bakiye: 1000.0

        // SavingsAccount üzerinde işlemler
        savingsAccount.deposit(1000.0);  // Yatırılan: 1000.0. Yeni bakiye: 6000.0
        savingsAccount.addInterest(5.0);  // Eklenen faiz: 300.0. Yeni bakiye: 6300.0
    }
}
