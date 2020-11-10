package jdbc.test.databasemetadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseMetadataDemo {
    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/database2";
        String pass = "bablu";
        String user = "root";

        Connection connection = DriverManager.getConnection(URL, user, pass);

//        DatabaseMetaData dbmd =
    }
}
