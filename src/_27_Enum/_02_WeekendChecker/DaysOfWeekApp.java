package _27_Enum._02_WeekendChecker;

public class DaysOfWeekApp {
    public static void main(String[] args) {
        DaysOfWeek today = DaysOfWeek.CUMA; // Enum sabiti kullanımı
        System.out.println("Bugün hafta sonu mu? " + today.isWeekend());
    }
}
