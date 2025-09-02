package _21_Sets;

import java.util.HashSet;
import java.util.Scanner;

/*
Görev:
- Bir HashSet oluşturun.
- Kullanıcıdan 5 farklı kelime alarak HashSet’e ekleyin.
- HashSet’in boyutunu ekrana yazdırın.
- HashSet’in tüm elemanlarını ekrana yazdırın.
- "Java" kelimesinin HashSet içinde olup olmadığını kontrol edin ve sonucu ekrana yazdırın.
*/
public class _01_UniqueWordsHashSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> words = new HashSet<>();

        // Kullanıcıdan 5 kelime al
        for (int i = 0; i < 5; i++) {
            System.out.print("Lütfen bir kelime giriniz: ");
            String word = scanner.nextLine().trim();

            if (word.isEmpty()) {
                System.out.println("Boş giriş yapılamaz! Lütfen geçerli bir kelime girin.");
                i--; // Tekrar denemesi için i azaltılır
            } else if (!words.add(word)) {
                // add() false dönerse kelime zaten vardır
                System.out.println("Bu kelime zaten eklenmişti, tekrar eklenmedi.");
            }
        }

        // HashSet bilgilerini ekrana yazdır
        System.out.println("\nToplam farklı kelime sayısı: " + words.size());
        System.out.println("HashSet içeriği: " + words);

        if (words.contains("Java")) {
            System.out.println("'Java' kelimesi listede mevcut ✅");
        } else {
            System.out.println("'Java' kelimesi listede yok ❌");
        }

        scanner.close();
    }
}
