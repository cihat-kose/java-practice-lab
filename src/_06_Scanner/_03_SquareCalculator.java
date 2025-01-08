package _06_Scanner;

import java.util.Scanner;

/**
Görev:
Kullanıcıdan bir tamsayı alarak sayının karesini ekrana yazdıran bir program yazın.
*/
public class _03_SquareCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir tamsayı giriniz: ");
        int sayi = input.nextInt();

        int sayiKare = sayi * sayi;

        System.out.println("Girdiğiniz sayının karesi = " + sayiKare + ".");
    }
}
