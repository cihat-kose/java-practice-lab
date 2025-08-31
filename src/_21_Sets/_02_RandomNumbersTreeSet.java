package _21_Sets;

import java.util.TreeSet;

/**
 * Görev:
 * - Bir TreeSet oluşturun.
 * - 0 ila 100 arasında rastgele 10 sayı ekleyin (tekrarlar olabilir, TreeSet tekrarları almaz).
 * - TreeSet’in ilk ve son elemanlarını ekrana yazdırın.
 * - TreeSet içindeki 20’den küçük ve 80’den büyük elemanları alt kümeler halinde yazdırın.
 */
public class _02_RandomNumbersTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Rastgele sayılar ekle (0–100)
        for (int i = 0; i < 10; i++) {
            int sayi = (int) (Math.random() * 101);
            treeSet.add(sayi);
        }

        // TreeSet'in elemanlarını yazdır (otomatik sıralıdır)
        System.out.println("TreeSet'in elemanları: " + treeSet);

        // İlk ve son eleman
        System.out.println("En küçük eleman (first): " + treeSet.first());
        System.out.println("En büyük eleman (last): " + treeSet.last());

        // headSet ve tailSet ile alt kümeler
        TreeSet<Integer> altKume = new TreeSet<>(treeSet.headSet(20)); // 20'den küçükler
        altKume.addAll(treeSet.tailSet(81)); // 80'den büyükler
        System.out.println("20’den küçük ve 80’den büyük elemanlar: " + altKume);

        // Alternatif yöntem: Döngü
        TreeSet<Integer> altKume2 = new TreeSet<>();
        for (int sayi : treeSet) {
            if (sayi < 20 || sayi > 80) {
                altKume2.add(sayi);
            }
        }
        System.out.println("(Döngü ile) 20’den küçük ve 80’den büyük elemanlar: " + altKume2);
    }
}
