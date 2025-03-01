package _27_Enum._05_DiscountSystem;

import java.util.Scanner;

public class DiscountCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürünün orijinal fiyatını giriniz: ");
        double originalPrice = scanner.nextDouble();

        DaysOfWeek selectedDay = selectDay();

        double discountedPrice = selectedDay.calculateDiscountedPrice(originalPrice);

        System.out.println("Bugün günlerden: " + selectedDay);
        System.out.println("İndirim oranı: %" + selectedDay.getDiscountPercentage());
        System.out.println("İndirimli fiyat: " + discountedPrice + " TL");
    }

    private static DaysOfWeek selectDay() {
        System.out.println("Gün Seçiniz:");

        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println(day.ordinal() + 1 + ". " + day);
        }

        Scanner scanner = new Scanner(System.in);
        int selection;
        do {
            System.out.print("Seçiminizi yapınız (1-" + DaysOfWeek.values().length + "): ");
            selection = scanner.nextInt();
        } while (selection < 1 || selection > DaysOfWeek.values().length);

        return DaysOfWeek.values()[selection - 1];
    }
}
