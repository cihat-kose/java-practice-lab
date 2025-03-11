package _31_Interface._05_Payment;

import java.util.Scanner;

public class PaymentProcessor {
    public void processPayment(IPayment payment, double amount) {
        payment.pay(amount); // Ödeme işlemi gerçekleştirilir
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter payment amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Select payment method: \n1. Credit Card\n2. PayPal\n3. Bitcoin");
        int choice = scanner.nextInt();

        IPayment paymentMethod;

        switch (choice) {
            case 1:
                paymentMethod = new CreditCardPayment();
                break;
            case 2:
                paymentMethod = new PayPalPayment();
                break;
            case 3:
                paymentMethod = new BitcoinPayment();
                break;
            default:
                System.out.println("Invalid choice, defaulting to Credit Card.");
                paymentMethod = new CreditCardPayment();
        }

        processor.processPayment(paymentMethod, amount);
        scanner.close();
    }
}
