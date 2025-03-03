package _29_Inheritance._01_Animal;

public class AnimalApp {
    public static void main(String[] args) {
        // Dog nesnesi oluşturuluyor
        Dog dog = new Dog("Max", 5);

        // Cat nesnesi oluşturuluyor
        Cat cat = new Cat("Whiskers", 3);

        // Dog nesnesinin ses çıkarma davranışı
        dog.makeSound();  // Max says: Woof Woof

        // Cat nesnesinin ses çıkarma davranışı
        cat.makeSound();  // Whiskers says: Meow Meow
    }
}
