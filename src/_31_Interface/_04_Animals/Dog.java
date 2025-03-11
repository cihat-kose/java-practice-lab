package _31_Interface._04_Animals;

public class Dog implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("Woof!"); // Köpeğin sesi
    }
}
