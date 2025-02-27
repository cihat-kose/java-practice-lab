package _27_Enum._03_WorkingHouse;

public class DaysOfWeekApp {
    public static void main(String[] args) {
        DaysOfWeek today = DaysOfWeek.CUMA; // Enum sabiti seçimi
        System.out.println("Bugünün çalışma saatleri: " + today.getWorkingHours());
    }
}
