package _15_WhileDoWhileLoop;

import java.util.Scanner;

/**
   Görev:
   Kullanıcıdan şifre oluşturmasını isteyiniz ve şifreyi iki kez girerek doğrulama yapınız.
   - Şifreler aynı ise "TAMAM" yazdırın, değilse "HATALI ŞİFRE TEKRAR DENEYİNİZ" mesajı verin.
   - Daha sonra login olmasını isteyin, şifre doğru ise "LOGİN BAŞARILI", değilse "ŞİFRE HATALI" yazdırın.
   - Kullanıcı 3 kez yanlış giriş yaparsa programı sonlandırınız.

   Örnek Çıktı:
   Yeni şifrenizi oluşturunuz: 1234
   Şifrenizi tekrar girin: 123
   HATALI ŞİFRE TEKRAR DENEYİNİZ
   Şifrenizi tekrar girin: 1234
   TAMAM
   Login Password: 0000
   ŞİFRE HATALI
   Login Password: 5678
   ŞİFRE HATALI
   Login Password: 1234
   LOGİN BAŞARILI
*/

public class _04_PasswordVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yeni şifrenizi oluşturunuz: ");
        String sifre = scanner.nextLine();

        // Şifre doğrulama kısmı
        int hakSayisi = 0;
        boolean sifreOnaylandi = false;

        while (hakSayisi < 3) {
            System.out.print("Şifrenizi tekrar girin: ");
            String sifreTekrar = scanner.nextLine();

            if (sifre.equals(sifreTekrar)) {
                System.out.println("TAMAM");
                sifreOnaylandi = true;
                break; // Doğru girildiyse çık
            } else {
                System.out.println("HATALI ŞİFRE TEKRAR DENEYİNİZ");
                hakSayisi++;
            }
        }

        // Şifre hiç doğrulanmadıysa programı bitir
        if (!sifreOnaylandi) {
            System.out.println("3 kez hatalı giriş yapıldı. Program sonlandırılıyor.");
            scanner.close();
            return;
        }

        // Login aşaması
        hakSayisi = 0;
        while (hakSayisi < 3) {
            System.out.print("Login Password: ");
            String sifreLogin = scanner.nextLine();

            if (sifreLogin.equals(sifre)) {
                System.out.println("LOGİN BAŞARILI");
                break;
            } else {
                System.out.println("ŞİFRE HATALI");
                hakSayisi++;
            }
        }

        // 3 deneme hakkı bitmişse
        if (hakSayisi == 3) {
            System.out.println("Üç kez yanlış giriş yapıldı. Program sonlandırılıyor.");
        }

        scanner.close();
    }
}