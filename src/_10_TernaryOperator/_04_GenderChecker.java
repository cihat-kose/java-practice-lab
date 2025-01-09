package _10_TernaryOperator;

import java.util.Scanner;

/**
Görev:
Bir kişinin cinsiyetini belirleyen bir program yazın.
Ternary operator kullanarak şu mesajları yazdırın:
- Kullanıcı 'E' veya 'e' girerse: "Erkek"
- Kullanıcı 'K' veya 'k' girerse: "Kadın"
- Geçersiz bir giriş yapılırsa: "Geçersiz giriş"

Kullanıcıdan cinsiyet bilgisi alın ve uygun mesajı ekrana yazdırın.
*/

public class _04_GenderChecker{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan cinsiyet bilgisi alınır
        System.out.print("Cinsiyetinizi giriniz (E/K): ");
        char cinsiyet = input.next().toLowerCase().charAt(0);

        // Ternary operatörü ile cinsiyet belirlenir
        String mesaj = (cinsiyet == 'e')
                ? "Erkek"
                : (cinsiyet == 'k')
                ? "Kadın"
                : "Geçersiz giriş";

        System.out.println(mesaj);
        input.close();
    }
}
