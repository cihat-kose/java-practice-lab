package _26_AccessModifiersAndNonAccessModifiers._09_Employee;

public class Employee {
    private final int id; // Private final değişken: İlk atanan değer değiştirilemez

    public Employee(int id) { // Constructor: Kimlik değişkenine değer atanır
        this.id = id;
    }

    public void printId() { // Kimlik değerini ekrana yazdıran metot
        System.out.println("Employee ID: " + id);
    }
}
