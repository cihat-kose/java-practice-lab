package _32_AbstractClass._03_Shape;

public class Circle extends ShapeBase {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Dairenin alanı
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Dairenin çevresi
    }
}
