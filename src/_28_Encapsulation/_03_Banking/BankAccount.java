package _28_Encapsulation._03_Banking;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountNumber;
    private double balance;
    private List<Transaction> transactions;

    // Constructor
    public BankAccount(String firstName, String lastName, int accountNumber, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    // Getter metotları
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    // Para yatırma metodu
    public void deposit(String date, String description, double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction(date, description, amount, "Deposit"));
            System.out.println(amount + " TL yatırıldı. Güncel bakiye: " + balance + " TL");
        } else {
            System.out.println("Geçersiz miktar! Pozitif bir değer giriniz.");
        }
    }

    // Para çekme metodu
    public void withdraw(String date, String description, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction(date, description, amount, "Withdrawal"));
            System.out.println(amount + " TL çekildi. Güncel bakiye: " + balance + " TL");
        } else if (amount > balance) {
            System.out.println("Yetersiz bakiye! Çekmek istediğiniz miktar: " + amount + " TL, Güncel bakiye: " + balance + " TL");
        } else {
            System.out.println("Geçersiz miktar! Pozitif bir değer giriniz.");
        }
    }

    // toString metodu ile hesap bilgilerini yazdırma
    @Override
    public String toString() {
        return "Müşteri: " + firstName + " " + lastName +
                ", Hesap No: " + accountNumber +
                ", Bakiye: " + balance + " TL";
    }
}
