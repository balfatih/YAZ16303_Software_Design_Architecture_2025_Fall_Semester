public class MySQLDatabaseConnector implements DatabaseConnector {

    protected DatabasePlatform platform;
    public MySQLDatabaseConnector(DatabasePlatform platform) {
        this.platform = platform;
    }

    @Override
    public void connect() {
        System.out.println("MySQL veri tabanına bağlantı sağlanılıyor...");
        platform.configureConnection();
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Sorgu çalıştırıldı.... Sonuçlar bekleniyor.."
                + query);
    }
}
