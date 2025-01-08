package _03_Variables;

public class _03_Variables {

    public static void main(String[] args) {
        // 🎯 Bir sayı tanımlayın ve 20 ile çarpıp sonucu yazdırın
        int sayi = 7;
        int sonuc = sayi * 20;
        System.out.println("Toplam Fiyat = " + sonuc + " TL");

        // 💸 Ondalıklı bir sayı tanımlayın (KDV ekleyelim)
        double fiyat = 45.75;
        double kdvliFiyat = fiyat * 1.20;
        System.out.println("KDV'li Fiyat = " + kdvliFiyat + " TL");

        // 📏 Metin uzunluğunu ölçün
        String sehir = "Trondheim";
        int uzunluk = sehir.length();
        System.out.println("Şehir Adı Uzunluğu = " + uzunluk);

        // 🔄 Boolean değişkeni ters çevirin
        boolean stoktaVarMi = false;
        boolean tersDurum = !stoktaVarMi;
        System.out.println("Ürün Stok Durumu: " + tersDurum);

        // 🎉 ÖDEV: 3 farklı ürün ve fiyatını tanımlayıp toplam fiyatı hesaplayın!
    }
}
