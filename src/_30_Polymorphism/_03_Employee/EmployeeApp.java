package _30_Polymorphism._03_Employee;

public class EmployeeApp {
    public static void main(String[] args) {
        // Polymorphism ile üst sınıf referansı kullanarak alt sınıf nesneleri oluşturma
        Employee manager = new Manager();
        Employee developer = new Developer();

        // Çalışma davranışları
        manager.work();  // Yönetici bir ekibi yönetiyor.
        developer.work();  // Yazılımcı kod yazıyor.
    }
}
