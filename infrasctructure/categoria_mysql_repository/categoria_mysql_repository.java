/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrasctructure.categoria_mysql_repository;

import conexion.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.categoria;

/**
 *
 * @author danie
 */
public class categoria_mysql_repository extends conexion implements categoria_repository {

    @Override
    public List<categoria> listarCategoria() throws Exception {
        List<categoria> categoria = null;
        try {
            this.connections();
            PreparedStatement pstm = this.conexion.prepareStatement("select * from categoria");
            ResultSet respuesta = pstm.executeQuery();
            categoria = new ArrayList();
            while (respuesta.next()) {

                categoria categoria1 = new categoria();
                categoria1.setIdCategoria(respuesta.getInt("id_cat"));
                categoria1.setCategoria(respuesta.getString("cat_descripcion"));
                categoria1.setEstadoCategoria(respuesta.getBoolean("cat_estado"));

                categoria.add(categoria1);
            }
            return categoria;
        } catch (Exception e) {
            System.out.println("no se listó categorias");
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public boolean registrarCategoria(categoria categoria) throws Exception {
        try {
            this.connections();
            String query = String.format("insert into categoria (cat_descripcion, cat_estado) values"
                    + " ('%s', %s)", categoria.getCategoria(), true);

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
    public void updateEstadoCategoria(String codigo, String estado) throws Exception {
        try {
            this.connections();
            int resultEstado = (estado.equals("activado")) ? 0 : 1;

            String query = String.format("update categoria set cat_estado = '%s' where id_cat = '%s'", resultEstado, codigo);

            PreparedStatement respuesta = this.conexion.prepareStatement(query);
            respuesta.executeUpdate();

        } catch (SQLException e) {

        } finally {
            this.cerrar();
        }
    }

    @Override
    public List<categoria> searchCategoria(String categoria) throws Exception {
        this.connections();
        List<categoria> categorias = null;
        try {
            PreparedStatement pstm = this.conexion.prepareStatement("select * from categoria where cat_descripcion like '%" + categoria + "%'");
            ResultSet respuesta = pstm.executeQuery();
            categorias = new ArrayList();
            while (respuesta.next()) {

                categoria categoria1 = new categoria();
                categoria1.setIdCategoria(respuesta.getInt("id_cat"));
                categoria1.setCategoria(respuesta.getString("cat_descripcion"));
                categoria1.setEstadoCategoria(respuesta.getBoolean("cat_estado"));
                categorias.add(categoria1);
            }
            return categorias;
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }
}
