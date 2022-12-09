package root;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Statement;

public class koneksi {
    
    private static Connection koneksi;
    public static Connection configDB()throws SQLException{
        
        try{
            String url = "jdbc:mysql://localhost:3306/tomart";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            // register driver untuk bisa digunakan di koneksi
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            statement sebagai pernyataan
            koneksi = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi Berhasil");
        }catch(SQLException e){
            System.err.println("Koneksi ke Database Gagal " + e.getMessage());
        }	
        return koneksi;
    }
}
