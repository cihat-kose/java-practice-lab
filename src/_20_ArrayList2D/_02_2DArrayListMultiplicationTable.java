package _20_ArrayList2D;

import java.util.ArrayList;

/**
    Görev:
    2D ArrayList kullanarak 3x3 çarpım tablosu oluşturup, ekrana yazdıran programı yazınız.

    İçerik:
    - 3x3 boyutunda bir 2D ArrayList oluşturma.
    - Çarpım tablosunu oluşturup ekrana yazdırma.
 */

public class _02_2DArrayListMultiplicationTable {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> multiplicationTable = new ArrayList<>();

        // 3x3 çarpım tablosunu dolduruyoruz.
        for (int i = 1; i <= 3; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 1; j <= 3; j++) {
                row.add(i * j);
            }
            multiplicationTable.add(row);
        }

        // Çarpım tablosunu ekrana yazdırıyoruz.
        System.out.println("3x3 Çarpım Tablosu:");
        for (ArrayList<Integer> row : multiplicationTable) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
