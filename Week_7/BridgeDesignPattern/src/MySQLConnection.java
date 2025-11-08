public class MySQLConnection implements DatabasePlatform{
    @Override
    public void configureConnection() {
        System.out.println("MySQL veri tabanı için bağlantı sağlandı...");
    }
}
