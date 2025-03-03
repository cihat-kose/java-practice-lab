package _29_Inheritance._01_Animal;

// Cat sınıfı, Animal sınıfından miras alır
public class Cat extends Animal {

    // Constructor (Yapıcı metot)
    public Cat(String name, int age) {
        super(name, age);
    }

    // makeSound metodunu override ederek kediye özgü ses çıkarma
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow Meow");
    }
}
