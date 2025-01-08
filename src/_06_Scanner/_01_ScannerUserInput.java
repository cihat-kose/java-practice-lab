package _06_Scanner;

import java.util.Scanner;

/**
Görev:
Kullanıcıdan bir isim alarak "Merhaba, {ad}!" mesajı yazdıran bir program yazın.
*/
public class _01_ScannerUserInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İsim giriniz: ");
        String isim = input.nextLine();

        System.out.println("Merhaba, " + isim + "!");
    }
}
