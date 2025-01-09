package _10_TernaryOperator;

import java.util.Scanner;

/**
Görev:
Kullanıcıdan bir harf girişi alın ve bu harfin sesli mi yoksa sessiz mi olduğunu belirleyin.
Ternary operator kullanarak sonucu hesaplayın:
- Eğer harf 'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü' ise: "sesli" harf.
- Diğer durumlarda: "sessiz" harf.
*/

public class _05_VowelChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan harf bilgisi alınır
        System.out.print("Bir harf girin: ");
        char harf = input.next().toLowerCase().charAt(0);
        input.close();

        // Ternary operatörü ile harf türü belirlenir
        String sonuc = (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i'
                || harf == 'o' || harf == 'ö' || harf == 'u' || harf == 'ü')
                ? "sesli"
                : "sessiz";

        System.out.println("Girilen harf bir " + sonuc + " harf.");
    }
}
