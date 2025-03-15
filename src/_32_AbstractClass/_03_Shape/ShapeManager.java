package _32_AbstractClass._03_Shape;

public class ShapeManager {
    public static void main(String[] args) {
        // Farklı şekillerden nesneler oluşturma
        ShapeBase rectangle = new Rectangle(5, 3);
        ShapeBase circle = new Circle(4);

        // Dikdörtgenin alan ve çevresini hesaplama
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        // Dairenin alan ve çevresini hesaplama
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
    }
}
