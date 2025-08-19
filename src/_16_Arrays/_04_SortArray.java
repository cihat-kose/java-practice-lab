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

        // Orijinal dizi – Yöntem 1 (for-each)
        System.out.print("Orijinal dizi (for-each): ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        // Orijinal dizi – Yöntem 2 (Arrays.toString)
        System.out.println("\nOrijinal dizi (toString): " + Arrays.toString(numbers));

        // Sıralama
        Arrays.sort(numbers);

        // Sıralanmış dizi – Yöntem 1 (for-each)
        System.out.print("Sıralanmış dizi (for-each): ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        // Sıralanmış dizi – Yöntem 2 (Arrays.toString)
        System.out.println("\nSıralanmış dizi (toString): " + Arrays.toString(numbers));
    }
}