package _29_Inheritance._05_Company;

// Department sınıfı, tüm departmanların ortak özelliklerini ve metotlarını temsil eder
public class Department {
    protected String name;
    protected int numberOfEmployees;

    // Yapıcı metot (constructor), name ve numberOfEmployees özelliklerini başlatır
    public Department(String name, int numberOfEmployees) {
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
    }

    // Ortak departman bilgisi metodu (alt sınıflar tarafından özelleştirilebilir)
    public void getDepartmentInfo() {
        System.out.println("Departman Adı: " + name + ", Çalışan Sayısı: " + numberOfEmployees);
    }
}
