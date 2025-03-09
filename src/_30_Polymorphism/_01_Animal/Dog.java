package _30_Polymorphism._01_Animal;

// Dog sınıfı, Animal sınıfından miras alır
public class Dog extends Animal {

    // Dog sınıfı, makeSound metodunu özelleştirir (override)
    @Override
    public void makeSound() {
        System.out.println("Köpek havlıyor.");
    }
}
