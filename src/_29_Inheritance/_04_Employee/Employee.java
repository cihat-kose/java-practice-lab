package _29_Inheritance._04_Employee;

// Employee sınıfı, tüm çalışanların ortak özelliklerini ve metotlarını temsil eder
public class Employee {
    protected String name;
    protected double salary;

    // Constructor (Yapıcı metot)
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Ortak iş yapma metodu (alt sınıflar tarafından özelleştirilebilir)
    public void work() {
        System.out.println(name + " çalışıyor.");
    }

    // Maaş bilgisini ekrana yazdıran metot
    public void displaySalary() {
        System.out.println(name + " maaşı: " + salary);
    }
}
