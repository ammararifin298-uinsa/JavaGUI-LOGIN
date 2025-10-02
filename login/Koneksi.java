package login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ammar Arifin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static final String URL = "jdbc:postgresql://localhost:5432/db_login";
    private static final String USER = "postgres";     
    private static final String PASSWORD = "ammarktb123"; 

    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Koneksi berhasil.");
            return conn;
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
            return null;
        }
    }
}