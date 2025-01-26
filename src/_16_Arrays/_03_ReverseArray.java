package _16_Arrays;

/**
   Görev:
   Bir integer dizisindeki elemanları ters çeviren bir program yazınız.

   Örnek Çıktı:
   Orijinal dizi: 1 2 3 4 5
   Ters çevrilmiş dizi: 5 4 3 2 1
*/

public class _03_ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Dizinin uzunluğu alınıyor ve ters çevrilmiş dizi oluşturuluyor
        int n = numbers.length;
        int[] reversed = new int[n];

        // Diziyi ters çevirmek için döngü
        for (int i = 0; i < n; i++) {
            reversed[i] = numbers[n - 1 - i];  // Son elemandan başlayarak yeni diziye ekleme
        }

        // Orijinal diziyi ekrana yazdırma
        System.out.print("Orijinal dizi: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Ters çevrilmiş diziyi ekrana yazdırma
        System.out.print("\nTers çevrilmiş dizi: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}