package _25_Constructor._01_Student;

public class StudentApp {
    public static void main(String[] args) {
        // Varsayılan yaş ile bir öğrenci nesnesi oluşturma
        Student student1 = new Student("Ali", "Bulur");
        student1.displayInfo();

        System.out.println(); // Boş satır

        // Belirtilen yaş ile bir öğrenci nesnesi oluşturma
        Student student2 = new Student("Ayşe", "Yılmaz", 22);
        student2.displayInfo();
    }
}

