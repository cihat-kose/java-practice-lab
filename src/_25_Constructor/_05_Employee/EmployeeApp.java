package _25_Constructor._05_Employee;

public class EmployeeApp {
    public static void main(String[] args) {
        // Farklı constructorlar kullanılarak dört çalışan nesnesi oluşturulur.
        Employee employee1 = new Employee("Alice", "Engineering", 5000);
        Employee employee2 = new Employee("Bob", "HR");
        Employee employee3 = new Employee("Charlie");
        Employee employee4 = new Employee();

        // Çalışan bilgilerini ekrana yazdırma
        System.out.println("Çalışan Bilgileri:");
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
        employee4.displayInfo();
    }
}
