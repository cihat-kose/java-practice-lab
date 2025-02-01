package _17_Arrays2D;

/**
    Görev:
    3x4 boyutunda bir 2D dizi oluşturun. Diziyi rastgele 0-50 arasında değerlerle doldurun.
    Her satırın ve her sütunun toplamlarını hesaplayarak ekrana yazdırınız.

    Örnek Çıktı:
    Matris:
    10  20  30  40
    5   15  25  35
    8   18  28  38

    Satır Toplamları:
    1. Satır toplamı: 100
    2. Satır toplamı: 80
    3. Satır toplamı: 92

    Sütun Toplamları:
    1. Sütun toplamı: 23
    2. Sütun toplamı: 53
    3. Sütun toplamı: 83
    4. Sütun toplamı: 113
 */

public class _10_RowAndColumnSums {
    public static void main(String[] args) {
        // 3 satır ve 4 sütundan oluşan matris tanımlanıyor
        int[][] matrix = new int[3][4];

        // Matrisi rastgele sayılarla doldur (0-50 arası)
        System.out.println("Matris:");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 51);
                System.out.print(matrix[row][column] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSatır Toplamları:");
        for (int row = 0; row < matrix.length; row++) {
            int rowSum = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                rowSum += matrix[row][column];
            }
            System.out.println((row + 1) + ". Satır toplamı: " + rowSum);
        }

        System.out.println("\nSütun Toplamları:");
        for (int column = 0; column < matrix[0].length; column++) {
            int columnSum = 0;
            for (int row = 0; row < matrix.length; row++) {
                columnSum += matrix[row][column];
            }
            System.out.println((column + 1) + ". Sütun toplamı: " + columnSum);
        }
    }
}