package _30_Polymorphism._05_Car;

// Car sınıfı, Vehicle sınıfından miras alır
public class Car extends Vehicle {

    // Car sınıfı, startEngine metodunu özelleştirir (override)
    @Override
    public void startEngine() {
        System.out.println("Araba motoru çalışıyor: Vroom Vroom!");
    }
}
