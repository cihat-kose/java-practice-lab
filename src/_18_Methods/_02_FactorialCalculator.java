package _18_Methods;

/**
 * Görev:
 * Bir sayının faktöriyelini hesaplayan bir metot yazınız.
 *
 * İpuçları:
 * 1. Metot, bir tam sayı (int) parametre almalı.
 * 2. Metot, verilen sayının faktöriyelini hesaplayarak döndürmeli.
 * 3. Metodu farklı girişlerle test edin.
 */

public class _02_FactorialCalculator {

    /**
     * Bir sayının faktöriyelini hesaplayan metot.
     *
     * @param n Faktöriyel hesaplanacak sayı
     * @return n! (n faktöriyelinin sonucu)
     */
    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Negatif sayıların faktöriyeli hesaplanamaz: " + n);
            return -1; // -1: Geçersiz giriş için uyarı değeri
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
        System.out.println("7! = " + factorial(7));
        System.out.println("0! = " + factorial(0)); // 0! = 1 olmalı
        System.out.println("-3! = " + factorial(-3)); // Uyarı mesajı gösterilmeli
    }
}
