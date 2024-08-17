package Database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {

    String db = "pccp";
    String username = "sqluser";
    String password = "password";
    Connection con = null;
    Statement stmt;
    ResultSet rs = null;

    public DatabaseConnection() {
    }

    public Connection dbconnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/" + db + "?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            if (con == null || con.isClosed()) {
                con = DriverManager.getConnection(url, username, password);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public ResultSet getResultSet(String query) {
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public int getUpdate(String query) {
        int i = 0;
        try {
            stmt = con.createStatement();
            i = stmt.executeUpdate(query);
        } catch (Exception e) {
        }
        return i;
    }
}
