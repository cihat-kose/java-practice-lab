package _12_SwitchCase;

import java.util.Scanner;

/**
Görev:
Kullanıcıdan bir gün adı alın ve bu günün hafta içi mi yoksa hafta sonu mu olduğunu belirleyin.
- Pazartesi, Salı, Çarşamba, Perşembe, Cuma: Hafta içi
- Cumartesi, Pazar: Hafta sonu
- Geçersiz bir gün adı girilirse: "Geçersiz gün adı" mesajı gösterin.
*/

public class _02_WeekDayChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan gün bilgisi alınır
        System.out.print("Bir gün adı girin: ");
        String gun = input.nextLine().toLowerCase();
        input.close();

        // Günün türü belirlenir
        String turu;
        switch (gun) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                turu = "hafta içi";
                break;
            case "cumartesi":
            case "pazar":
                turu = "hafta sonu";
                break;
            default:
                turu = "Geçersiz gün adı";
                break;
        }

        String gunFormatted = gun.substring(0, 1).toUpperCase() + gun.substring(1); // İlk harfi büyük yap
        System.out.println(gunFormatted + " " + turu + "dır/dur.");
    }
}
