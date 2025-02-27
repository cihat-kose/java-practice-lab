package _27_Enum._03_WorkingHouse;

public enum DaysOfWeek {
    PAZARTESI("09:00-17:00"),
    SALI("09:00-17:00"),
    CARSAMBA("09:00-17:00"),
    PERSEMBE("09:00-17:00"),
    CUMA("09:00-17:00"),
    CUMARTESI("10:00-14:00"),
    PAZAR("Kapalı");

    private final String workingHours; // Günün çalışma saatleri

    private DaysOfWeek(String workingHours) { // Constructor: Çalışma saatlerini başlatır
        this.workingHours = workingHours;
    }

    public String getWorkingHours() { // Çalışma saatlerini döndüren metot
        return workingHours;
    }
}

