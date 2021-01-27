package connectsqlsever;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class StudentManager {
    public StudentManager() {
    }

    private Connection connection;

    public Connection getConn() {
	return connection;
    }

    public void setConn(Connection conn) {
	this.connection = conn;
    }

    public Connection getConnect() throws ClassNotFoundException, SQLException {
	Class.forName(DatabaseInFo.driverName);
	connection = DriverManager.getConnection(DatabaseInFo.dbURL, DatabaseInFo.dbUser, DatabaseInFo.dbPass);
	System.out.println("CONNECTTED!");
	return connection;
    }
       
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StudentManager sm = new StudentManager();
        sm.getConnect();
    }
}
