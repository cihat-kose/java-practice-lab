package _06_Scanner;

import java.util.Scanner;

/*
Görev:
Kullanıcıdan iki tamsayı alarak bu sayıların toplamını, farkını ve çarpımını ekrana yazdıran bir program yazın.
*/
public class _04_ArithmeticOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Birinci tamsayıyı al
        System.out.print("Birinci tamsayıyı giriniz: ");
        int sayi1 = input.nextInt();

        // İkinci tamsayıyı al
        System.out.print("İkinci tamsayıyı giriniz: ");
        int sayi2 = input.nextInt();

        // Aritmetik işlemler
        int toplam = sayi1 + sayi2;
        int fark = sayi1 - sayi2;
        int carpim = sayi1 * sayi2;

        // Sonuçları ekrana yazdır
        System.out.println("Toplam = " + toplam);
        System.out.println("Fark = " + fark);
        System.out.println("Çarpım = " + carpim);
    }
}
