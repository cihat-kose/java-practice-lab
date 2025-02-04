package _18_Methods;

/**
 * Görev:
 * Bir dizideki en büyük değeri bulan bir metot yazınız.
 */

public class _04_MaxValueFinder {

    /**
     * Verilen dizideki en büyük değeri bulan metot.
     *
     * @param numbers İçinde en büyük değeri bulmak istediğimiz dizi
     * @return Dizideki en büyük değer
     */
    public static int maxValue(int[] numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] myNumbers = {2, 4, 6, 8, 10};
        int max = maxValue(myNumbers);

        System.out.println("En büyük değer: " + max);
    }
}