package _29_Inheritance._02_Shape;

// Circle sınıfı, Shape sınıfından miras alır
public class Circle extends Shape {

    // Circle'a özel bir özellik: yarıçap
    private double radius;

    // Yapıcı metot, radius değerini başlatır
    public Circle(double radius) {
        this.radius = radius;
    }

    // calculateArea metodunu özelleştiriyoruz (override)
    @Override
    public void calculateArea() {
        // Circle'ın alanı: π * r^2
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}
