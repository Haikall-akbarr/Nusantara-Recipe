package user;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;



/**
 *
 * @author Haikal
 */
public class Config {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Ganti URL, user, dan password sesuai dengan database Anda
            String url = "jdbc:mysql://localhost:3306/nusantara_recipe"; 
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Gagal menghubungkan ke database!");
        }
        return connection;
    }

    static Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static Connection GetConnect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
