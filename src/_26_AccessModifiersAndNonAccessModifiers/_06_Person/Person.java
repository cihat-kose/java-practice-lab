package _26_AccessModifiersAndNonAccessModifiers._06_Person;

public class Person {
    private String name = "Hakan Dalyan"; // Private değişken: Sadece bu sınıf içinden erişilebilir

    public void printName() { // Public metot: İsmi ekrana yazdırır
        System.out.println("Name: " + name);
    }
}
