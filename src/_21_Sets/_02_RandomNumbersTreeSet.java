package _21_Sets;

import java.util.TreeSet;

/**
Görev:
- Bir TreeSet oluşturun.
- 0 ila 100 arasında rastgele 10 farklı sayı ekleyin.
- TreeSet’in ilk ve son elemanlarını ekrana yazdırın.
- TreeSet’in en küçük ve en büyük elemanlarını ekrana yazdırın.
- TreeSet içindeki 20’den küçük ve 80’den büyük elemanları içeren bir alt küme oluşturup yazdırın.
*/

public class _02_RandomNumbersTreeSet {
    public static void main(String[] args) {
        // Bir TreeSet oluşturun(1 ila 100 arası 10 adet rastgele sayı)
        TreeSet<Integer> treeSet = new TreeSet<>();

        // 1. Yöntem: Math.random() kullanarak rastgele sayılar ekleme
        for (int i = 0; i < 10; i++) {
            int sayi = (int) (Math.random() * 101);
            treeSet.add(sayi);
        }

//         2. Yöntem: Random sınıfını kullanarak rastgele sayılar ekleme
//         Random random = new Random();
//         for (int i = 0; i < 10; i++) {
//         int sayi2= random.nextInt(101);
//         treeSet.add(sayi2);
//         }

        // TreeSet'in elemanlarını yazdırın
        System.out.println("TreeSet'in elemanları: " + treeSet);

        // TreeSet'in ilk ve son elemanlarını yazdırın
        System.out.println("TreeSet'in ilk elemanı: " + treeSet.first());
        System.out.println("TreeSet'in son elemanı: " + treeSet.last());

        // TreeSet'in en küçük ve en büyük elemanlarını yazdırın (ilk ve son zaten bu elemanlardır)
        System.out.println("TreeSet'in en küçük elemanı: " + treeSet.first());
        System.out.println("TreeSet'in en büyük elemanı: " + treeSet.last());

        // TreeSet'in 20'den küçük ve 80'den büyük elemanlarını içeren bir alt kümesini oluşturun

        // 1. Yöntem: headSet() ve tailSet() kullanarak alt küme oluşturma
        // 20'den küçük elemanları içeren bir alt küme oluşturuyoruz.
        // headSet(20) metodu, 20'den küçük tüm elemanları içeren bir NavigableSet döner.
        TreeSet<Integer> altKume = new TreeSet<>(treeSet.headSet(20));

        // 80'den büyük elemanları içeren elemanları mevcut alt kümeye ekliyoruz.
        // tailSet(81) metodu, 81 ve daha büyük tüm elemanları içeren bir NavigableSet döner.
        // Burada 81'i kullanmamızın sebebi, 80'den büyük elemanları almak istememizdir.
        altKume.addAll(treeSet.tailSet(81));

        // Alt kümenin elemanlarını yazdırın
        System.out.println("TreeSet'in 20'den küçük ve 80'den büyük elemanları: " + altKume);

        // 2. Yöntem: Döngü kullanarak alt küme oluşturma
        TreeSet<Integer> altKume2 = new TreeSet<>();
        for (int sayi : treeSet) {
            if (sayi < 20 || sayi > 80) {
                altKume2.add(sayi);
            }
        }
        // Alt kümenin elemanlarını yazdırın
        System.out.println("TreeSet'in 20'den küçük ve 80'den büyük elemanları: " + altKume2);
    }
}
