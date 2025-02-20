package _24_StaticNonStaticMethods._02_Rectangle;

public class RectangleApp {
    public static void main(String[] args) {
        // Dikdörtgen sınıfından bir nesne oluşturma
        Rectangle dikdortgen = new Rectangle();

        double uzunluk = 5;
        double genislik = 3;

        // Non-static metot kullanarak alan hesaplama
        double alan = dikdortgen.alanHesapla(uzunluk, genislik);
        System.out.println("Alan = " + alan); // 15

        // Static metot kullanarak çevre hesaplama
        double cevre = Rectangle.cevreHesapla(uzunluk, genislik);
        System.out.println("Çevre = " + cevre); // 16
    }
}
