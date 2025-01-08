package _06_Scanner;

import java.util.Scanner;

public class _01_ScannerUserInput {

    // 1. Task: Kullanıcıdan bir isim alarak ekrana
    // "Merhaba, {ad}!" şeklinde bir çıktı yazdıran bir program yazın.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İsim giriniz: ");
        // String isim2= input.next();  // Tek kelime alır
        String isim = input.nextLine();  // Tüm satırı alır
        System.out.println("Merhaba, " + isim + "!");
    }
}