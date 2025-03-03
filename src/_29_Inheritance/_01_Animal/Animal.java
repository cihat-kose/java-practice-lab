package _29_Inheritance._01_Animal;

// Hayvanların ortak özelliklerini içeren sınıf
public class Animal {
    protected String name;
    protected int age;

    // Constructor (Yapıcı metot)
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Genel bir ses çıkarma metodu (Alt sınıflar override edebilir)
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
