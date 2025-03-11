package _31_Interface._03_Shapes;

public class Rectangle implements IShape {
    private double width;
    private double height;

    // Constructor
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
