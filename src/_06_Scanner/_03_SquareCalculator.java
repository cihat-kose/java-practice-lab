package _06_Scanner;

import java.util.Scanner;

public class _03_SquareCalculator {

    public static void main(String[] args) {

        /**
            // **3. Task: Kullanıcıdan bir tamsayı alarak,
            sayının karesini ekrana yazdıran bir program yazın.
         */

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan tam sayı girişi al
        System.out.println("Bir tamsayı giriniz: ");
        int sayi = input.nextInt();

        // Sayının karesini hesapla
        int sayiKare = sayi * sayi;

        // Sonucu ekrana yazdır
        System.out.println("Girdiğiniz sayının karesi = " + sayiKare + "'dir.");
    }
}
