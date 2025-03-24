package pos_system;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Sadahiru
 */
public class DatabaseConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:MYSQL://localhost:3307/pos_system", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
