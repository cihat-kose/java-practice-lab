package _17_Arrays2D;

/**
    Görev:
    2 satır ve sırasıyla 3 ve 6 sütundan oluşan bir 2 boyutlu dizi oluşturup,
    bu diziyi FOR DÖNGÜSÜ KULLANMADAN rastgele değerlerle doldurun ve
    elemanlarını FOR DÖNGÜSÜ KULLANARAK ekrana yazdırınız.

    Örnek Çıktı:
    45 78 12
    98 23 67 45 89 10
 */

public class _08_RandomJaggedArray {
    public static void main(String[] args) {
        // 2D dizi tanımlanıyor ve FOR DÖNGÜSÜ KULLANMADAN rastgele değerlerle dolduruluyor
        int[][] randomArray = {
                { (int) (Math.random() * 101), (int) (Math.random() * 101), (int) (Math.random() * 101) },
                { (int) (Math.random() * 101), (int) (Math.random() * 101), (int) (Math.random() * 101),
                        (int) (Math.random() * 101), (int) (Math.random() * 101), (int) (Math.random() * 101) }
        };

        // Dizinin elemanlarını FOR DÖNGÜSÜ KULLANARAK ekrana yazdır
        for (int row = 0; row < randomArray.length; row++) {
            for (int column = 0; column < randomArray[row].length; column++) {
                System.out.print(randomArray[row][column] + " ");
            }
            System.out.println(); // Satır sonu
        }
    }
}