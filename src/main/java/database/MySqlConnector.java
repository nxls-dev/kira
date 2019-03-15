package database;


import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnector {
     public static Connection dbConnection() {
        Connection myConn = null;
         try {
             myConn = DriverManager.getConnection(
                     "path", "user", "password");
             return myConn;
         } catch (Exception e) {
             e.printStackTrace();
         }
         return myConn;
     }

}