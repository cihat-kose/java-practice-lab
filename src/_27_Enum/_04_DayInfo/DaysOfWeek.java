package _27_Enum._04_DayInfo;

public enum DaysOfWeek {
    PAZARTESI("09:00-17:00"),
    SALI("09:00-17:00"),
    CARSAMBA("09:00-17:00"),
    PERSEMBE("09:00-17:00"),
    CUMA("09:00-17:00"),
    CUMARTESI("10:00-14:00"),
    PAZAR("Kapalı");

    private final String workingHours; // Günün çalışma saatleri

    DaysOfWeek(String workingHours) { // Constructor: Çalışma saatlerini başlatır
        this.workingHours = workingHours;
    }

    public String getWorkingHours() { // Çalışma saatlerini döndüren metot
        return workingHours;
    }

    public boolean isWeekend() { // Hafta sonu olup olmadığını kontrol eden metot
        return this == CUMARTESI || this == PAZAR;
    }
}
