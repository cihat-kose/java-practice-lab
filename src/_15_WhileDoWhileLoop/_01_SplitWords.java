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

        // Kullanıcıdan cümle girişi
        System.out.print("Lütfen bir cümle giriniz: ");
        String cumle = scanner.nextLine().trim(); // Baş ve sondaki boşlukları kaldır

        String kelime = ""; // Geçici kelime tutucu
        int i = 0;

        // While döngüsü ile tüm karakterleri gez
        while (i < cumle.length()) {
            char karakter = cumle.charAt(i);

            // Boşluk değilse kelimeye ekle
            if (karakter != ' ') {
                kelime += karakter;
            } else {
                // Boşluk varsa o ana kadar biriken kelimeyi yazdır ve sıfırla
                if (!kelime.isEmpty()) {
                    System.out.println(kelime);
                    kelime = "";
                }
            }
            i++;
        }

        // Döngü bittikten sonra son kelimeyi yazdır
        if (!kelime.isEmpty()) {
            System.out.println(kelime);
        }

        scanner.close();
    }
}
