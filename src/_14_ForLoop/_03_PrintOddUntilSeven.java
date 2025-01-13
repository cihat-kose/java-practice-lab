package _14_ForLoop;

/**
   Görev:
   1'den 10'a kadar olan tek sayıları ekrana yazdıran,
   ancak 7 sayısına gelindiğinde döngüyü sonlandıran bir for döngüsü oluşturunuz.
*/
public class _03_PrintOddUntilSeven {

    public static void main(String[] args) {
        // Döngü 1'den başlar ve 10 dahil olacak şekilde devam eder.
        for (int i = 1; i <= 10; i++) {
            // Çift sayıları atlamak için 'continue' kullanılır.
            if (i % 2 == 0) {
                continue; // Döngünün bu adımı atlanır ve bir sonraki değere geçilir.
            }
            // Döngü, i 7'ye eşit olduğunda sonlandırılır.
            if (i == 7) {
                break; // Döngüden çıkılır.
            }
            System.out.println(i);
        }
    }
}
