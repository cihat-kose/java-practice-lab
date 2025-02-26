package _26_AccessModifiersAndNonAccessModifiers._10_DatabaseConnection;

public class DatabaseConnection {
    private static final DatabaseConnection instance = new DatabaseConnection(); // Tek örnek

    private DatabaseConnection() { // Private kurucu: Dışarıdan nesne oluşturmayı engeller
        System.out.println("Database connection established.");
    }

    public static DatabaseConnection getInstance() { // Singleton örneğini döndüren metot
        return instance;
    }
}
