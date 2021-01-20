import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    static String userName = "";
    static String password = "";
    static String dbUrl = "";


    public Connection getConnection() throws SQLException{
      return DriverManager.getConnection(dbUrl,userName,password);
    }

    public void  showErrorMessage(SQLException exception) {
        System.out.println(exception.getErrorCode());
        System.out.println(exception.getMessage());
    }
}
