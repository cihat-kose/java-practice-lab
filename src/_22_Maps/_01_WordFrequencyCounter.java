package _22_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Görev:
Kullanıcının girdiği bir metindeki her kelimenin kaç kez geçtiğini sayan bir Java programı yazın.
Kelime sayıları bir HashMap kullanılarak saklanmalı ve sonuç ekrana yazdırılmalıdır.

İçerik:
1. Kullanıcıdan bir cümle alın.
2. Cümlede geçen kelimeleri ayıklayın ve küçük harfe çevirerek işleyin.
3. Her kelimenin kaç kez geçtiğini hesaplayın.
4. Sonuçları HashMap içinde saklayın ve ekrana yazdırın.
*/

public class _01_WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir cümle girin: ");
        String cumle = input.nextLine();

        // Kelime frekanslarını saklamak için HashMap kullanıyoruz
        Map<String, Integer> kelimeSayaci = kelimeFrekansHesapla(cumle);

        // Sonuçları ekrana yazdır
        System.out.println("\nKelime Sayıları:");
        for (Map.Entry<String, Integer> entry : kelimeSayaci.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        input.close();
    }

    // Metindeki kelime frekanslarını hesaplayan metod
    public static Map<String, Integer> kelimeFrekansHesapla(String cumle) {
        Map<String, Integer> kelimeSayaci = new HashMap<>();
        String[] kelimeler = cumle.split("\\s+"); // Boşluklarla kelimeleri ayır

        for (String kelime : kelimeler) {
            kelime = temizleVeKucult(kelime);
            if (!kelime.isEmpty()) { // Boş stringleri ekleme
                kelimeSayaci.put(kelime, kelimeSayaci.getOrDefault(kelime, 0) + 1);
            }
        }
        return kelimeSayaci;
    }

    // Kelimeleri küçük harfe çeviren ve noktalama işaretlerini temizleyen metod
    public static String temizleVeKucult(String kelime) {
        return kelime.toLowerCase().replaceAll("[^a-zA-Z]", "");
    }
}
