package _17_Arrays2D;

/**
    Görev:
    2 satır ve sırasıyla 3 ve 6 sütundan oluşan bir 2 boyutlu dizi oluşturup,
    bu diziyi FOR DÖNGÜSÜ KULLANARAK rastgele değerlerle doldurun ve elemanlarını ekrana yazdırınız.

    Örnek Çıktı:
    34 89 12
    56 78 90 23 45 67
 */

public class _09_FillJaggedArray {
    public static void main(String[] args) {
        // 2D dizi tanımlanıyor ve satırların sütun sayıları belirleniyor
        int[][] randomArray = new int[2][];
        randomArray[0] = new int[3]; // İlk satırda 3 sütun
        randomArray[1] = new int[6]; // İkinci satırda 6 sütun

        System.out.println("****************");

        // FOR DÖNGÜSÜ KULLANARAK diziyi rastgele değerlerle doldur ve ekrana yazdır
        for (int row = 0; row < randomArray.length; row++) { // Satır sayısı
            for (int column = 0; column < randomArray[row].length; column++) { // Sütun sayısı
                randomArray[row][column] = (int) (Math.random() * 101); // 0-100 arası rastgele değer ata
                System.out.print(randomArray[row][column] + " ");
            }
            System.out.println(); // Satır sonu
        }

        System.out.println("****************");
    }
}