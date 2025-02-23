package _25_Constructor._05_Employee;

public class Employee {
    private String name;
    private String department;
    private double salary;

    // Constructor 1: Tüm özellikler parametre olarak alınır.
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Constructor 2: Sadece name ve department parametre olarak alınır, salary varsayılan olarak 3000.
    public Employee(String name, String department) {
        this(name, department, 3000);
    }

    // Constructor 3: Sadece name parametre olarak alınır, department "Unknown", salary 3000 olarak atanır.
    public Employee(String name) {
        this(name, "Unknown", 3000);
    }

    // Constructor 4: Parametresiz constructor, tüm özellikler varsayılan değerlerle atanır.
    public Employee() {
        this("Unknown", "Unknown", 3000);
    }

    // Çalışanın bilgilerini ekrana yazdıran metot.
    public void displayInfo() {
        System.out.println("Ad: " + name + " | Departman: " + department + " | Maaş: " + salary);
    }
}
