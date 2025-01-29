package _17_Arrays2D;

/**
 * Görev:
 * 3x3 boyutunda bir matris tanımlayarak tüm elemanlarını satır satır ekrana yazdıran bir program yazınız.
 *
 * Örnek Çıktı:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 */

public class _01_Print2DArray {
    public static void main(String[] args) {
        // 3x3 boyutunda bir matris tanımlıyoruz
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Matrisi ekrana yazdırma işlemi
        for (int i = 0; i < matrix.length; i++) { // Satırları geziyoruz
            for (int j = 0; j < matrix[i].length; j++) { // Sütunları geziyoruz
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Her satırdan sonra yeni satıra geç
        }
    }
}