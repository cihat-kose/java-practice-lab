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

            // Boş giriş kabul edilmez
            if (!word.isEmpty()) {
                words.add(word);
            } else {
                System.out.println("Boş giriş yapılamaz! Lütfen geçerli bir kelime girin.");
                i--; // Boş giriş durumunda tekrar et.
            }
        }

        // HashSet bilgilerini ekrana yazdır
        System.out.println("\nHashSet Boyutu: " + words.size());
        System.out.println("HashSet Elemanları: " + words);
        System.out.println("HashSet 'Java' kelimesini içeriyor mu? " + words.contains("Java"));

        scanner.close();
    }
}
