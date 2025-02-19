package _24_StaticNonStaticMethods._01_Calculator;

public class Calculator {

    // İki sayıyı toplayan statik metot
    public static int topla(int number1, int number2) {
        return number1 + number2;
    }

    // İki sayıyı çıkaran statik metot
    public static int fark(int number1, int number2) {
        return number1 - number2;
    }

    // İki sayıyı çarpan non-static metot
    public int carp(int number1, int number2) {
        return number1 * number2;
    }

    // İki sayıyı bölen non-static metot (0'a bölmeyi önlemek için kontrol eklendi)
    public int bol(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Hata: Bir sayı 0'a bölünemez!");
            return 0; // Alternatif olarak exception fırlatılabilir
        }
        return number1 / number2;
    }
}
