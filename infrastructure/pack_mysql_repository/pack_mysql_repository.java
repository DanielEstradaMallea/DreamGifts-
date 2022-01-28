/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.pack_mysql_repository;
import conexion.conexion;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.pack;

/**
 *
 * @author danie
 */
public class pack_mysql_repository extends conexion implements pack_repository {

    @Override
    public List<pack> listarPack() throws Exception {

        List<pack> pack = null;
        try {
            this.connections();
            PreparedStatement pstm = this.conexion.prepareStatement("select * from pack");
            ResultSet respuesta = pstm.executeQuery();
            pack = new ArrayList();
            while (respuesta.next()) {

                pack pack1 = new pack();
                pack1.setIdPack(respuesta.getInt("id_pack"));
                pack1.setNombrePack(respuesta.getString("pack_nombre"));
                pack1.setCostoPack(respuesta.getString("pack_costo"));
                pack1.setStockPack(respuesta.getInt("pack_stock"));
                pack1.setEstadoPack(respuesta.getBoolean("pack_estado"));
                pack.add(pack1);
            }
            return pack;
        } catch (Exception e) {
            System.out.println("no se listó pack");
            throw e;
        } finally {
            this.cerrar();
        }
    }

//    @Override
//    public boolean registrarArticulo(articulo articulo) throws Exception {
//        
//        try {
//            this.connections();
//            String query = String.format("insert into articulo (art_descripcion,cat_id_cat,art_stock,proveedor_id,art_fech_venc, art_estado) values"
//                    + " ('%s', '%s', '%s', '%s', '%s', %s)", articulo.getDescripcionArticulo(),articulo.getIdCatArticulo(),
//                    articulo.getStockArticulo(),articulo.getIdProvArticulo(),articulo.getFechaVencArticulo(), true);
//
//            PreparedStatement respuesta = this.conexion.prepareStatement(query);
//            respuesta.execute();
//                        System.out.println("se ejecutó guardar articulo");
//
//            return true;
//
//        } catch (SQLException e) {
//            
//            System.out.println("no se ejecutó guardar articulo");
//            return false;
//        } finally {
//            this.cerrar();
//        }
//    }

    @Override
    public void updateEstadoPack(String codigo, String estado) throws Exception {
        try {
            this.connections();
            int resultEstado = (estado.equals("activado")) ? 0 : 1;

            String query = String.format("update pack set pack_estado = '%s' where id_pack = '%s'", resultEstado, codigo);

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
    public List<pack> searchPacks(String pack) throws Exception {
        this.connections();
        List<pack> packs = null;
        try {
            PreparedStatement pstm = this.conexion.prepareStatement("select * from pack where pack_nombre like '%" + pack + "%'");
            ResultSet respuesta = pstm.executeQuery();
            packs = new ArrayList();
            while (respuesta.next()) {

                pack pack1 = new pack();
                pack1.setIdPack(respuesta.getInt("id_pack"));
                pack1.setNombrePack(respuesta.getString("pack_nombre"));
                pack1.setCostoPack(respuesta.getString("pack_costo"));
                pack1.setStockPack(respuesta.getInt("pack_stock"));
                pack1.setEstadoPack(respuesta.getBoolean("pack_estado"));              
                packs.add(pack1);
            }
            return packs;
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

}
