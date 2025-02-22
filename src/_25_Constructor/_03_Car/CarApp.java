package _25_Constructor._03_Car;

public class CarApp {
    public static void main(String[] args) {
        // 1. Yöntem: displayInfo metodu ile yazdırma
        System.out.println("1. Yöntem: displayInfo metodu ile yazdırma");
        Car car1 = new Car("Toyota", "Corolla", 2020);
        car1.displayInfo();

        Car car2 = new Car("Honda", "Civic", 2019);
        car2.displayInfo();

        // 2. Yöntem: toString metodu ile yazdırma
        System.out.println("2. Yöntem: toString metodu ile yazdırma");
        System.out.println(car1);
        System.out.println(car2);
    }
}
