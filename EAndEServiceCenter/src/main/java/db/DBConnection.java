package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dBConnection;
    private Connection connection;

    private DBConnection() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/eeservise",
                "root",
                "2351"
        );
    }

    public static DBConnection getInstance() throws SQLException {
        return (null == dBConnection) ? dBConnection = new DBConnection() : dBConnection;
    }

    public Connection getConnection(){
        return connection;
    }
}