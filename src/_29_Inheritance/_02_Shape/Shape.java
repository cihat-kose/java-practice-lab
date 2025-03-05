package _29_Inheritance._02_Shape;

// Shape sınıfı, tüm şekillerin ortak özelliklerini ve metotlarını temsil eder
public class Shape {

    // Ortak bir metot: Alt sınıflarda özelleştirilecek (override edilecek)
    public void calculateArea() {
        System.out.println("Calculating area...");
    }
}
