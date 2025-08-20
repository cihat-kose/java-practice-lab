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

        // Elemanların frekanslarını tutmak için aynı uzunlukta bir dizi oluşturuluyor
        int[] frequency = new int[numbers.length];

        // Dizideki her eleman için tekrar sayısını bul
        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    frequency[j] = -1; // Bu eleman daha önce sayıldı, tekrar sayılmaması için işaretleniyor
                }
            }
            if (frequency[i] != -1) {
                frequency[i] = count; // Elemanın frekansı kaydediliyor
            }
        }

        // Frekansları yazdır
        System.out.println("Elemanların frekansları:");
        for (int i = 0; i < numbers.length; i++) {
            if (frequency[i] != -1) {
                System.out.println(numbers[i] + " sayısı " + frequency[i] + " kere tekrarlandı.");
            }
        }
    }
}
