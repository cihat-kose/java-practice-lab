package _14_ForLoop;

/**
   Görev:
   1'den 10'a kadar (10 dahil) olan sayıları ekrana yazdıran,
   ancak 5 sayısına gelindiğinde döngüyü sonlandıran bir for döngüsü oluşturunuz.
*/

public class _02_PrintUntilFive {
    public static void main(String[] args) {
        // Döngü 1'den başlar ve 10 dahil olacak şekilde devam eder.
        for (int i = 1; i <= 10; i++) {
            // Döngü, i 5'e eşit olduğunda sonlandırılır.
            if (i == 5) {
                break; // Döngüden çıkılır.
            }
            System.out.print(i + " ");
        }
    }
}
