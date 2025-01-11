package _13_NestedIfElse;

import java.util.Scanner;

/**
Görev:
1. Kullanıcıdan kullanıcı adı ve şifre alarak giriş işlemini doğrulayan bir program yazın.
2. Eğer:
   - Kullanıcı adı **"Javacan"** ve şifre **"java1001"** ise: "Giriş işlemi başarıyla gerçekleştirildi." mesajını yazdırın.
   - Kullanıcı adı doğru, ancak şifre yanlışsa: Kullanıcıya şifresini sıfırlamak isteyip istemediğini sorun.
     - Şifre sıfırlamak istemezse: "İyi günler dileriz." mesajını yazdırın.
     - Şifre sıfırlamak isterse:
       - Yeni şifre eski şifreyle aynı olmamalıdır.
       - Yeni şifre eski şifreyle aynıysa: "Şifre oluşturulamadı, lütfen başka bir şifre giriniz."
       - Yeni şifre farklıysa: "Şifre oluşturuldu." mesajını yazdırın.
   - Kullanıcı adı yanlışsa: "Bilgileriniz yanlış." mesajını yazdırın.

Not: Geçerli kullanıcı adı: **Javacan**, geçerli şifre: **java1001**
*/

public class _01_LoginSystem {

    public static void main(String[] args) {
        // Geçerli bilgiler
        final String VALID_USERNAME = "Javacan";
        final String VALID_PASSWORD = "java1001";

        // Değişken tanımlamaları
        String kullaniciAdi, sifre, yeniSifre;
        int secim;

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan giriş bilgileri alınır
        System.out.print("Kullanıcı adınız: ");
        kullaniciAdi = input.nextLine();

        System.out.print("Şifreniz: ");
        sifre = input.nextLine();

        // Giriş kontrolü yapılır
        if (kullaniciAdi.equals(VALID_USERNAME) && sifre.equals(VALID_PASSWORD)) {
            System.out.println("Giriş işlemi başarıyla gerçekleştirildi.");
        } else if (kullaniciAdi.equals(VALID_USERNAME)) {
            // Kullanıcı adı doğru, şifre yanlış
            System.out.println("Yanlış şifre; kullanıcı şifrenizi sıfırlamak ister misiniz?");
            System.out.print("1-Evet \n2-Hayır\nSeçiminiz: ");
            secim = input.nextInt();
            input.nextLine(); // Enter tuşunu temizlemek için

            if (secim == 1) {
                // Şifre sıfırlama işlemi
                System.out.print("Yeni şifrenizi giriniz: ");
                yeniSifre = input.nextLine();
                if (yeniSifre.equals(sifre) || yeniSifre.equals(VALID_PASSWORD)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                // Şifre sıfırlamak istemiyorsa
                System.out.println("İyi günler dileriz.");
            }
        } else {
            // Kullanıcı adı yanlışsa
            System.out.println("Bilgileriniz yanlış.");
        }

        input.close();
    }
}
