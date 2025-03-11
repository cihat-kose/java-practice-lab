package _31_Interface._04_Animals;

public class Cat implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("Meow!"); // Kedinin sesi
    }
}
