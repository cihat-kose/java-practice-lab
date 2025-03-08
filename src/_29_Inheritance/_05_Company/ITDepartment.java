package _29_Inheritance._05_Company;

// ITDepartment sınıfı, Department sınıfından miras alır
public class ITDepartment extends Department {

    // Yapıcı metot (constructor)
    public ITDepartment(String name, int numberOfEmployees) {
        super(name, numberOfEmployees);
    }

    // IT departmanı için departman bilgisi metodunu özelleştiriyoruz (override)
    @Override
    public void getDepartmentInfo() {
        System.out.println("IT Departmanı: " + name + ", Çalışan Sayısı: " + numberOfEmployees + ", Odak: Yazılım Geliştirme ve Destek");
    }
}
