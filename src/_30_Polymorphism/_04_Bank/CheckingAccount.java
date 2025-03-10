package _30_Polymorphism._04_Bank;

// CheckingAccount sınıfı, BankAccount sınıfından miras alır
public class CheckingAccount extends BankAccount {

    // Yapıcı metot
    public CheckingAccount(double balance) {
        super(balance);
    }

    // Para çekme metodunu özelleştiriyoruz (override)
    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Yetersiz bakiye: " + amount + " çekilemez.");
        } else {
            balance -= amount;
            System.out.println("Çekilen: " + amount + ". Kalan bakiye: " + balance);
        }
    }
}
