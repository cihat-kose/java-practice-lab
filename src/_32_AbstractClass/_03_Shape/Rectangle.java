package _32_AbstractClass._03_Shape;

public class Rectangle extends ShapeBase {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height; // Dikdörtgenin alanı
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height); // Dikdörtgenin çevresi
    }
}
