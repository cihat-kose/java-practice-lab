package _12_SwitchCase;

import java.util.Scanner;

/**
Görev:
Kullanıcıdan bir harf alın ve bu harfin Türk alfabesine göre sesli mi yoksa sessiz mi olduğunu belirleyin.
- Sesli harfler: a, e, ı, i, o, ö, u, ü
- Diğer tüm harfler: sessiz harf
Not: Geçersiz karakterler kontrol edilmemiştir.
*/

public class _03_VowelChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan harf bilgisi alınır
        System.out.print("Bir harf girin: ");
        char harf = input.next().toLowerCase().charAt(0);
        input.close();

        // Harf türü belirlenir
        String harfTuru;
        switch (harf) {
            case 'a':
            case 'e':
            case 'ı':
            case 'i':
            case 'o':
            case 'ö':
            case 'u':
            case 'ü':
                harfTuru = "sesli harf";
                break;
            default:
                harfTuru = "sessiz harf";
                break;
        }

        System.out.println(harf + " bir " + harfTuru + "tir.");
    }
}
