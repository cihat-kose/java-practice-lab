package _14_ForLoop;

import java.util.Scanner;

/**
   Görev:
   Kullanıcıdan bir kelime alıp aşağıdaki gibi yazdıran bir Java programı yazınız.
   Örnek:
   Girilen kelime: "Kelime"

   e
   me
   ime
   lime
   elime
   Kelime
*/

public class _06_PrintWordPattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir kelime girin: ");
        String kelime = input.nextLine();

        // Döngü, kelimenin son karakterinden başlayıp başına doğru ilerler.
        for (int i = kelime.length() - 1; i >= 0; i--) {
            // 'substring' metodu, belirtilen indeks aralığındaki kısmı alır ve yazdırır.
            System.out.println(kelime.substring(i));
        }
    }
}
