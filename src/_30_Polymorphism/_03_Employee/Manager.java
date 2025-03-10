package _30_Polymorphism._03_Employee;

// Manager sınıfı, Employee sınıfından miras alır
public class Manager extends Employee {

    // Manager sınıfı, work metodunu özelleştirir (override)
    @Override
    public void work() {
        System.out.println("Yönetici bir ekibi yönetiyor.");
    }
}
