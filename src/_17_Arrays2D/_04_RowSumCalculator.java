package _17_Arrays2D;

/**
 * Görev:
 * Düzensiz (ragged) bir 2D matrisin her bir satırındaki elemanların toplamını ekrana yazdıran program.
 *
 * Örnek Çıktı:
 * Satır 1 toplamı= 3
 * Satır 2 toplamı= 18
 * Satır 3 toplamı= 24
 */
public class _04_RowSumCalculator {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},         // 1. satır
                {3, 4, 5, 6},   // 2. satır
                {7, 8, 9}       // 3. satır
        };

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0; // Her satır için toplam sıfırlanır
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Satır " + (i + 1) + " toplamı= " + rowSum);
        }
    }
}
