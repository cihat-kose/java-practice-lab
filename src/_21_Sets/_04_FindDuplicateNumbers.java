package _21_Sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
Görev:
- Kullanıcıdan bir dizi uzunluğu alın.
- Kullanıcının girdiği sayılar ile bir dizi oluşturun.
- Dizinin içinde **yinelenen (tekrarlayan) sayıları** bulun.
- Yinelenen sayıları bir **Set** içinde saklayarak ekrana yazdırın.
*/

public class _04_FindDuplicateNumbers {
    public static void main(String[] args) {
        // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuluyor.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizinin boyutunu alın
        System.out.print("Lütfen dizinin boyutunu giriniz: ");
        int boyut = scanner.nextInt();

        // Kullanıcıdan gelen boyutla bir dizi oluşturun
        int[] sayilar = new int[boyut];

        // Kullanıcıdan dizinin elemanlarını alın
        System.out.println("Lütfen " + boyut + " adet sayı giriniz:");
        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            sayilar[i] = scanner.nextInt();
        }

        // Yinelenen sayıları bulan metodu çağırın
        Set<Integer> yinelenenSayilar = yinelenenleriBul(sayilar);

        // Yinelenen sayıları yazdırın
        System.out.println("Yinelenen Sayılar: " + yinelenenSayilar);

        // Scanner nesnesini kapatın
        scanner.close();
    }

    // Dizide tekrar eden sayıları bulan metot
    public static Set<Integer> yinelenenleriBul(int[] dizi) {
        Set<Integer> yinelenenler = new HashSet<>();
        Set<Integer> tekilElemanlar = new HashSet<>();

        for (int sayi : dizi) {
            // Eğer eleman daha önce eklenmemişse tekilElemanlar setine ekle
            // Eğer eleman zaten eklenmişse yinelenenler setine ekle
            if (!tekilElemanlar.add(sayi)) {
                yinelenenler.add(sayi);
            }
        }
        return yinelenenler;
    }
}







