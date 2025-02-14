package _16_Arrays;

import java.util.Arrays;

/**
   Görev:
   Bir tamsayı dizisinde tekrar eden elemanları bulan bir program yazınız.

   Örnek Çıktı:
   Tekrar eden elemanlar: 3 2 5
*/

public class _06_FindDuplicateElements {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 3, 2, 8, 5, 5, 5, 6, 3, 2};

        Arrays.sort(numbers); // Diziyi küçükten büyüğe sıralıyoruz

        System.out.print("Tekrar eden elemanlar: ");

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) { // Yan yana aynı eleman varsa
                if (i == 0 || numbers[i] != numbers[i - 1]) { // Daha önce yazdırılmadıysa
                    System.out.print(numbers[i] + " ");
                }
            }
        }
        System.out.println();
    }
}