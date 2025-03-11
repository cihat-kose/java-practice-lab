package _31_Interface._04_Animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalApp {
    public static void main(String[] args) {
        // Polimorfizm ile farklı hayvanları aynı listede tutma
        List<IAnimal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());

        // Hayvan seslerini sırayla oynatma
        for (IAnimal animal : animals) {
            animal.makeSound();
        }
    }
}
