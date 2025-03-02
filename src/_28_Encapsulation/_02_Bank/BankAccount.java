package _28_Encapsulation._02_Bank;

public class BankAccount {
    private String name;
    private int accountNumber;
    private double balance;

    // Constructor: Banka hesabı oluşturma
    public BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter ve Setter metotları
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Para yatırma metodu
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " TL yatırıldı. Güncel bakiye: " + balance + " TL");
        } else {
            System.out.println("Geçersiz miktar! Pozitif bir değer giriniz.");
        }
    }

    // Para çekme metodu
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " TL çekildi. Güncel bakiye: " + balance + " TL");
        } else if (amount > balance) {
            System.out.println("Yetersiz bakiye! Çekmek istediğiniz miktar: " + amount + " TL, Güncel bakiye: " + balance + " TL");
        } else {
            System.out.println("Geçersiz miktar! Pozitif bir değer giriniz.");
        }
    }
}
