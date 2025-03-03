package _29_Inheritance._01_Animal;

// Dog sınıfı, Animal sınıfından miras alır
public class Dog extends Animal {

    // Constructor (Yapıcı metot)
    public Dog(String name, int age) {
        super(name, age);
    }

    // makeSound metodunu override ederek köpeğe özgü ses çıkarma
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof");
    }
}
