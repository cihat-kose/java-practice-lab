package _29_Inheritance._03_Bank;

// CheckingAccount sınıfı, BankAccount sınıfından miras alır
public class CheckingAccount extends BankAccount {

    // Yapıcı metot (constructor)
    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Para çekme metodunu özelleştiriyoruz (override)
    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Yetersiz bakiye: " + amount + " çekilemez.");
        } else {
            balance -= amount;
            System.out.println("Checking hesabından çekilen: " + amount + ". Kalan bakiye: " + balance);
        }
    }
}
