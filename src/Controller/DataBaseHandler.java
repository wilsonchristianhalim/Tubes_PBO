/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Wilson
 */
public class DataBaseHandler {
   private static String server = "http://localhost/phpmyadmin/db_structure.php?server=1&db=db_esport";
    private static String username = "root";
    private static String password = "";
    private static Connection connection;
    
    public static Connection getConnection(){
        if(connection == null){
            connection = logOn();
        }
        return connection;
    }
    
    private static Connection logOn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            System.out.println("Koneksi Sukses");
            return DriverManager.getConnection(server, username,password);
        }catch(SQLException e){
            e.printStackTrace(System.err);
            System.out.println("Koneksi gagal "+e.toString());
        }catch(ClassNotFoundException ex){
            ex.printStackTrace(System.err);
            System.out.println("JDBC.ODBC driver tidak ditemukan");
        }
        return null;
    }
    
    private static void logOff(){
        try{
            connection.close();
            System.out.println("KOneksi close");
        }catch(Exception e){
            e.printStackTrace(System.err);
        }
    }
}
