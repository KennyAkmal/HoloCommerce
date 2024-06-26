package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbcon {

    public Connection bukaKoneksi() throws SQLException {
        Connection connect = null;
        try {
            // Memuat driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Mendapatkan koneksi ke database
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/holostore", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new SQLException("Gagal membuka koneksi ke database", e);
        }
        return connect;
    }
}
