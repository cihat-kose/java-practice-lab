package _30_Polymorphism._01_Animal;

// Cat sınıfı, Animal sınıfından miras alır
public class Cat extends Animal {

    // Cat sınıfı, makeSound metodunu özelleştirir (override)
    @Override
    public void makeSound() {
        System.out.println("Kedi miyavlıyor.");
    }
}
