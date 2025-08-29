package _18_Methods;

/**
 * Görev:
 * 3x3 boyutunda bir matris tanımlayarak tüm elemanlarını satır satır ekrana yazdıran bir program yazınız.
 *
 * Örnek Çıktı:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 */
public class _07_Print2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printMatrix(matrix);
    }

    /**
     * Verilen 2D matrisi ekrana düzenli bir şekilde yazdırır.
     *
     * @param matrix Yazdırılacak 2D matris
     */
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // satır sonu
        }
    }
}
