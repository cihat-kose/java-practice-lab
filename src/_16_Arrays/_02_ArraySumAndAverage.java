package _16_Arrays;

/**
   Görev:
   Bir integer dizisindeki elemanların toplamını ve ortalamasını hesaplayan bir program yazınız.

   Örnek Çıktı:
   Toplam: 150
   Ortalama: 30.0
*/

public class _02_ArraySumAndAverage {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Toplam: " + sum);
        System.out.println("Ortalama: " + average);
    }
}