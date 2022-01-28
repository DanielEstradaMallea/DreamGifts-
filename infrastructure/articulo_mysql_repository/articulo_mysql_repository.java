/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.articulo_mysql_repository;

import conexion.conexion;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.articulo;

/**
 *
 * @author danie
 */
public class articulo_mysql_repository extends conexion implements articulo_repository {

    @Override
    public List<articulo> listarArticulo() throws Exception {

        List<articulo> articulos = null;
        try {
            this.connections();
            PreparedStatement pstm = this.conexion.prepareStatement("select * from articulo,categoria, proveedor WHERE articulo.cat_id_cat=categoria.id_cat"
                    + " and articulo.proveedor_id=proveedor.id_proveedor ");
            ResultSet respuesta = pstm.executeQuery();
            articulos = new ArrayList();
            while (respuesta.next()) {

                articulo articulo1 = new articulo();
                articulo1.setIdArticulo(respuesta.getInt("art_id"));
                articulo1.setDescripcionArticulo(respuesta.getString("art_descripcion"));
                articulo1.setStockArticulo(respuesta.getInt("art_stock"));
                articulo1.setFechaVencArticulo(respuesta.getString("art_fech_venc"));
                articulo1.setNombreCategoria(respuesta.getString("cat_descripcion"));
                articulo1.setPrecioArticulo(respuesta.getInt("precio"));
                articulo1.setNombreProveedor(respuesta.getString("prov_razonsocial"));
                articulo1.setEstadoArticulo(respuesta.getBoolean("art_estado"));
                articulos.add(articulo1);
            }
            return articulos;
        } catch (Exception e) {
            System.out.println("no se listó articulos");
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public boolean registrarArticulo(articulo articulo) throws Exception {
        
        try {
            this.connections();
            String query = String.format("insert into articulo (art_descripcion,cat_id_cat,art_stock,proveedor_id,art_fech_venc, art_estado) values"
                    + " ('%s', '%s', '%s', '%s', '%s', %s)", articulo.getDescripcionArticulo(),articulo.getIdCatArticulo(),
                    articulo.getStockArticulo(),articulo.getIdProvArticulo(),articulo.getFechaVencArticulo(), true);

            PreparedStatement respuesta = this.conexion.prepareStatement(query);
            respuesta.execute();
                        System.out.println("se ejecutó guardar articulo");

            return true;

        } catch (SQLException e) {
            
            System.out.println("no se ejecutó guardar articulo");
            return false;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void updateEstadoArticulo(String codigo, String estado) throws Exception {
        try {
            this.connections();
            int resultEstado = (estado.equals("activado")) ? 0 : 1;

            String query = String.format("update articulo set art_estado = '%s' where art_id = '%s'", resultEstado, codigo);

            PreparedStatement respuesta = this.conexion.prepareStatement(query);
            respuesta.executeUpdate();
            System.out.println("llega al repository de cambio de estado");

        } catch (SQLException e) {
                        System.out.println("no llega al repository de cambio de estado");


        } finally {
            this.cerrar();
        }
    }

    @Override
    public List<articulo> searchArticulo(String articulo) throws Exception {
        this.connections();
        List<articulo> articulos = null;
        try {
            PreparedStatement pstm = this.conexion.prepareStatement("select * from articulo where art_descripcion like '%" + articulo + "%'");
            ResultSet respuesta = pstm.executeQuery();
            articulos = new ArrayList();
            while (respuesta.next()) {

                articulo articulo1 = new articulo();
                articulo1.setIdArticulo(respuesta.getInt("art_id"));
                articulo1.setDescripcionArticulo(respuesta.getString("art_descripcion"));
                articulo1.setStockArticulo(respuesta.getInt("art_stock"));
                articulo1.setFechaVencArticulo(respuesta.getString("art_fech_venc"));
                articulo1.setNombreCategoria(respuesta.getString("cat_descripcion"));
                articulo1.setNombreProveedor(respuesta.getString("prov_razonsocial"));
                articulo1.setEstadoArticulo(respuesta.getBoolean("art_estado"));
                articulos.add(articulo1);
            }
            return articulos;
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

}
