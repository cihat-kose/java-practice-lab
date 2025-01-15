package _14_ForLoop;

import java.util.Scanner;

/**
   Görev:
   Kullanıcıdan bir metin alarak, bu metin içerisinde yer alan
   sesli harflerin sayısını hesaplayan bir Java programı yazınız.

   Sesli harfler: a, e, ı, i, o, ö, u, ü
*/

public class _07_CountVowels {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir metin giriniz: ");
        String metin = input.nextLine().toLowerCase();

        int sesliSayisi = 0; // Sesli harflerin sayısını tutmak için sayaç değişkeni.

        // Döngü, metnin tüm karakterlerini tarar.
        for (int i = 0; i < metin.length(); i++) {
            char harf = metin.charAt(i); // Metnin i. karakteri alınır.

            // Eğer karakter bir sesli harf ise sayaç artırılır.
            if (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' || harf == 'o' || harf == 'ö' || harf == 'u' || harf == 'ü') {
                sesliSayisi++;
            }
        }

        System.out.println("Girdiğiniz metindeki sesli harf sayısı: " + sesliSayisi);
    }
}
