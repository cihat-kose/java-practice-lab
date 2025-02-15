package _22_Maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
Görev:
Kullanıcının girdiği bir cümledeki harflerin sayısını hesaplayan bir Java programı yazın.
Program, harfleri alfabetik olarak sıralamalı ve her harfin kaç kez tekrarlandığını yazdırmalıdır.

İçerik:
1. Kullanıcıdan bir cümle alın.
2. Cümlede geçen harfleri sayarak bir TreeMap içinde saklayın.
3. Harf olmayan karakterleri yok sayın.
4. Harfleri küçük harfe çevirerek büyük/küçük harf farkını ortadan kaldırın.
5. Sonuçları alfabetik sıralı şekilde ekrana yazdırın.
*/

public class _02_LetterFrequencyCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Cümle girin: ");
        String cumle = input.nextLine();

        // Harf frekanslarını alfabetik olarak saklamak için TreeMap kullanıyoruz
        Map<Character, Integer> harfSayaci = harfFrekansHesapla(cumle);

        // Sonuçları ekrana yazdır
        System.out.println("\nHarf Sayısı:");
        for (Map.Entry<Character, Integer> entry : harfSayaci.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " adet");
        }

        input.close();
    }

    // Harf frekanslarını hesaplayan metod
    public static Map<Character, Integer> harfFrekansHesapla(String cumle) {
        Map<Character, Integer> harfler = new TreeMap<>();

        for (char harf : cumle.toCharArray()) {
            harf = Character.toLowerCase(harf); // Küçük harfe çevir

            if (Character.isLetter(harf)) { // Sadece harfleri işle
                harfler.put(harf, harfler.getOrDefault(harf, 0) + 1);
            }
        }
        return harfler;
    }
}
