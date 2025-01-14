package _14_ForLoop;

import java.util.Scanner;

/**
   Görev:
   Girilen bir metni tersten yazdıran bir Java programı yazınız.
*/

public class _04_ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin giriniz: ");
        String metin = scanner.nextLine();

        String tersMetin = ""; // Ters çevrilen metni tutmak için boş bir String.

        // Döngü, metni son karakterinden başlayarak ilk karakterine kadar iterasyona alır.
        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.charAt(i); // Her bir karakter tersMetin'e eklenir.
        }

        System.out.println("Metnin ters çevirilmiş hali: " + tersMetin);
    }
}
