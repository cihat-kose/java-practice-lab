package _26_AccessModifiersAndNonAccessModifiers._10_DatabaseConnection;

public class DatabaseConnection {
    // private static final değişken: Sınıfa ait tek bir örneği tutar ve değiştirilemez
    private static final DatabaseConnection instance = new DatabaseConnection();

    // private kurucu: Sınıf dışından nesne oluşturulmasını engeller
    private DatabaseConnection() {
        System.out.println("Database connection established.");
    }

    // public static metod: Sınıfın tek örneğini döndürür
    public static DatabaseConnection getInstance() {
        return instance;
    }
}
