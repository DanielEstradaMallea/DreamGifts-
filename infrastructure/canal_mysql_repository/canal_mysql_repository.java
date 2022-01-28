/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.canal_mysql_repository;


import conexion.conexion;
import infrastructure.banco_mysql_repository.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author daniel
 */
public class canal_mysql_repository extends conexion implements canal_repository {

    @Override
    public List<canal> listarCanal() throws Exception {
        List<canal> canal = null;
        try {
            this.connections();
            PreparedStatement pstm = this.conexion.prepareStatement("select * from canal");
            ResultSet respuesta = pstm.executeQuery();
            canal = new ArrayList();
            while (respuesta.next()) {

                canal canal1 = new canal();
                canal1.setIdCanal(respuesta.getInt("id_canal"));
                canal1.setCanal(respuesta.getString("can_nombre"));
                canal1.setEstadoCanal(respuesta.getBoolean("can_estado"));
                canal.add(canal1);
            }
            return canal;
        } catch (Exception e) {
            System.out.println("no se listó");
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public boolean registrarCanal(canal canal) throws Exception {
        try {
            this.connections();
            String query = String.format("insert into canal (can_nombre, can_estado) values"
                    + " ('%s', %s)", canal.getCanal(), true);

            PreparedStatement respuesta = this.conexion.prepareStatement(query);
            respuesta.execute();
            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void updateEstadoCanal(String codigo, String estado) throws Exception {
        try {
            this.connections();
            int resultEstado = (estado.equals("activado")) ? 0 : 1;

            String query = String.format("update canal set can_estado = '%s' where id_canal = '%s'", resultEstado, codigo);

            PreparedStatement respuesta = this.conexion.prepareStatement(query);
            respuesta.executeUpdate();

        } catch (SQLException e) {

        } finally {
            this.cerrar();
        }
    }

    @Override
    public List<canal> searchCanal(String canal) throws Exception {
        this.connections();
        List<canal> canales = null;
        try {
            PreparedStatement pstm = this.conexion.prepareStatement("select * from canal where can_nombre like '%" + canal + "%'");
            ResultSet respuesta = pstm.executeQuery();
            canales = new ArrayList();
            while (respuesta.next()) {

                canal canal1 = new canal();
                canal1.setIdCanal(respuesta.getInt("id_canal"));
                canal1.setCanal(respuesta.getString("can_nombre"));
                canal1.setEstadoCanal(respuesta.getBoolean("can_estado"));
                canales.add(canal1);
            }
            return canales;
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }
}
