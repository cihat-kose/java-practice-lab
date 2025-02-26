package _26_AccessModifiersAndNonAccessModifiers._10_DatabaseConnection;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        // Singleton yapıdaki sınıfın örneğini al ve kullan
        DatabaseConnection connection = DatabaseConnection.getInstance();
        // Bu, DatabaseConnection sınıfının tek örneğidir.
    }
}
