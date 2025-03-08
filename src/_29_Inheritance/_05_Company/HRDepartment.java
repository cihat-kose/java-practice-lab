package _29_Inheritance._05_Company;

// HRDepartment sınıfı, Department sınıfından miras alır
public class HRDepartment extends Department {

    // Yapıcı metot (constructor)
    public HRDepartment(String name, int numberOfEmployees) {
        super(name, numberOfEmployees);
    }

    // HR departmanı için departman bilgisi metodunu özelleştiriyoruz (override)
    @Override
    public void getDepartmentInfo() {
        System.out.println("HR Departmanı: " + name + ", Çalışan Sayısı: " + numberOfEmployees + ", Odak: İşe Alım ve Çalışan İlişkileri");
    }
}
