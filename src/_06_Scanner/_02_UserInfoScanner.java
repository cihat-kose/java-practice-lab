package _06_Scanner;

import java.util.Scanner;

/**
Görev:
Kullanıcıdan adını ve yaşını alarak ekrana
"Merhaba, {ad}! {yaş} yaşındasın." çıktısı veren bir program yazın.
*/
public class _02_UserInfoScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İsim giriniz: ");
        String isim = input.nextLine();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.println("Merhaba, " + isim + "! " + yas + " yaşındasın.");
    }
}
