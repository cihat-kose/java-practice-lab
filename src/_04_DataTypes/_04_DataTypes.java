package _04_DataTypes;

public class _04_DataTypes {
    public static void main(String[] args) {
        // Task 1:
        // 10000003333333 değerinde bir değişken tanımlayın ve 1000 ekleyerek sonucu yazdırın.

        // 🧮 Büyük sayılar için long veri tipi kullanarak bir değişken tanımlıyoruz
        long sayi = 10000003333333L;

        // ➕ Değişkene 1000 ekleyin
        long yeniSayi = sayi + 1000;

        // 🖨️ Yeni değeri ekrana yazdırın
        System.out.println("Guncellenmis sayi = " + yeniSayi);


        // Task 2:
        // Orijinal sayıdan 5000 çıkarın ve sonucu ekrana yazdırın.
        long cikarmaSonuc = sayi - 5000;
        System.out.println("5000 Cikarildiktan Sonra = " + cikarmaSonuc);


        // Task 3:
        // Orijinal sayıyı 2 ile çarpın ve sonucu ekrana yazdırın.
        long carpimSonuc = sayi * 2;
        System.out.println("2 ile carpildiktan sonra = " + carpimSonuc);

        // Task 4:
        // Orijinal sayıyı 100'e bölün ve sonucu ekrana yazdırın.
        long bolumSonuc = sayi / 100;
        System.out.println("100'e bolundukten sonra = " + bolumSonuc);

        // Bonus Görev:
        // Orijinal sayının 300'e bölümünden kalanı hesaplayın ve ekrana yazdırın.
        long kalan = sayi % 300;
        System.out.println("300'e bolumunden kalan = " + kalan);
    }
}
