package _27_Enum._02_WeekendChecker;

public enum DaysOfWeek {
    PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR;

    public boolean isWeekend() { // Enum içine metot tanımlama
        return this == CUMARTESI || this == PAZAR;
    }
}
