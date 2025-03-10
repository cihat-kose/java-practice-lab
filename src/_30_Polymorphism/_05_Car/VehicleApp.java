package _30_Polymorphism._05_Car;

public class VehicleApp {
    public static void main(String[] args) {
        // Polymorphism ile üst sınıf referansı kullanarak alt sınıf nesneleri oluşturma
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        // Motor çalışma davranışları
        car.startEngine();  // Araba motoru çalışıyor: Vroom Vroom!
        motorcycle.startEngine();  // Motosiklet motoru çalışıyor: Braap Braap!

        // Motor durdurma işlemleri
        car.stopEngine();  // Araç motoru durduruluyor.
        motorcycle.stopEngine();  // Araç motoru durduruluyor.
    }
}
