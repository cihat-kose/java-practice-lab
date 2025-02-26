package _26_AccessModifiersAndNonAccessModifiers._09_Employee;

public class EmployeeApp {
    public static void main(String[] args) {
        // Employee nesnesi oluştur ve kimlik değerini ata
        Employee employee = new Employee(12345);

        // Kimlik değerini ekrana yazdır
        employee.printId();
    }
}
