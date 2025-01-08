package _06_Scanner;

import java.util.Scanner;

public class _02_UserInfoScanner {
    /**
        2. Task: Kullanıcıdan adını ve yaşını alarak ekrana
        "Merhaba, {ad}! {yaş} yaşındasın." şeklinde bir çıktı yazdıran bir program yazın.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan isim alınır
        System.out.println("İsim giriniz: ");
        String isim = input.nextLine();

        // Kullanıcıdan yaş alınır
        System.out.println("Yaşınızı giriniz:");
        int yas = input.nextInt();

        // Konsola selamlama mesajı yazdırılır
        System.out.println("Merhaba, " + isim + "! " + yas + " yaşındasın.");
    }
}
