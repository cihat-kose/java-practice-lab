package _16_Arrays;

import java.util.Scanner;
import java.util.Arrays;

/**
 Görev:
 Kullanıcının girdiği bir elemanın dizide olup olmadığını kontrol eden bir program yazınız.

 Örnek Çıktı:
 Dizi elemanları: 10 20 30 40 50
 Aranacak eleman: 30
 Eleman dizide bulundu!
 */

public class _07_SearchElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        // Kullanıcıya dizi elemanlarını göster
        System.out.println("Dizi elemanları: " + Arrays.toString(numbers));

        System.out.print("Aranacak elemanı giriniz: ");
        int searchElement = scanner.nextInt();

        boolean bulundu = false;

        // Dizi içinde kullanıcıdan alınan elemanın varlığını kontrol et
        for (int num : numbers) {
            if (num == searchElement) {
                bulundu = true;
                break;
            }
        }

        if (bulundu) {
            System.out.println("Eleman dizide bulundu!");
        } else {
            System.out.println("Eleman dizide bulunamadı.");
        }

        scanner.close();
    }
}
