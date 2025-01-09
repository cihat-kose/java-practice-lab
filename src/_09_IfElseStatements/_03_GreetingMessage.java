package _09_IfElseStatements;

import java.util.Scanner;

/**
Kullanıcının yaşına göre uygun bir selamlama mesajı veren Java programı.
- 18 yaşından küçükler: "Merhaba genç arkadaşım"
- 18-65 yaş arası: "Merhaba saygıdeğer dostum"
- 65 yaşından büyükler: "Merhaba kıymetli büyüğüm"
*/

public class _03_GreetingMessage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = input.nextInt();
        input.close();

        // Yaş gruplarına göre selamlama mesajı belirlenir
        String mesaj;
        if (yas < 18) {
            mesaj = "Merhaba genç arkadaşım";
        } else if (yas < 65) {
            mesaj = "Merhaba saygıdeğer dostum";
        } else {
            mesaj = "Merhaba kıymetli büyüğüm";
        }

        System.out.println(mesaj);
    }
}
