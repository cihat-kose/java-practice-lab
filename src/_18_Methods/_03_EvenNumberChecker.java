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
     * Verilen sayının çift olup olmadığını kontrol eder.
     *
     * @param number Kontrol edilecek sayı
     * @return Eğer sayı çift ise true, tek ise false
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Metodu farklı sayılar ile test eder.
     */
    public static void main(String[] args) {
        int[] testNumbers = {8, 15, 0, -4, 27, -11};

        for (int number : testNumbers) {
            if (isEven(number)) {
                System.out.println(number + " çifttir.");
            } else {
                System.out.println(number + " tektir.");
            }
        }
    }
}