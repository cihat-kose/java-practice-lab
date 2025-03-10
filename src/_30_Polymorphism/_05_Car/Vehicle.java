package _30_Polymorphism._05_Car;

// Üst sınıf: Vehicle
public class Vehicle {

    // Motor çalıştırma metodu (Alt sınıflar tarafından özelleştirilebilir)
    public void startEngine() {
        System.out.println("Araç motoru çalışıyor.");
    }

    // Motor durdurma metodu
    public void stopEngine() {
        System.out.println("Araç motoru durduruluyor.");
    }
}
