/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.comuna_mysql_repository.folder;

import conexion.conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author claudio
 */
public class comuna_mysql_repository extends conexion implements comuna_repository {

    @Override
    public List<comuna> listarComuna() throws Exception {
        List<comuna> comuna = null;
        try {
            this.connections();
            PreparedStatement pstm = this.conexion.prepareStatement("select * from comuna");
            ResultSet respuesta = pstm.executeQuery();
            comuna = new ArrayList();
            while (respuesta.next()) {

                comuna comuna1 = new comuna();
                comuna1.setIdComuna(respuesta.getInt("id_comuna"));
                comuna1.setComuna(respuesta.getString("com_nombre"));
                comuna1.setEstadoComuna(respuesta.getBoolean("com_estado"));
                comuna.add(comuna1);
            }
            return comuna;
        } catch (Exception e) {
            System.out.println("no se listó");
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public boolean registrarComuna(comuna comuna) throws Exception {
        try {
            this.connections();
            String query = String.format("insert into comuna (com_nombre, com_estado) values"
                    + " ('%s', %s)", comuna.getComuna(), true);

            PreparedStatement respuesta = this.conexion.prepareStatement(query);
            respuesta.execute();
            System.out.println("ingresó comuna");
            return true;

        } catch (SQLException e) {
            System.out.println("no ingresó comuna");
            System.out.println(e);
            return false;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void updateEstadoComuna(String codigo, String estado) throws Exception {
        try {
            this.connections();
            int resultEstado = (estado.equals("activado")) ? 0 : 1;

            String query = String.format("update comuna set com_estado = '%s' where id_comuna = '%s'", resultEstado, codigo);

            PreparedStatement respuesta = this.conexion.prepareStatement(query);
            respuesta.executeUpdate();
            System.out.println("como que quiere cambiar");

        } catch (SQLException e) {
             System.out.println("pero no cambia nah"+e);

        } finally {
            this.cerrar();
        }
    }

    @Override
    public List<comuna> searchComunas(String comuna) throws Exception {
        this.connections();
        List<comuna> comunas = null;
        try {
            PreparedStatement pstm = this.conexion.prepareStatement("select * from comuna where COM_NOMBRE like '%" + comuna + "%'");
            ResultSet respuesta = pstm.executeQuery();
            comunas = new ArrayList();
            while (respuesta.next()) {

                comuna comuna1 = new comuna();
                comuna1.setIdComuna(respuesta.getInt("id_comuna"));
                comuna1.setComuna(respuesta.getString("COM_NOMBRE"));
                comuna1.setEstadoComuna(respuesta.getBoolean("COM_ESTADO"));
                comunas.add(comuna1);
            }
            return comunas;
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }
}
