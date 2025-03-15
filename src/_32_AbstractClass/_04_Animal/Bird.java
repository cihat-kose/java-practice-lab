package _32_AbstractClass._04_Animal;

public class Bird extends AnimalBase {
    @Override
    public void makeSound() {
        System.out.println("Tweet!"); // Kuşun sesi
    }
}
