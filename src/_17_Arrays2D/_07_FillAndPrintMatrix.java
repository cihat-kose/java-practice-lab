package _17_Arrays2D;

import java.util.Arrays;

/**
    Görev:
    4x4 boyutunda bir int 2D dizi tanımlayınız, 0'dan 10'a kadar rastgele sayılarla doldurup ekrana yazdırınız.

    İpuçları:
    1. 4 satır ve 4 sütundan oluşan bir matris oluşturun.
    2. Her bir hücreye 0 ile 10 (dahil) arasında rastgele sayılar atayın.
    3. Matrisi ekrana satır satır yazdırın ve ardından tek satır halinde gösterin.

    Örnek Çıktı:
    3 7 1 9
    0 4 8 2
    5 6 3 10
    1 9 7 4

    Dizi içeriği: [[3, 7, 1, 9], [0, 4, 8, 2], [5, 6, 3, 10], [1, 9, 7, 4]]
 */

public class _07_FillAndPrintMatrix {
    public static void main(String[] args) {
        int[][] numberMatrix = new int[4][4];

        // Matrisi rastgele sayılarla doldur ve ekrana yazdır
        for (int row = 0; row < numberMatrix.length; row++) {
            for (int column = 0; column < numberMatrix[row].length; column++) {
                numberMatrix[row][column] = (int) (Math.random() * 11); // 0-10 arası rastgele sayı üret
                System.out.print(numberMatrix[row][column] + " ");
            }
            System.out.println(); // Satır sonu
        }

        System.out.println("******************************************");

        // Dizi içeriğini tek satır halinde yazdır
        System.out.println("Dizi içeriği: " + Arrays.deepToString(numberMatrix));
    }
}