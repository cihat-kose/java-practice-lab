package _22_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _00_Intro {
    public static void main(String[] args) {
        // Java Map Nedir?
        // Java'da Map, anahtar-değer çiftlerini saklamak için kullanılan bir veri yapısıdır.
        // Bir anahtar (Key) yalnızca bir kez kullanılabilir ve benzersizdir.
        // Her anahtar, bir değer (Value) ile eşleştirilir.
        // Aynı anahtar tekrar kullanılamaz, ancak farklı anahtarlar aynı değere sahip olabilir.
        // Map, veriye hızlı erişim sağlamak için kullanılır.

        // Map Türleri ve Kullanım Alanları
        // 1. HashMap -> Hızlı erişim sağlar, ancak elemanları belirli bir sırayla saklamaz.
        // 2. TreeMap -> Anahtarları doğal sıralamada saklar, alfabetik veya sayısal sıralama kullanır.
        // 3. LinkedHashMap -> HashMap gibi çalışır ancak ekleme sırasını korur.

        // HashMap - Hızlı erişim, sırasız depolama
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("isim", "Ahmet");
        hashMap.put("soyisim", "Yılmaz");
        hashMap.put("şehir", "İstanbul");
        hashMap.put("ülke", "Türkiye"); // Aynı değer farklı anahtarlarda kullanılabilir.

        // TreeMap - Anahtarları doğal sıralama ile saklar
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("ülke", "Türkiye");
        treeMap.put("başkent", "Ankara");
        treeMap.put("para birimi", "TL");

        // LinkedHashMap - Ekleme sırasına göre elemanları saklar
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Ocak", 31);
        linkedHashMap.put("Şubat", 28);
        linkedHashMap.put("Mart", 31); // Aynı değer tekrar kullanılabilir.

        // Java Map'leri Nasıl Kullanılır?

        // 1. Değer ekleme -> put() metodu ile anahtar-değer eklenir.
        hashMap.put("yaş", "30");

        // 2. Değer erişimi -> get() metodu ile anahtarın karşılık gelen değeri alınır.
        String isim = hashMap.get("isim");

        // 3. Değer güncelleme -> Mevcut bir anahtar varsa, put() metodu ile değeri güncellenir.
        hashMap.put("şehir", "Ankara");

        // 4. Değer silme -> remove() metodu ile belirtilen anahtar kaldırılır.
        hashMap.remove("soyisim");

        // 5. Map boyutu -> size() metodu Map'teki eleman sayısını döndürür.
        int boyut = hashMap.size();

        // 6. Anahtar kontrolü -> containsKey() metodu, belirli bir anahtarın olup olmadığını kontrol eder.
        boolean varMi = hashMap.containsKey("başkent");

        // 7. Değer kontrolü -> containsValue() metodu, belirli bir değerin Map'te olup olmadığını kontrol eder.
        boolean degerVarMi = hashMap.containsValue("Türkiye");

        // 8. Döngülerle Map Elemanlarını Geçmek
        // Tüm anahtar-değer çiftlerini yazdırmak için entrySet() kullanılır.
        System.out.println("\nHashMap İçeriği:");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Anahtar: " + entry.getKey() + " - Değer: " + entry.getValue());
        }

        // 9. Varsayılan Değer Kullanımı (getOrDefault())
        // Eğer belirtilen anahtar yoksa, varsayılan bir değer döndürülür.
        String meslek = hashMap.getOrDefault("meslek", "Bilinmiyor");
        System.out.println("Meslek: " + meslek);

        // 10. Silme ve Temizleme (clear() vs remove())
        // remove() belirli bir anahtarı kaldırırken, clear() tüm elemanları siler.
        hashMap.remove("yaş");
        System.out.println("Yaş bilgisi silindi: " + hashMap);
        hashMap.clear();
        System.out.println("Tüm veriler temizlendi: " + hashMap);

        // 11. Sıralama ve Performans Karşılaştırması
        // TreeMap sıralı olduğu için alfabetik veya sayısal olarak sıralı şekilde döner.
        System.out.println("TreeMap İçeriği (Sıralı): " + treeMap);

        // 12. Map Üzerinde Döngü ile Anahtarları veya Değerleri Alma
        System.out.println("\nHashMap Anahtarları:");
        for (String key : hashMap.keySet()) {
            System.out.println("Anahtar: " + key);
        }

        System.out.println("\nHashMap Değerleri:");
        for (String value : hashMap.values()) {
            System.out.println("Değer: " + value);
        }

        // Sonuçları yazdırma
        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("Map Boyutu: " + boyut);
        System.out.println("Başkent Var mı? " + varMi);
        System.out.println("'Türkiye' Değer Olarak Var mı? " + degerVarMi);
    }
}
