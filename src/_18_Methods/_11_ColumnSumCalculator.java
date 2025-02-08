package _18_Methods;

/**
 * Görev:
 * 3x3 boyutunda bir matrisin her bir sütunundaki elemanların toplamını ekrana yazdıran bir program yazınız.
 *
 * Örnek Çıktı:
 * Sütun 1 toplamı= 12
 * Sütun 2 toplamı= 15
 * Sütun 3 toplamı= 18
 */

public class _11_ColumnSumCalculator {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},  // 1--> 1. sütun (0. index),   2--> 2. sütun (1. index), 3--> 3. sütun (2. index)
                {4, 5, 6},  // 4--> 1. sütun (0. index),   5--> 2. sütun (1. index), 6--> 3. sütun (2. index)
                {7, 8, 9}   // 7--> 1. sütun (0. index),   8--> 2. sütun (1. index), 9--> 3. sütun (2. index)
        };

        // Matrisin her sütunundaki elemanların toplamını yazdır
        printColumnSums(matrix);
    }

    /**
     * Verilen matrisin her sütunundaki elemanların toplamını ekrana yazdırır.
     *
     * @param matrix 2D matris
     */
    private static void printColumnSums(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int toplam = 0;
            for (int j = 0; j < matrix.length; j++) {
                toplam += matrix[j][i];  // Sütun toplamını hesapla
            }
            System.out.println("Sütun " + (i + 1) + " toplamı= " + toplam);
        }
    }
}