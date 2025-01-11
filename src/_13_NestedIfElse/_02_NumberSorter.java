package _13_NestedIfElse;

import java.util.Scanner;

/**
Görev:
Kullanıcıdan 3 farklı sayı alın ve bu sayıları küçükten büyüğe sıralayın.
Eğer sayılar aynı ise: "Yanlış giriş yaptınız. Lütfen farklı sayılar girin." mesajını yazdırın.

Kurallar:
- Girilen sayılar birbirinden farklı olmalıdır.
- Sayılar sıralandıktan sonra sıralamayı "sayi1 < sayi2 < sayi3" formatında ekrana yazdırın.
*/

public class _02_NumberSorter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan 3 sayı alınır
        System.out.println("Üç farklı sayı girin:");
        System.out.print("Birinci Sayı (sayi1): ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci Sayı (sayi2): ");
        int sayi2 = input.nextInt();

        System.out.print("Üçüncü Sayı (sayi3): ");
        int sayi3 = input.nextInt();

        // Sayıların farklı olup olmadığını kontrol edin
        if (sayi1 == sayi2 || sayi1 == sayi3 || sayi2 == sayi3) {
            System.out.println("Yanlış giriş yaptınız. Lütfen farklı sayılar girin.");
        } else {
            // Sayıları sıralama işlemi
            if (sayi1 < sayi2 && sayi1 < sayi3) {
                if (sayi2 < sayi3) {
                    System.out.println("Sıralama: " + sayi1 + " < " + sayi2 + " < " + sayi3);
                } else {
                    System.out.println("Sıralama: " + sayi1 + " < " + sayi3 + " < " + sayi2);
                }
            } else if (sayi2 < sayi1 && sayi2 < sayi3) {
                if (sayi1 < sayi3) {
                    System.out.println("Sıralama: " + sayi2 + " < " + sayi1 + " < " + sayi3);
                } else {
                    System.out.println("Sıralama: " + sayi2 + " < " + sayi3 + " < " + sayi1);
                }
            } else {
                if (sayi1 < sayi2) {
                    System.out.println("Sıralama: " + sayi3 + " < " + sayi1 + " < " + sayi2);
                } else {
                    System.out.println("Sıralama: " + sayi3 + " < " + sayi2 + " < " + sayi1);
                }
            }
        }

        input.close();
    }
}
