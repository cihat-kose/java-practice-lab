package _21_Sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Görev:
 * Bir LinkedHashSet oluşturun ve içine bazı öğrenci isimleri ekleyiniz.
 * Daha sonra LinkedHashSet’i yineleyerek öğrenci isimlerini
 * eklendikleri sıraya göre yazdırınız.
 */
public class _03_OrderedStudentSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bir LinkedHashSet oluşturun
        LinkedHashSet<String> ogrenciler = new LinkedHashSet<>();

        // Kaç öğrenci ekleneceğini kullanıcıdan alın
        System.out.print("Kaç öğrenci eklenecek: ");
        int ogrenciSayisi = scanner.nextInt();
        scanner.nextLine(); // nextInt sonrası boş satırı tüket

        // Öğrenci isimlerini kullanıcıdan al ve LinkedHashSet'e ekle
        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.print(i + ". öğrencinin ismini giriniz: ");
            String isim = scanner.nextLine();
            ogrenciler.add(isim);
        }

        // 1. Yöntem: Iterator ile yazdırma
        System.out.println("\nÖğrenci isimleri (Iterator):");
        Iterator<String> iterator = ogrenciler.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 2. Yöntem: For-each döngüsü ile yazdırma
        System.out.println("\nÖğrenci isimleri (for-each):");
        for (String isim : ogrenciler) {
            System.out.println(isim);
        }

        // scanner.close(); // Derslerde tekrar kullanılabilmesi için isteğe bağlı
    }
}
