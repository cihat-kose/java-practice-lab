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

        // Aynı elemanların yan yana gelmesi için diziyi küçükten büyüğe sıralıyoruz
        Arrays.sort(numbers);

        System.out.print("Tekrar eden elemanlar: ");

        for (int i = 0; i < numbers.length - 1; i++) {
            // Aynı eleman varsa ve bu eleman daha önce yazdırılmadıysa
            if (numbers[i] == numbers[i + 1] && (i == 0 || numbers[i] != numbers[i - 1])) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}