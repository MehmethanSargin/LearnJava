import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    static String userName = "root";
    static String password = "12345";
    static String dbUrl = "jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";


    public Connection getConnection() throws SQLException{
      return DriverManager.getConnection(dbUrl,userName,password);
    }

    public void  showErrorMessage(SQLException exception) {
        System.out.println(exception.getErrorCode());
        System.out.println(exception.getMessage());
    }
}
