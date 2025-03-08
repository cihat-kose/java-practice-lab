package _29_Inheritance._04_Employee;

// Manager sınıfı, Employee sınıfından miras alır
public class Manager extends Employee {

    // Constructor (Yapıcı metot)
    public Manager(String name, double salary) {
        super(name, salary);
    }

    // Manager sınıfı, work metodunu özelleştirir (override)
    @Override
    public void work() {
        System.out.println(name + " bir ekibi yönetiyor.");
    }
}
