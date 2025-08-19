package _17_Arrays2D;

/**
 * Görev:
 * 3x3 (veya genel olarak R x C) bir matrisin her bir sütunundaki elemanların toplamını ekrana yazdıran program.
 *
 * Örnek Çıktı (3x3):
 * Sütun 1 toplamı= 12
 * Sütun 2 toplamı= 15
 * Sütun 3 toplamı= 18
 */
public class _05_ColumnSumCalculator {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},  // 1→ 1. sütun (0. indeks), 2→ 2. sütun (1. indeks), 3→ 3. sütun (2. indeks)
                {4, 5, 6},  // 4→ 1. sütun (0. indeks), 5→ 2. sütun (1. indeks), 6→ 3. sütun (2. indeks)
                {7, 8, 9}   // 7→ 1. sütun (0. indeks), 8→ 2. sütun (1. indeks), 9→ 3. sütun (2. indeks)
        };

        // Boş matris korunumu (opsiyonel ama güvenli)
        if (matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Matris boş!");
            return;
        }

        int rowCount = matrix.length;        // Satır sayısı
        int colCount = matrix[0].length;     // Sütun sayısı

        for (int c = 0; c < colCount; c++) {        // Sütunları geziyoruz
            int columnSum = 0;                       // Her sütun için toplamı sıfırla
            for (int r = 0; r < rowCount; r++) {     // Satırları geziyoruz
                columnSum += matrix[r][c];           // Sütun toplamını hesapla
            }
            System.out.println("Sütun " + (c + 1) + " toplamı= " + columnSum);
        }
    }
}
