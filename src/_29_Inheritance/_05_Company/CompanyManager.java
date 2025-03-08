package _29_Inheritance._05_Company;

public class CompanyManager {
    public static void main(String[] args) {
        // ITDepartment nesnesi oluşturuluyor
        ITDepartment itDepartment = new ITDepartment("IT", 50);

        // HRDepartment nesnesi oluşturuluyor
        HRDepartment hrDepartment = new HRDepartment("HR", 20);

        // IT departmanı bilgisi ekrana yazdırılıyor
        itDepartment.getDepartmentInfo();  // IT Departmanı: IT, Çalışan Sayısı: 50, Odak: Yazılım Geliştirme ve Destek

        // HR departmanı bilgisi ekrana yazdırılıyor
        hrDepartment.getDepartmentInfo();  // HR Departmanı: HR, Çalışan Sayısı: 20, Odak: İşe Alım ve Çalışan İlişkileri
    }
}
