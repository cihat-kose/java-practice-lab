package _17_Arrays2D;

/**
 * Görev:
 * 3x3 boyutunda bir matrisin 3. sütunundaki tüm elemanları ekrana yazdıran bir program yazınız.
 *
 * Örnek Çıktı:
 * 3
 * 6
 * 9
 */

public class _03_PrintThirdColumn {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},  // 1. satır
                {4, 5, 6},  // 2. satır
                {7, 8, 9}   // 3. satır
        };

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][2]); // 3. sütun elemanlarını yazdır
        }
    }
}