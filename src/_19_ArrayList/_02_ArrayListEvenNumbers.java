package _19_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
    Görev:
    Kullanıcıdan 10 adet tam sayı alarak bunları bir ArrayList içinde saklayan ve
    sadece çift sayıları ekrana yazdıran bir program.

    İçerik:
    - Kullanıcıdan sayı girişi almak.
    - Sayıları bir ArrayList içinde saklamak.
    - Yalnızca çift sayıları ekrana yazdırmak.
 */

public class _02_ArrayListEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Kullanıcıdan 10 sayı alıyoruz.
        System.out.println("Lütfen 10 adet tam sayı giriniz:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            numbers.add(scanner.nextInt());
        }

        // Çift sayıları ekrana yazdırıyoruz.
        System.out.println("\nGirilen çift sayılar:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}