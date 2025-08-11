package _15_WhileDoWhileLoop;

import java.util.Scanner;

/**
   Görev:
   Kullanıcıdan "quit" kelimesi girilene kadar metin girişi alan
   ve girilen metinleri ekrana yazdıran bir Java programı yazınız.

   Örnek:
   Metin giriniz: Merhaba
   Girilen metin: Merhaba
   Metin giriniz (çıkmak için 'quit' yazın): Java
   Girilen metin: Java
   Metin giriniz (çıkmak için 'quit' yazın): quit
   Program sonlandırıldı.
*/

public class _02_ReadUntilQuit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String giris;

        while (true) {
            System.out.print("Metin giriniz (çıkmak için 'quit' yazın): ");
            giris = input.nextLine();

            // Çıkış kontrolü
            if (giris.equalsIgnoreCase("quit")) {
                System.out.println("Program sonlandırıldı.");
                break;
            }

            // Girilen metni ekrana yazdır
            System.out.println("Girilen metin: " + giris);
        }

        input.close();
    }
}