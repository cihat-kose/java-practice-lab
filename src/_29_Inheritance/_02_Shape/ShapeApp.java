package _29_Inheritance._02_Shape;

public class ShapeApp {
    public static void main(String[] args) {
        // Circle nesnesi oluşturuluyor
        Circle circle = new Circle(5.0);

        // Rectangle nesnesi oluşturuluyor
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Circle nesnesinin alanı hesaplanıyor
        circle.calculateArea();  // Circle Area: 78.53981633974483

        // Rectangle nesnesinin alanı hesaplanıyor
        rectangle.calculateArea();  // Rectangle Area: 24.0
    }
}
