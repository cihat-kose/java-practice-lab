package _29_Inheritance._04_Employee;

// Developer sınıfı, Employee sınıfından miras alır
public class Developer extends Employee {

    // Constructor (Yapıcı metot)
    public Developer(String name, double salary) {
        super(name, salary);
    }

    // Developer sınıfı, work metodunu özelleştirir (override)
    @Override
    public void work() {
        System.out.println(name + " kod yazıyor.");
    }
}
