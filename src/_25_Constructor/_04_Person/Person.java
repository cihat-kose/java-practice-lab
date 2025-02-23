package _25_Constructor._04_Person;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<String> hobbies;

    // Constructor - Kişi nesnesi oluşturulurken bilgileri atar
    public Person(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = (hobbies != null) ? hobbies : new ArrayList<>();
    }

    // Kişi bilgilerini ekrana yazdıran metot
    public void displayInfo() {
        System.out.println("Ad: " + this.name);
        System.out.println("Yaş: " + this.age);
        System.out.println("Hobiler: " + (hobbies.isEmpty() ? "Belirtilmemiş" : String.join(", ", this.hobbies)));
    }
}

