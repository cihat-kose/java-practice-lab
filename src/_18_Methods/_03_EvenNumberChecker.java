package _18_Methods;

/**
 * Görev:
 * Bir sayının çift olup olmadığını kontrol eden bir metot yazınız.
 *
 * İpuçları:
 * 1. Metot, bir tam sayı (int) parametre almalı.
 * 2. Metot, sayı çift ise `true`, tek ise `false` döndürmeli.
 * 3. Metodu farklı girişlerle test edin.
 */

public class _03_EvenNumberChecker {

    /**
     * Verilen sayının çift olup olmadığını kontrol eden metot.
     *
     * @param number Kontrol edilecek sayı
     * @return Eğer sayı çift ise `true`, değilse `false`
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("8 çift mi? " + isEven(8));
        System.out.println("15 çift mi? " + isEven(15));
        System.out.println("0 çift mi? " + isEven(0));
        System.out.println("-4 çift mi? " + isEven(-4));
    }
}