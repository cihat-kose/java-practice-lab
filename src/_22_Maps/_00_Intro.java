package _22_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _00_Intro {
    public static void main(String[] args) {
        // Java'da Map Nedir?
        // Map, anahtar-değer çiftlerini saklar.
        // - Key (anahtar) benzersizdir.
        // - Value (değer) tekrar edebilir.
        // - Aynı key tekrar kullanılamaz, son değer geçerli olur.

        // Map Türleri:
        // 1. HashMap -> Hızlıdır, sırasızdır.
        // 2. TreeMap -> Key'leri sıralar.
        // 3. LinkedHashMap -> Ekleme sırasını korur.

        // HashMap - hızlı erişim, sırasız depolama
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("isim", "Ahmet");
        hashMap.put("soyisim", "Yılmaz");
        hashMap.put("şehir", "İstanbul");
        hashMap.put("ülke", "Türkiye");

        // TreeMap - Key'leri sıralı şekilde tutar
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("ülke", "Türkiye");
        treeMap.put("başkent", "Ankara");
        treeMap.put("para birimi", "TL");

        // LinkedHashMap - ekleme sırasına göre tutar
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Ocak", 31);
        linkedHashMap.put("Şubat", 28);
        linkedHashMap.put("Mart", 31);

        // HashMap üzerinde işlemler
        hashMap.put("yaş", "30"); // ekleme
        String isim = hashMap.get("isim"); // değer okuma
        hashMap.put("şehir", "Ankara"); // güncelleme
        hashMap.remove("soyisim"); // silme
        int boyut = hashMap.size(); // boyut
        boolean varMi = hashMap.containsKey("başkent");
        boolean degerVarMi = hashMap.containsValue("Türkiye");

        // entrySet ile key + value yazdırma
        System.out.println("\nHashMap İçeriği:");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Anahtar: " + entry.getKey() + " - Değer: " + entry.getValue());
        }

        // Varsayılan değer (getOrDefault)
        String meslek = hashMap.getOrDefault("meslek", "Bilinmiyor");
        System.out.println("Meslek: " + meslek);

        // Anahtarlar ve değerler ayrı yazdırma
        System.out.println("\nHashMap Anahtarları:");
        for (String key : hashMap.keySet()) {
            System.out.println("Anahtar: " + key);
        }

        System.out.println("\nHashMap Değerleri:");
        for (String value : hashMap.values()) {
            System.out.println("Değer: " + value);
        }

        // clear() sonrası HashMap boş olur
        hashMap.clear();

        // Sonuçları yazdırma
        System.out.println("\nTreeMap İçeriği (sıralı): " + treeMap);
        System.out.println("LinkedHashMap İçeriği (ekleme sırasına göre): " + linkedHashMap);
        System.out.println("Map Boyutu: " + boyut);
        System.out.println("Başkent Var mı? " + varMi);
        System.out.println("'Türkiye' Değer Olarak Var mı? " + degerVarMi);
    }
}
