package _30_Polymorphism._04_Bank;

// Üst sınıf: BankAccount
public class BankAccount {

    protected double balance;

    // Yapıcı metot (constructor)
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Para çekme metodu (Alt sınıflar tarafından özelleştirilebilir)
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Çekilen: " + amount + ". Kalan bakiye: " + balance);
    }

    // Para yatırma metodu
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Yatırılan: " + amount + ". Yeni bakiye: " + balance);
    }
}
