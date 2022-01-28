package infrastructure.proveedor_mysql_repository;

import conexion.conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class proveedor_mysql_repository extends conexion implements proveedor_repository {

    @Override
    public List<proveedor> listarproveedor() throws Exception {
        List<proveedor> proveedor = null;
        try {
            this.connections();
            PreparedStatement pstm = this.conexion.prepareStatement("select * from proveedor");
            ResultSet respuesta = pstm.executeQuery();
            proveedor = new ArrayList();
            while (respuesta.next()) {

                proveedor proveedor1 = new proveedor();
                proveedor1.setIdproveedor(respuesta.getInt("id_proveedor"));
                proveedor1.setproveedor(respuesta.getString("prov_razonsocial"));
                proveedor1.setprovnombre(respuesta.getString("prov_nombre"));
                proveedor1.setprovfono(respuesta.getString("prov_telefono"));
                proveedor1.setprovmail(respuesta.getString("prov_mail"));
                proveedor1.setprovdireccion(respuesta.getString("prov_direccion"));
                proveedor1.setprovrut(respuesta.getString("prov_rut"));
                proveedor1.setEstadoproveedor(respuesta.getBoolean("prov_estado"));
                proveedor.add(proveedor1);
            }
            return proveedor;
        } catch (Exception e) {
            System.out.println("no se listó");
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public boolean registrarproveedor(proveedor proveedor) throws Exception {
        try {
            this.connections();
            String query = String.format("insert into proveedor (prov_razonsocial, prov_nombre,prov_telefono, prov_mail, prov_direccion, prov_rut, prov_estado) values"
                    + " ('%s', '%s', '%s', '%s', '%s', '%s', %s)", proveedor.getproveedor(),proveedor.getprovnombre(),proveedor.getprovfono(),proveedor.getprovmail(),proveedor.getprovdireccion(),proveedor.getprovrut(), '1');
            System.out.println(query);
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
    public void updateEstadoproveedor(String codigo, String estado) throws Exception {
        try {
            this.connections();
            int resultEstado = (estado.equals("activado")) ? 0 : 1;

            String query = String.format("update proveedor set prov_estado = '%s' where id_proveedor = '%s'", resultEstado, codigo);

            PreparedStatement respuesta = this.conexion.prepareStatement(query);
            respuesta.executeUpdate();

        } catch (SQLException e) {

        } finally {
            this.cerrar();
        }
    }

    @Override
    public List<proveedor> searchproveedors(String proveedor) throws Exception {
        this.connections();
        List<proveedor> proveedors = null;
        try {
            PreparedStatement pstm = this.conexion.prepareStatement("select * from proveedor where prov_razonsocial like '%" + proveedor + "%'");
            ResultSet respuesta = pstm.executeQuery();
            proveedors = new ArrayList();
            while (respuesta.next()) {

                proveedor proveedor1 = new proveedor();
                proveedor1.setIdproveedor(respuesta.getInt("id_proveedor"));
                proveedor1.setproveedor(respuesta.getString("prov_razonsocial"));
                proveedor1.setprovnombre(respuesta.getString("prov_nombre"));
                proveedor1.setprovfono(respuesta.getString("prov_telefono"));
                proveedor1.setprovmail(respuesta.getString("prov_mail"));
                proveedor1.setprovdireccion(respuesta.getString("prov_direccion"));
                proveedor1.setprovrut(respuesta.getString("prov_rut"));
                proveedor1.setEstadoproveedor(respuesta.getBoolean("prov_estado"));
                proveedors.add(proveedor1);
            }
            return proveedors;
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }
}
