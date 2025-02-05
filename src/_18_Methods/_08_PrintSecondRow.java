package _18_Methods;

/**
 * Görev:
 * 3x3 boyutunda bir matrisin 2. satırındaki tüm elemanları ekrana yazdıran bir program yazınız.
 *
 * Örnek Çıktı:
 * 4 5 6
 */

public class _08_PrintSecondRow {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3}, // 1. satır
                {4, 5, 6}, // 2. satır
                {7, 8, 9}  // 3. satır
        };

        // Matrisin 2. satırındaki tüm elemanları yazdır
        printSecondRow(matrix);
    }

    /**
     * Verilen matrisin 2. satırındaki elemanları ekrana yazdırır.
     *
     * @param matrix 2D matris
     */
    private static void printSecondRow(int[][] matrix) {
        for (int i = 0; i < matrix[1].length; i++) {
            System.out.print(matrix[1][i] + " ");
        }
        // Alternatif yöntem:
        // System.out.println(Arrays.toString(matrix[1]));
    }
}