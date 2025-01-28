package _16_Arrays;

/**
   Görev:
   Bir tamsayı dizisinde tekrar eden elemanları bulan bir program yazınız.

   Örnek Çıktı:
   Tekrar eden elemanlar: 3 2 5
*/

public class _06_FindDuplicateElements {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 3, 2, 8, 5, 6, 3, 2};
        boolean[] checked = new boolean[numbers.length];

        System.out.print("Tekrar eden elemanlar: ");

        for (int i = 0; i < numbers.length; i++) {
            if (!checked[i]) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        System.out.print(numbers[i] + " ");
                        checked[j] = true;  // Aynı elemanı tekrar yazdırmamak için işaretle
                        break;
                    }
                }
            }
        }
        System.out.println();
    }
}