package _19_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
    Görev:
    Kullanıcıdan plaka kodu alarak Türkiye'nin illeri arasında sorgu yapan bir program yazın.

    İçerik:
    - Türkiye'nin illerini ve plaka kodlarını içeren bir `ArrayList` oluşturulacaktır.
    - Kullanıcıdan alınan plaka koduna göre ilgili ilin adı bulunacaktır.
    - Kullanıcı "exit" komutuyla programdan çıkış yapabilecektir.
    - İlleri ve plaka kodlarını ekrana yazdırma özelliği dahil edilmiştir.
 */

public class _03_ProvinceSearchByPlate {
    public static void main(String[] args) {
        // 1- ArrayList'in oluşturulması ve Türkiye'nin illeriyle plaka kodlarının eklenmesi.
        ArrayList<String> iller = new ArrayList<>();
        Collections.addAll(iller, "01-Adana", "02-Adıyaman", "03-Afyonkarahisar", "04-Ağrı",
                "05-Amasya", "06-Ankara", "07-Antalya", "08-Artvin", "09-Aydın",
                "10-Balıkesir", "11-Bilecik", "12-Bingöl", "13-Bitlis", "14-Bolu",
                "15-Burdur", "16-Bursa", "17-Çanakkale", "18-Çankırı", "19-Çorum",
                "20-Denizli", "21-Diyarbakır", "22-Edirne", "23-Elazığ", "24-Erzincan",
                "25-Erzurum", "26-Eskişehir", "27-Gaziantep", "28-Giresun", "29-Gümüşhane",
                "30-Hakkari", "31-Hatay", "32-Isparta", "33-Mersin", "34-İstanbul",
                "35-İzmir", "36-Kars", "37-Kastamonu", "38-Kayseri", "39-Kırklareli",
                "40-Kırşehir", "41-Kocaeli", "42-Konya", "43-Kütahya", "44-Malatya",
                "45-Manisa", "46-Kahramanmaraş", "47-Mardin", "48-Muğla", "49-Muş",
                "50-Nevşehir", "51-Niğde", "52-Ordu", "53-Rize", "54-Sakarya", "55-Samsun",
                "56-Siirt", "57-Sinop", "58-Sivas", "59-Tekirdağ", "60-Tokat", "61-Trabzon",
                "62-Tunceli", "63-Şanlıurfa", "64-Uşak", "65-Van", "66-Yozgat", "67-Zonguldak",
                "68-Aksaray", "69-Bayburt", "70-Karaman", "71-Kırıkkale", "72-Batman",
                "73-Şırnak", "74-Bartın", "75-Ardahan", "76-Iğdır", "77-Yalova", "78-Karabük",
                "79-Kilis", "80-Osmaniye", "81-Düzce");

        // 2- İllerin ekrana yazdırılması.
        // Kullanıcıya mevcut illeri ve plaka kodlarını gösteriyoruz.
        System.out.println("Türkiye İlleri ve Plaka Kodları:");
        for (int i = 0; i < iller.size(); i++) {
            String il = iller.get(i);
            System.out.println(il.split("-")[0] + " Plakalı İl: " + il.split("-")[1]);
        }

        // Kullanıcıdan plaka kodunu almak için Scanner oluşturuyoruz.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcı çıkış yapana kadar programı çalıştıran döngü.
        while (true) {
            System.out.print("Plaka Kodunu girin (Çıkış için \"exit\" yazın):");
            String plakaKodu = scanner.nextLine();

            // Kullanıcı "exit" yazarsa programdan çıkılır.
            if (plakaKodu.equalsIgnoreCase("exit")) {
                System.out.println("Program Sonlandırılıyor.");
                break;
            }

            // Kullanıcının girdiği plaka koduna karşılık gelen ili bulmak için bir değişken tanımlıyoruz.
            String bulunanIl = null;

            // 4- Kullanıcının girdiği plaka koduna karşılık gelen ili bulma.
            for (int i = 0; i < iller.size(); i++) {
                String il = iller.get(i);
                if (il.startsWith(plakaKodu + "-")) {  // Örneğin "44-" ile başlayan bir il arıyoruz.
                    bulunanIl = il.split("-")[1];  // Plaka kodunu ayırıp il adını alıyoruz.
                    break;
                }
            }

            // 5- Bulunan ili ekrana yazdırma.
            if (bulunanIl != null) {
                System.out.println("Plaka Kodu " + plakaKodu + " olan il: " + bulunanIl);
            } else {
                System.out.println("Bu plaka koduna ait bir il bulunamadı.");
            }
        }
    }
}
