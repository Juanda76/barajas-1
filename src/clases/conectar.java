package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

// @author Software_Max(JDV)

public class conectar {

    Connection con;

    public conectar() {

        try {

            final String URL = "jdbc:mysql://localhost:3306/barajas";
            final String USERNAME = "root";
            final String PASSWORD = "";
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexion exitosa");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public Connection getConnection() {
        return con;
    }
}
