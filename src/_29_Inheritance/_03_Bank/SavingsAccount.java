package _29_Inheritance._03_Bank;

// SavingsAccount sınıfı, BankAccount sınıfından miras alır
public class SavingsAccount extends BankAccount {

    // Yapıcı metot (constructor)
    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // SavingsAccount için withdraw metodu üst sınıftan olduğu gibi miras alındı
}
