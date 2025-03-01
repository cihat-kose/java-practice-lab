package _27_Enum._04_DayInfo;

public class DaysOfWeekApp {
    public static void main(String[] args) {
        DaysOfWeek today = DaysOfWeek.CUMA; // Enum sabiti seçimi

        // Switch-case yapısı kullanarak gün bilgisi işleme
        switch (today) {
            case PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA:
                System.out.println("Bugün hafta içi.");
                break;
            case CUMARTESI, PAZAR:
                System.out.println("Bugün hafta sonu.");
                break;
        }

        // Çalışma saatlerini göster
        System.out.println("Bugünün çalışma saatleri: " + today.getWorkingHours());
    }
}
