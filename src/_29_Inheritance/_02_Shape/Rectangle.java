package _29_Inheritance._02_Shape;

// Rectangle sınıfı, Shape sınıfından miras alır
public class Rectangle extends Shape {

    // Rectangle'a özel özellikler: uzunluk ve genişlik
    private double length;
    private double width;

    // Yapıcı metot, length ve width değerlerini başlatır
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // calculateArea metodunu özelleştiriyoruz (override)
    @Override
    public void calculateArea() {
        // Rectangle'ın alanı: uzunluk * genişlik
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}
