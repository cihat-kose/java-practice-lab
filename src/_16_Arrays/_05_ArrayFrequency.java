package _16_Arrays;

/**
   Görev:
   Bir integer dizisindeki her elemanın frekansını (kaç kere tekrarlandığını) bulan bir program yazınız.

   Örnek Çıktı:
   Elemanların frekansları:
   3 sayısı 3 kere tekrarlandı.
   5 sayısı 2 kere tekrarlandı.
   2 sayısı 2 kere tekrarlandı.
   8 sayısı 1 kere tekrarlandı.
   6 sayısı 1 kere tekrarlandı.
*/

public class _05_ArrayFrequency {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 3, 2, 8, 5, 6, 3, 2};

        // Eleman frekanslarını saklamak için bir dizi tanımlanıyor
        int[] frequency = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    frequency[j] = -1;  // Aynı elemanı tekrar saymamak için işaretleniyor
                }
            }
            if (frequency[i] != -1) {
                frequency[i] = count;  // Elemanın frekansı kaydediliyor
            }
        }

        System.out.println("Elemanların frekansları:");
        for (int i = 0; i < numbers.length; i++) {
            if (frequency[i] != -1) {
                System.out.println(numbers[i] + " sayısı " + frequency[i] + " kere tekrarlandı.");
            }
        }
    }
}
