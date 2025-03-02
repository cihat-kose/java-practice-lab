package _28_Encapsulation._03_Banking;

public class BankAccountApp {
    public static void main(String[] args) {
        // Yeni bir banka hesabı oluşturuluyor
        BankAccount account = new BankAccount("Ahmet", "Yılmaz", 123456, 5000.0);

        // Para yatırma işlemleri
        account.deposit("22.01.2024", "Maaş yatırma", 3000.0);
        account.deposit("25.01.2024", "Ek gelir", 1500.0);

        // Para çekme işlemleri
        account.withdraw("26.01.2024", "Fatura ödemesi", 2000.0);
        account.withdraw("28.01.2024", "Alışveriş", 700.0);

        // Yetersiz bakiye ile para çekme denemesi
        account.withdraw("29.01.2024", "Araç bakımı", 10000.0);

        // Hesap bilgilerini ekrana yazdırma
        System.out.println("\nHesap Bilgileri:");
        System.out.println(account);

        // Hesap hareketlerini listeleme
        System.out.println("\nHesap Hareketleri:");
        for (Transaction transaction : account.getTransactions()) {
            System.out.println(transaction);
        }
    }
}
