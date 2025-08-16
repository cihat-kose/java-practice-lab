package _16_Arrays;

/**
 Görev:
 Bir integer dizisindeki en büyük ve en küçük elemanı bulan bir program yazınız.

 Örnek Çıktı:
 En büyük eleman: 42
 En küçük eleman: 4
 */

public class _01_FindMaxMin {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 7, 19, 42, 5, 26, 4};

        // Eğer dizi boşsa program sonlandırılır
        if (numbers.length == 0) {
            System.out.println("Dizi boş!");
            return;
        }

        int max = numbers[0]; // Başlangıç için ilk eleman
        int min = numbers[0]; // Başlangıç için ilk eleman

        // Dizinin tüm elemanlarını kontrol et
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {   // Daha küçük bir sayı bulundu
                min = numbers[i];
            }
            if (numbers[i] > max) {   // Daha büyük bir sayı bulundu
                max = numbers[i];
            }
        }

        System.out.println("En büyük eleman: " + max);
        System.out.println("En küçük eleman: " + min);
    }
}
