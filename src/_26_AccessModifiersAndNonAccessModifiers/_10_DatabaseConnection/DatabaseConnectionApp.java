package _26_AccessModifiersAndNonAccessModifiers._10_DatabaseConnection;

public class DatabaseConnectionApp {
    public static void main(String[] args) {
        // Singleton yapıdaki sınıfın örneğini al ve kullan
        DatabaseConnection connection = DatabaseConnection.getInstance();
    }
}
