package _17_Arrays2D;

/**
 * Görev:
 * 3x3 boyutunda bir matrisin her bir sütunundaki elemanların toplamını ekrana yazdıran bir program yazınız.
 *
 * Örnek Çıktı:
 * Sütun 1 toplamı= 12
 * Sütun 2 toplamı= 15
 * Sütun 3 toplamı= 18
 */

public class _05_ColumnSumCalculator {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},  // 1--> 1. sütun (0. index),   2--> 2. sütun (1. index), 3--> 3. sütun (2. index)
                {4, 5, 6},  // 4--> 1. sütun (0. index),   5--> 2. sütun (1. index), 6--> 3. sütun (2. index)
                {7, 8, 9}   // 7--> 1. sütun (0. index),   8--> 2. sütun (1. index), 9--> 3. sütun (2. index)
        };

        for (int i = 0; i < matrix.length; i++) { // Sütunları geziyoruz
            int columnSum = 0; // Her sütun için toplamı sıfırla
            for (int j = 0; j < matrix.length; j++) { // Satırları geziyoruz
                columnSum += matrix[j][i];  // Sütun toplamını hesapla
            }
            System.out.println("Sütun " + (i + 1) + " toplamı= " + columnSum);
        }
    }
}