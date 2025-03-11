package _31_Interface._04_Animals;

public class Bird implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("Tweet!"); // Kuşun sesi
    }
}
