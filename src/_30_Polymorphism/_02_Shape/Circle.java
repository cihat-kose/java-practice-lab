package _30_Polymorphism._02_Shape;

// Circle sınıfı, Shape sınıfından miras alır
public class Circle extends Shape {

    private double radius;

    // Yapıcı metot
    public Circle(double radius) {
        this.radius = radius;
    }

    // Circle sınıfı, calculateArea metodunu override eder
    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Dairenin alanı: " + area);
    }
}
