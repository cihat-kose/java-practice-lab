package _30_Polymorphism._03_Employee;

// Developer sınıfı, Employee sınıfından miras alır
public class Developer extends Employee {

    // Developer sınıfı, work metodunu özelleştirir (override)
    @Override
    public void work() {
        System.out.println("Yazılımcı kod yazıyor.");
    }
}
