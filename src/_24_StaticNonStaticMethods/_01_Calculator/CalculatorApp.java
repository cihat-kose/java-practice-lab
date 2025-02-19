package _24_StaticNonStaticMethods._01_Calculator;

public class CalculatorApp {
    public static void main(String[] args) {
        // İki tane sayı tanımlayalım
        int sayi1 = 10;
        int sayi2 = 5;

        // Toplama ve çıkarma işlemleri için static metotları kullanıyoruz
        int toplam = Calculator.topla(sayi1, sayi2);
        int fark = Calculator.fark(sayi1, sayi2);

        // Çarpma ve bölme işlemleri için non-static metotları kullanıyoruz
        // Calculator sınıfından bir nesne oluşturma
        Calculator calculator = new Calculator();

        int carpim = calculator.carp(sayi1, sayi2);
        int bolum = calculator.bol(sayi1, sayi2);

        // Sonuçları ekrana yazdırma
        System.out.println("Toplam = " + toplam);  // 15
        System.out.println("Fark = " + fark);      // 5
        System.out.println("Çarpım = " + carpim);  // 50
        System.out.println("Bölüm = " + bolum);    // 2
    }
}
