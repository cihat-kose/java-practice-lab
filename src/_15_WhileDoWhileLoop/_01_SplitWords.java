package _15_WhileDoWhileLoop;

import java.util.Scanner;

/**
   Görev:
   Kullanıcıdan bir cümle alarak, bu cümledeki her kelimeyi alt alta yazdıran bir program yazınız.

   Örnek:
   Girdi: "Mehmet Ali Yılmaz"
   Çıktı:
   Mehmet
   Ali
   Yılmaz
*/

public class _01_SplitWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir cümle giriniz: ");
        String cumle = scanner.nextLine().trim(); // Baş ve sondaki boşluklar kaldırıldı.

        String kelime = "";
        int i = 0;

        while (i < cumle.length()) {
            char karakter = cumle.charAt(i);

            if (karakter != ' ') {
                kelime += karakter;
            } else {
                System.out.println(kelime);
                kelime = "";
            }
            i++;
        }

        System.out.println(kelime); // Son kelimeyi yazdırır.

        scanner.close();
    }
}
