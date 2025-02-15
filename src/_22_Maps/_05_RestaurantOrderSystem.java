/*
Görev:
Restoran uygulaması geliştirme.
Restoran, kullanıcıların menüden sipariş verebileceği bir uygulama istiyor.

İçerik:
1. Restoranın menüsü, yemek adları ve fiyatlarından oluşan bir HashMap kullanılarak tanımlanmalıdır.
2. Kullanıcıya menüdeki yemekleri ve fiyatlarını gösteren bir liste sunulmalıdır.
3. Kullanıcı, sipariş listesini girmek için programdan giriş yapmalıdır. Siparişler virgülle ayrılmış olarak girilmelidir.
4. Kullanıcının girdiği siparişlerin toplam fiyatı hesaplanarak ekrana yazdırılmalıdır.
5. Kullanıcının siparişlerine uygulanan indirim tutarı hesaplanarak ekrana yazdırılmalıdır.
   - İndirimler, özel tekliflerin bulunduğu bir HashMap ile tanımlanacaktır.
6. Son olarak, toplam tutar hesaplanmalı (toplam fiyat - indirim tutarı) ve ekrana yazdırılmalıdır.
7. Kullanıcının sipariş listesi ekrana yazdırılmalıdır.
*/

package _22_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_RestaurantOrderSystem {
    public static void main(String[] args) {
        // 1. Menü tanımlanıyor
        Map<String, Double> menu = new HashMap<>();
        menu.put("Köfte", 25.99);
        menu.put("Kebap", 35.99);
        menu.put("Pilav", 12.99);
        menu.put("Salata", 8.99);
        menu.put("Tatlı", 15.99);

        // 2. Menüyü ekrana yazdır
        System.out.println("***** İSTANBUL KEBAP EVİ *****");
        System.out.println("*****     HOŞGELDİNİZ    *****\n");
        System.out.println("Menü:");
        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " TL");
        }

        // 3. Kullanıcıdan sipariş listesini al
        Scanner scanner = new Scanner(System.in);
        String[] siparisler;

        // Kullanıcıdan geçerli siparişler alana kadar tekrar istemek için döngü
        while (true) {
            System.out.println("\nSiparişlerinizi giriniz (virgülle ayırarak yazınız): ");
            String siparisListesi = scanner.nextLine();
            siparisler = siparisListesi.split(",");

            // Hatalı siparişleri kontrol et
            boolean hataVar = false;
            for (String siparis : siparisler) {
                if (!menu.containsKey(siparis.trim())) {
                    System.out.println("Hata: '" + siparis.trim() + "' menüde bulunmamaktadır. Lütfen geçerli bir sipariş girin.");
                    hataVar = true;
                }
            }

            // Eğer hata yoksa döngüden çık
            if (!hataVar) break;

            System.out.println("Lütfen sadece menüde bulunan ürünleri seçiniz.");
        }

        // 4. Siparişleri ekrana yazdır
        System.out.println("\nSiparişleriniz:");
        for (String siparis : siparisler) {
            System.out.println("- " + siparis.trim());
        }

        // 5. Siparişlerin toplam fiyatını hesapla
        double toplamFiyat = hesaplaToplamFiyat(menu, siparisler);
        System.out.println("\nToplam Fiyat: " + toplamFiyat + " TL");

        // 6. Siparişlere uygulanan indirimleri tanımla ve hesapla
        Map<String, Double> ozelTeklifler = new HashMap<>();
        ozelTeklifler.put("Kebap", 0.2); // Kebap için %20 indirim
        ozelTeklifler.put("Tatlı", 0.1); // Tatlı için %10 indirim

        double indirimTutari = hesaplaIndirimTutari(menu, ozelTeklifler, siparisler);
        System.out.println("İndirim Tutarı: " + indirimTutari + " TL");

        // 7. Toplam tutarı hesapla (toplam fiyat - indirim tutarı)
        double toplamTutar = toplamFiyat - indirimTutari;
        System.out.println("Ödenecek Tutar: " + toplamTutar + " TL");

        System.out.println("\n***** Afiyet Olsun! *****");
        System.out.println("***** Bizi Tercih Ettiğiniz için Teşekkür Ederiz! *****");

        scanner.close();
    }

    // Sipariş edilen ürünlerin toplam fiyatını hesaplayan metod
    public static double hesaplaToplamFiyat(Map<String, Double> menu, String[] siparisler) {
        double toplam = 0.0;
        for (String siparis : siparisler) {
            siparis = siparis.trim();
            if (menu.containsKey(siparis)) {
                toplam += menu.get(siparis);
            }
        }
        return toplam;
    }

    // Sipariş edilen ürünlere uygulanacak indirimi hesaplayan metod
    public static double hesaplaIndirimTutari(Map<String, Double> menu, Map<String, Double> ozelTeklifler, String[] siparisler) {
        double indirimTutari = 0.0;
        for (String siparis : siparisler) {
            siparis = siparis.trim();
            if (menu.containsKey(siparis) && ozelTeklifler.containsKey(siparis)) {
                double fiyat = menu.get(siparis);
                double indirimOrani = ozelTeklifler.get(siparis);
                indirimTutari += fiyat * indirimOrani;
            }
        }
        return indirimTutari;
    }
}
