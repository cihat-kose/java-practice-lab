package _24_StaticNonStaticMethods._02_Rectangle;

public class Rectangle {

    // İki sayıyı çarpan non-static metot (alan hesaplama)
    public double alanHesapla(double uzunluk, double genislik) {
        return uzunluk * genislik;
    }

    // İki sayıyı toplayıp iki ile çarpan static metot (çevre hesaplama)
    public static double cevreHesapla(double uzunluk, double genislik) {
        return (uzunluk + genislik) * 2;
    }
}
