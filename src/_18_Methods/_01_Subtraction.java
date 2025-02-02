package _18_Methods;

/**
 * Görev:
 * İki sayının farkını hesaplayan bir metot yazınız.
 *
 * İpuçları:
 * 1. Metot iki parametre almalı (int a, int b).
 * 2. Metot, a ve b'nin farkını döndürmeli.
 * 3. Metodu çağırarak farklı örneklerle test edin.
 */

public class _01_Subtraction {

    /**
     * İki sayının farkını hesaplayan metot.
     *
     * @param a Birinci sayı
     * @param b İkinci sayı
     * @return a ile b'nin farkı (a - b)
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int result1 = subtract(10, 4);
        int result2 = subtract(25, 30);
        int result3 = subtract(100, 50);

        System.out.println("Fark 1: " + result1);
        System.out.println("Fark 2: " + result2);
        System.out.println("Fark 3: " + result3);
    }
}