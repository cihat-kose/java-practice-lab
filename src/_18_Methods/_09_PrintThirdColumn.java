package _18_Methods;

/**
 * Görev:
 * 3x3 boyutunda bir matrisin 3. sütunundaki tüm elemanları ekrana yazdıran bir program yazınız.
 *
 * Örnek Çıktı:
 * 3
 * 6
 * 9
 */

public class _09_PrintThirdColumn {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},  // 1. satır
                {4, 5, 6},  // 2. satır
                {7, 8, 9}   // 3. satır
        };

        // Matrisin 3. sütunundaki tüm elemanları yazdır
        printThirdColumn(matrix);
    }

    /**
     * Verilen matrisin 3. sütunundaki elemanları ekrana yazdırır.
     *
     * @param matrix 2D matris
     */
    private static void printThirdColumn(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][2]); // 3. sütun elemanlarını yazdır
        }

        // Alternatif yöntem:
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         if (j == 2) {
        //             System.out.println(matrix[i][j]);
        //         }
        //     }
        // }
    }
}