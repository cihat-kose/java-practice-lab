package _25_Constructor._01_Student;

public class Student {
    private String name;
    private String surname;
    private int age;

    // Yaş parametresi olmadan constructor (varsayılan yaş 18)
    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = 18;
    }

    // Yaş parametresi ile constructor
    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Öğrenci bilgilerini ekrana yazdıran metot
    public void displayInfo() {
        System.out.println("Ad: " + this.name);
        System.out.println("Soyad: " + this.surname);
        System.out.println("Yaş: " + this.age);
    }
}
