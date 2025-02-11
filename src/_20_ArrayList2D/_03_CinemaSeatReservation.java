package _20_ArrayList2D;

import java.util.ArrayList;
import java.util.Scanner;

/**
Görev:
Java'da 2D ArrayList kullanarak bir sinema salonu koltuk rezervasyon sistemi oluşturun.

İçerik:
- Kullanıcıdan sinema salonundaki satır ve koltuk sayısını alarak 2D ArrayList oluşturun.
- Kullanıcıya gösterilecek bir ana menü tasarlayın.
- Kullanıcının sinema salonunu görmesini, koltuk rezervasyonu yapmasını veya çıkış yapmasını sağlayın.
- Sinema salonunu ekrana yazdırarak boş koltukları ('O') ve dolu koltukları ('X') gösterin.
- Kullanıcının seçtiği koltuğu rezerve etmesini sağlayın ve dolu koltukları engelleyin.
- Kullanıcı çıkış yapana kadar programın çalışmasını sağlayın.

İpucu:

    1. Sinema Salonunu Oluşturma:
       - Kullanıcıdan sinema salonundaki satır ve koltuk sayılarını alın.
       - 2D ArrayList kullanarak sinema salonunu temsil edin.
       - Başlangıçta tüm koltukları boş ('O') olarak ayarlayın.

    2. Ana Menü ve Kullanıcı İşlemleri:
       - Kullanıcıya aşağıdaki seçenekleri içeren bir menü gösterin:
         1. Sinema salonunun mevcut durumunu görüntüle.
         2. Koltuk rezervasyonu yap.
         3. Çıkış yap.
       - Kullanıcıdan seçimini alarak ilgili işlemi gerçekleştirin.

    3. Sinema Salonunu Gösterme:
       - Sinema salonunun mevcut durumunu ekrana yazdıran bir fonksiyon oluşturun.
       - Her satır ve sütundaki koltukları tarayın.
       - Boş koltukları 'O', rezerve edilmiş koltukları 'X' ile gösterin.

    4. Koltuk Rezervasyonu Yapma:
       - Kullanıcıdan rezervasyon yapmak istediği koltuğun satır ve sütun bilgilerini alın.
       - Girilen bilgilerin geçerli olup olmadığını kontrol edin.
       - Eğer koltuk geçerliyse ve boşsa, rezervasyonu tamamlayın ve kullanıcıya bilgi verin.
       - Koltuk zaten rezerve edilmişse, hata mesajı gösterin.
       - Geçersiz bir satır veya sütun girilirse, kullanıcıya hata mesajı göstererek tekrar giriş yapmasını isteyin.

    5. Program Kontrolü:
       - Kullanıcı çıkış yapana kadar programın çalışmasını sağlayan bir kontrol mekanizması ekleyin.
       - Kullanıcı çıkış yaptığında programdan çıkış mesajı gösterin.
*/

public class _03_CinemaSeatReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan satır ve sütun sayısını alarak sinema salonunu oluşturuyoruz.
        System.out.print("Sinema salonu için satır sayısını giriniz:");
        int rows = scanner.nextInt();
        System.out.print("Sinema salonu için sütun sayısını giriniz:");
        int columns = scanner.nextInt();

        // Sinema salonunu oluşturuyoruz.
        ArrayList<ArrayList<Boolean>> cinemaHall = createCinemaHall(rows, columns);

        // Kullanıcı çıkış yapana kadar programı çalıştıran döngü.
        while (true) {
            // Ana menüyü yazdırıyoruz.
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Sinema salonunu gösterme seçeneği
                    showCinemaHall(cinemaHall);
                    break;
                case 2:
                    // Koltuk rezervasyonu yapma seçeneği
                    reserveSeat(cinemaHall);
                    break;
                case 3:
                    // Çıkış seçeneği
                    System.out.println("Programdan çıkılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyiniz.");
            }
        }
    }

    // Ana menüyü yazdıran fonksiyon
    public static void printMenu() {
        System.out.println("\n---- Ana Menü ---");
        System.out.println("1. Sinema Salonunu Göster");
        System.out.println("2. Koltuk Rezervasyonu Yap");
        System.out.println("3. Çıkış");
        System.out.print("Bir işlem seçin: ");
    }

    // Koltuk rezervasyonu yapan fonksiyon
    public static void reserveSeat(ArrayList<ArrayList<Boolean>> cinemaHall) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nRezervasyon yapmak istediğiniz koltuğun satırını girin:");
        int row = scanner.nextInt() - 1; // Kullanıcıdan alınan satır numarasını 0 indeksli hale getiriyoruz.
        System.out.println("\nRezervasyon yapmak istediğiniz koltuğun sütununu girin:");
        int column = scanner.nextInt() - 1; // Kullanıcıdan alınan sütun numarasını 0 indeksli hale getiriyoruz.

        // Geçerli bir koltuk olup olmadığını kontrol ediyoruz.
        if (isValidSeat(cinemaHall, row, column)) {
            // Koltuğun zaten rezerve edilip edilmediğini kontrol ediyoruz.
            if (!cinemaHall.get(row).get(column)) {
                cinemaHall.get(row).set(column, true); // Koltuğu rezerve ediyoruz.
                System.out.println("Rezervasyonunuz başarıyla tamamlandı!");
            } else {
                System.out.println("Bu koltuk zaten rezerve edilmiş. Lütfen başka bir koltuk seçiniz.");
            }
        } else {
            System.out.println("Geçersiz satır veya sütun numarası. Lütfen geçerli bir koltuk seçin.");
        }
    }

    // Koltuğun geçerli olup olmadığını kontrol eden fonksiyon
    public static boolean isValidSeat(ArrayList<ArrayList<Boolean>> cinemaHall, int row, int column) {
        return row >= 0 && row < cinemaHall.size() && column >= 0 && column < cinemaHall.get(0).size();
    }

    // Sinema salonunu oluşturan fonksiyon
    public static ArrayList<ArrayList<Boolean>> createCinemaHall(int rows, int columns) {
        ArrayList<ArrayList<Boolean>> cinemaHall = new ArrayList<>();
        // Tüm koltukları boş (false) olarak ayarlıyoruz.
        for (int i = 0; i < rows; i++) {
            ArrayList<Boolean> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                row.add(false);
            }
            cinemaHall.add(row);
        }
        return cinemaHall;
    }

    // Sinema salonunu gösteren fonksiyon
    public static void showCinemaHall(ArrayList<ArrayList<Boolean>> cinemaHall) {
        System.out.println("\nSinema Salonu:");
        for (ArrayList<Boolean> row : cinemaHall) {
            for (Boolean seat : row) {
                if (seat) {
                    System.out.print("X "); // Rezerve edilmiş koltukları "X" ile gösteriyoruz.
                } else {
                    System.out.print("O "); // Boş koltukları "O" ile gösteriyoruz.
                }
            }
            System.out.println();
        }
    }
}
