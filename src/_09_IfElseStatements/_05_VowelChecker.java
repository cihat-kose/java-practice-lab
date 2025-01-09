package _09_IfElseStatements;

import java.util.Scanner;

/**
Görev:
Kullanıcıdan bir harf alarak bu harfin sesli veya sessiz olduğunu belirleyen bir program yazın.
Sesli Harfler: a, e, ı, i, o, ö, u, ü
*/

public class _05_VowelChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir harf girin: ");
        char harf = input.next().toLowerCase().charAt(0);
        input.close();

        // Sesli harf kontrolü
        if (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' ||
                harf == 'o' || harf == 'ö' || harf == 'u' || harf == 'ü') {
            System.out.println("Girilen harf bir sesli harf.");
        } else {
            System.out.println("Girilen harf bir sessiz harf.");
        }
    }
}
