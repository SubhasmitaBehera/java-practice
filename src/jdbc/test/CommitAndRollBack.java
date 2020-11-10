package jdbc.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CommitAndRollBack {
    static String DBURL = "jdbc:mysql://localhost:3306/database2";
    static String DBUSER = "root";
    static String DBPASS = "bablu";

    public static void main(String[] args) throws SQLException, IOException {

        //Cretae the connection object
        Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        con.setAutoCommit(false);
        //Insert the record
        String sql = "INSERT INTO Employee (empid, empname) VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        //Used to take user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("Enter employee Id: ");
            String s1 = br.readLine();
            int empid = Integer.parseInt(s1);

            System.out.print("Enter employee name: ");
            String name = br.readLine();

            ps.setInt(1, empid);
            ps.setString(2, name);
            ps.executeUpdate();
            System.out.println("commit/rollback");
            String answer = br.readLine();
            if (answer.equals("commit")) {
                con.commit();
            }
            if (answer.equals("rollback")) {
                con.rollback();
            }
            System.out.println("Want to add more records y/n");
            String ans = br.readLine();
            if (ans.equals("n")) {
                break;
            }
        }
        con.commit();
        System.out.println("record successfully saved");
        con.close();//before closing connection commit() is called
    }
}
