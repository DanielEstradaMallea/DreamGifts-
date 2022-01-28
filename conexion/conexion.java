package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author claudio
 */
public class conexion {

    protected final String url = "jdbc:mysql://localhost:3306/dreamgifts_db";
    protected final String user = "root";
    protected final String pass = "";
    public Connection conexion;

    public void connections() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, pass);
            System.out.println("conectado");
        } catch (Exception e) {
            System.out.println("Error de conexion: " + e.getMessage());
        }

    }

    public void cerrar() throws SQLException {
        if (conexion != null) {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }
    }
}
