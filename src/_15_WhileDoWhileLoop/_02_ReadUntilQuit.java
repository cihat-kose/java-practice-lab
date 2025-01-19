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

        System.out.println("Metin giriniz (çıkmak için 'quit' yazın): ");
        String giris = input.nextLine();

        while (!giris.equalsIgnoreCase("quit")) {
            System.out.println("Girilen metin: " + giris);
            System.out.println("Metin giriniz (çıkmak için 'quit' yazın): ");
            giris = input.nextLine();
        }

        System.out.println("Program sonlandırıldı.");
        input.close();
    }
}

