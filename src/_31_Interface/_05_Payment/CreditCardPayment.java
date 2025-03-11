package _31_Interface._05_Payment;

public class CreditCardPayment implements IPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card."); // Kredi kartıyla ödeme
    }
}
