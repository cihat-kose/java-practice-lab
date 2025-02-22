package _25_Constructor._03_Car;

public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor: Aracın bilgilerini ayarlamak için kullanılır
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Aracın bilgilerini ekrana yazdıran metot
    public void displayInfo() {
        System.out.println("Marka: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Üretim Yılı: " + this.year);
        System.out.println();
    }

    // toString metodunu override ederek aracın bilgilerini metin olarak döndürme
    @Override
    public String toString() {
        return "Marka: " + make + ", Model: " + model + ", Üretim Yılı: " + year;
    }
}
