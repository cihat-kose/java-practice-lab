package _27_Enum._05_DiscountSystem;

public enum DaysOfWeek {
    PAZARTESI("09:00-17:00", 10),
    SALI("09:00-17:00", 5),
    CARSAMBA("09:00-17:00", 15),
    PERSEMBE("09:00-17:00", 10),
    CUMA("09:00-17:00", 20),
    CUMARTESI("10:00-14:00", 30),
    PAZAR("Kapalı", 25);

    private final String workingHours;
    private final int discountPercentage;

    DaysOfWeek(String workingHours, int discountPercentage) {
        this.workingHours = workingHours;
        this.discountPercentage = discountPercentage;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public double calculateDiscountedPrice(double originalPrice) {
        return originalPrice - (originalPrice * discountPercentage / 100);
    }
}
