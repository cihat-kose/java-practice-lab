package _21_Sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Görev
 * Bir LinkedHashSet oluşturun ve içine bazı ğrenci isimleri ekleyiniz.
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

        /**
         * Java'da Scanner sınıfını kullanırken, nextInt() gibi bir metoddan sonra
         * nextLine() metoduyla bir satır okumak istediğinizde bazen
         * beklenmeyen bir davranışla karşılaşabilirsiniz.
         * Bu durum, nextInt() gibi bir metotla bir tamsayı okuduktan sonra,
         * klavyeden girilen değeri tam olarak almadan bir sonraki satırı okumaya çalıştığınızda ortaya çıkar.
         *
         * Bu sorun, nextInt() metodu bir tamsayı okuduğunda,
         * kullanıcının girdiği sayıyı alırken satır sonunda kalan
         * yeni satır karakterini (\n) almadığından kaynaklanır.
         * Sonuç olarak, nextLine() metodu bu kalan satırı okur ve hemen bir sonraki satıra geçer.
         *
         * Bu sorunu çözmek için, nextInt() veya diğer tamsayı okuma metodlarından sonra
         * nextLine() metodu çağrılmadan önce bir nextLine() çağrısı daha ekleyebilirsiniz.
         * Bu, nextInt()'dan sonra kalan yeni satır karakterini okuyacak ve bir sonraki satıra geçecektir.
         */

        // nextInt()'dan sonra kalan yeni satır karakterini okuyun
        scanner.nextLine();

        // Her öğrenci ismini kullanıcıdan alın ve LinkedHashSet'e ekleyin
        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.print(i + ". öğrencinin ismini giriniz: ");
            String isim = scanner.nextLine();
            ogrenciler.add(isim);
        }

        // LinkedHashSet'i yineleyerek öğrenci isimlerini eklendikleri sıraya göre yazdırın
        // 1. Yöntem: Iterator kullanarak LinkedHashSet'i yineleme
        System.out.println("Öğrenci isimleri eklendikleri sıraya göre (Iterator):");
        Iterator<String> iterator = ogrenciler.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 2. Yöntem: For-each döngüsü kullanarak LinkedHashSet'i yineleme
        System.out.println("Öğrenci isimleri eklendikleri sıraya göre (for-each):");
        for (String isim : ogrenciler) {
            System.out.println(isim);
        }

        // Scanner nesnesini kapatın
        scanner.close();
    }
}
