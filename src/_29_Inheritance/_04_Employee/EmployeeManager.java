package _29_Inheritance._04_Employee;

public class EmployeeManager {
    public static void main(String[] args) {
        // Manager nesnesi oluşturuluyor
        Manager manager = new Manager("Alice", 9000);

        // Developer nesnesi oluşturuluyor
        Developer developer = new Developer("Bob", 7500);

        // Manager nesnesinin çalışma davranışı
        manager.work();  // Alice bir ekibi yönetiyor.

        // Developer nesnesinin çalışma davranışı
        developer.work();  // Bob kod yazıyor.

        // Maaş bilgileri
        manager.displaySalary();    // Alice maaşı: 9000.0
        developer.displaySalary();  // Bob maaşı: 7500.0
    }
}
