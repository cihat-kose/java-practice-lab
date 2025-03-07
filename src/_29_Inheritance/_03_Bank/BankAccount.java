package _29_Inheritance._03_Bank;

// BankAccount sınıfı, tüm banka hesaplarının ortak özelliklerini ve metotlarını içerir
public class BankAccount {
    protected int accountNumber;
    protected double balance;

    // Yapıcı metot (constructor)
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Para yatırma metodu
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Yatırılan: " + amount + ". Yeni bakiye: " + balance);
    }

    // Para çekme metodu (alt sınıflarda özelleştirilebilir)
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Yetersiz bakiye: " + amount + " çekilemez.");
        } else {
            balance -= amount;
            System.out.println("Çekilen: " + amount + ". Kalan bakiye: " + balance);
        }
    }
}
