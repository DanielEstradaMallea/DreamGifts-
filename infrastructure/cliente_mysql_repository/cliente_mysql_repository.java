/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.cliente_mysql_repository;

/**
 *
 * @author Jorge
 */
import conexion.conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class cliente_mysql_repository extends conexion implements cliente_repository {

    @Override
    public List<cliente> ListarCliente() throws Exception {
        List<cliente> clientes = null;
        try {
            this.connections();
            PreparedStatement pstm = this.conexion.prepareStatement("select * from cliente,comuna, canal WHERE cliente.comuna_id=comuna.id_comuna"
                    + " AND cliente.canal_id=canal.id_canal ");
            ResultSet respuesta = pstm.executeQuery();
            clientes = new ArrayList();
            while (respuesta.next()) {

                cliente cli = new cliente();
                cli.setIdCliente(respuesta.getInt("id_cliente"));
                cli.setNombreCliente(respuesta.getString("cli_nombre"));
                cli.setApellidoCliente(respuesta.getString("cli_apellido"));
                cli.setDireccionCliente(respuesta.getString("cli_direccion"));
                cli.setTelefonoCliente(respuesta.getInt("cli_telefono"));
                cli.setEmailCliente(respuesta.getString("cli_mail"));
                cli.setEstadoCliente(respuesta.getBoolean("cli_estado"));
                cli.setComunaCliente(respuesta.getString("com_nombre"));
                cli.setCanalCliente(respuesta.getString("can_nombre"));
                cli.setRutCliente(respuesta.getString("cli_rut"));

                clientes.add(cli);
                System.out.println("accediendo a lista");
            }
            return clientes;
        } catch (Exception e) {
            System.out.println("Error, no se listo");
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public boolean registrarCliente(cliente cliente) throws Exception {
        try {
            this.connections();
            String query = String.format("insert into cliente (cli_nombre, cli_apellido, cli_direccion, cli_telefono, cli_mail, comuna_id, canal_id,cli_rut, cli_estado ) VALUES"
                    + " ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', %s)", cliente.getNombreCliente(), cliente.getApellidoCliente(), cliente.getDireccionCliente(), cliente.getTelefonoCliente(),
                    cliente.getEmailCliente(), cliente.getIdComunaCliente(), cliente.getIdCanalCliente(),cliente.getRutCliente(),true);

            PreparedStatement respuesta = this.conexion.prepareStatement(query);
            respuesta.execute();
            System.out.println("Dato registrado");
            return true;

        } catch (SQLException e) {
            System.out.println("Dato no ingresado");
            return false;
        } finally {
            this.cerrar();
        }
    }

//    public void updateEstadoCliente(int id, String estado) throws Exception {
//        try {
//            this.connections();
//            int resultCliente = (estado.equals("activado")) ? 0 : 1;
//
//            String query = String.format("UPDATE cliente SET cli_estado = '%s' WHERE id_cliente = '%s'", resultCliente, id);
//            System.out.println("El estado ha sido cambiado");
//
//            PreparedStatement respuesta = this.conexion.prepareStatement(query);
//            respuesta.executeUpdate();
//
//        } catch (SQLException e) {
//            System.out.println("Error al cambiar estado");
//
//        } finally {
//            this.cerrar();
//        }
//    }
    public List<cliente> searchCliente(String cliente) throws Exception {
        this.connections();
        List<cliente> clientes = null;
        try {
            PreparedStatement pstm = this.conexion.prepareStatement("SELECT * FROM cliente WHERE cli_nombre like '%" + cliente + "%'");
            ResultSet respuesta = pstm.executeQuery();
            clientes = new ArrayList();
            while (respuesta.next()) {

                cliente cli = new cliente();
                cli.setIdCliente(respuesta.getInt("id_cliente"));
                cli.setNombreCliente(respuesta.getString("cli_nombre"));
                cli.setApellidoCliente(respuesta.getString("cli_apellido"));
                cli.setDireccionCliente(respuesta.getString("cli_direccion"));
                cli.setTelefonoCliente(respuesta.getInt("cli_telefono"));
                cli.setEmailCliente(respuesta.getString("cli_mail"));
                cli.setEstadoCliente(respuesta.getBoolean("cli_estado"));
                cli.setComunaCliente(respuesta.getString("com_nombre"));
                cli.setCanalCliente(respuesta.getString("can_nombre"));
                cli.setRutCliente(respuesta.getString("cli_rut"));

                clientes.add(cli);
                System.out.println("accediendo a busqueda");

                // ban.setID(respuesta.getInt("BAN_ID_BANCO"));
                //ban.setNombre(respuesta.getString("BAN_DESCRIPCION"));
                //ban.setEstado(respuesta.getBoolean("BAN_ESTADO"));
                //bancos.add(ban);
            }
            return clientes;
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void updateEstadoCliente(String codigo, String estado) throws Exception {
        try {
            this.connections();
            int resultCliente = (estado.equals("activado")) ? 0 : 1;

            String query = String.format("UPDATE cliente SET cli_estado = '%s' WHERE id_cliente = '%s'", resultCliente, codigo);
            System.out.println("El estado ha sido cambiado");

            PreparedStatement respuesta = this.conexion.prepareStatement(query);
            respuesta.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al cambiar estado");

        } finally {
            this.cerrar();
        }
    }

}
