package _28_Encapsulation._03_Banking;

public class Transaction {
    private final String date;
    private final String description;
    private final double amount;
    private final String transactionType;

    // Constructor
    public Transaction(String date, String description, double amount, String transactionType) {
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    // Getter metotları
    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    // toString metodu ile işlem bilgilerini yazdırma
    @Override
    public String toString() {
        return "Tarih: " + date + ", Açıklama: " + description + ", Miktar: " + amount + " TL, İşlem Türü: " + transactionType;
    }
}
