package _14_ForLoop;

/**
   Görev:
   1'den 7'ye kadar (7 dahil) olan sayıların toplamını toplama tablosu formatında
   yazdıran bir Java programı yazınız.

   Örnek çıktı:

   1 + 1 = 2
   1 + 2 = 3
   1 + 3 = 4
   1 + 4 = 5
   1 + 5 = 6

   2 + 1 = 3
   2 + 2 = 4
   2 + 3 = 5
   2 + 4 = 6
   2 + 5 = 7
   ...
*/

public class _09_AdditionTable {

    public static void main(String[] args) {
        // Dış döngü, 1'den başlayarak 7'ye kadar iterasyon yapar.
        for (int i = 1; i <= 7; i++) {
            // İç döngü, her 'i' değeri için 1'den 5'e kadar iterasyon yapar.
            for (int j = 1; j <= 5; j++) {
                // 'i' ve 'j' değerlerinin toplamı toplama tablosu formatında yazdırılır.
                System.out.println(i + " + " + j + " = " + (i + j));
            }
            System.out.println();
        }
    }
}
