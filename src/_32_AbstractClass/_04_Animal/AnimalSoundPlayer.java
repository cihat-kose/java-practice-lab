package _32_AbstractClass._04_Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalSoundPlayer {
    public static void main(String[] args) {
        // Farklı hayvan nesnelerinin tutulduğu bir liste oluşturma
        List<AnimalBase> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());

        // Polimorfizm ile hayvan sesleri sırayla oynatılıyor
        for (AnimalBase animal : animals) {
            animal.makeSound();
        }
    }
}
