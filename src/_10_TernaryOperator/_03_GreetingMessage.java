package _10_TernaryOperator;

import java.util.Scanner;

/**
Görev:
Bir kişinin yaşına göre ona uygun bir selamlama mesajı yazdıran bir program yazın.
Ternary operator kullanarak şu mesajları ekrana yazdırın:
- 18 yaşından küçükler için: "Merhaba genç arkadaşım"
- 18-65 yaş arası için: "Merhaba saygıdeğer dostum"
- 65 yaşından büyükler için: "Merhaba kıymetli büyüğüm"

Kullanıcıdan yaş bilgisi alın ve uygun mesajı ekrana yazdırın.
*/

public class _03_GreetingMessage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yaş bilgisi alınır
        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = input.nextInt();
        input.close();

        // Ternary operatörü ile selamlama mesajı belirlenir
        String mesaj = (yas < 18)
                ? "Merhaba genç arkadaşım"
                : (yas < 65)
                ? "Merhaba saygıdeğer dostum"
                : "Merhaba kıymetli büyüğüm";

        System.out.println(mesaj);
    }
}
