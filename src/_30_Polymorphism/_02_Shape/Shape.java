package _30_Polymorphism._02_Shape;

// Üst sınıf: Shape
public class Shape {

    // Şekillerin genel bir alan hesaplama metodu (alt sınıflar tarafından override edilecek)
    public void calculateArea() {
        System.out.println("Şeklin alanı hesaplanıyor.");
    }
}
