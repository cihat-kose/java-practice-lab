package _16_Arrays;

import java.util.Arrays;

/**
   Görev:
   Bir integer dizisini küçükten büyüğe sıralayan bir program yazınız.

   Örnek Çıktı:
   Orijinal dizi: 25 17 31 13 2
   Sıralanmış dizi: 2 13 17 25 31
*/

public class _04_SortArray {
    public static void main(String[] args) {
        int[] numbers = {25, 17, 31, 13, 2};

        // Orijinal diziyi ekrana yazdır
        System.out.print("Orijinal dizi: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Diziyi küçükten büyüğe sıralama
        Arrays.sort(numbers);

        // Sıralanmış diziyi ekrana yazdır
        System.out.print("\nSıralanmış dizi: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}