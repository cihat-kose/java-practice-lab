package _10_TernaryOperator;

import java.util.Scanner;

/**
Görev:
Kullanıcıdan yaşını girmesini isteyin.
Ternary operator kullanarak yaş kontrolü yapın:
- Eğer kullanıcı 18 veya daha büyükse, "Ehliyet alabilirsiniz." mesajını yazdırın.
- Eğer kullanıcı 18'den küçükse, "Ehliyet alamazsınız." mesajını yazdırın.
Not: Ehliyet almak için minimum yaş 18'dir.
*/

public class _01_DrivingLicenseCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yaş bilgisi alınır
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        input.close();

        // Ternary operator ile yaş kontrolü yapılır
        String mesaj = (yas >= 18) ? "Ehliyet alabilirsiniz." : "Ehliyet alamazsınız.";
        System.out.println(mesaj);
    }
}
