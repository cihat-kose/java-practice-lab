package _09_IfElseStatements;

import java.util.Scanner;

/**
 Görev: Kullanıcıdan yaşını girmesini isteyin.
 Eğer kullanıcının yaşı 18 veya daha büyükse, "Ehliyet alabilirsiniz."
 mesajı verin. Aksi halde, "Ehliyet alamazsınız." mesajını gösterin.

 Not: Ehliyet almak için gereken minimum yaş 18'dir.
 */
public class _01_DrivingLicenseCheck {

    public static void main(String[] args) {
        // Kullanıcıdan yaş bilgisi alınır
        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        input.close();  // Kaynak sızıntısını önlemek için Scanner kapatılır.

        // Yaş kontrolü yapılır
        if (yas >= 18) {
            System.out.println("Ehliyet alabilirsiniz.");
        } else {
            System.out.println("Ehliyet alamazsınız.");
        }
    }
}
