//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DatabaseConnector mySQLDBConnector = new MySQLDatabaseConnector(new MySQLConnection());
        mySQLDBConnector.connect();
        mySQLDBConnector.executeQuery("SELECT * FROM tbl.Users");

    }
}