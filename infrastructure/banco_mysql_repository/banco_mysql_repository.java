/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.banco_mysql_repository;

import conexion.conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.banco;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author claudio
 */
public class banco_mysql_repository extends conexion implements banco_repository {

    @Override
    public List<banco> listarBanco() throws Exception {
        List<banco> bancos = null;
        try {
            this.connections();
            PreparedStatement pstm = this.conexion.prepareStatement("select * from bancos");
            ResultSet respuesta = pstm.executeQuery();
            bancos = new ArrayList();
            while (respuesta.next()) {

                banco ban = new banco();
                ban.setID(respuesta.getInt("id_banco"));
                ban.setNombre(respuesta.getString("ban_descripcion"));
                ban.setEstado(respuesta.getBoolean("ban_estado"));
                bancos.add(ban);
                System.out.println("se listó banco");
            }
            return bancos;
        } catch (Exception e) {
            System.out.println("no se listó banco");
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public boolean registrarBanco(banco banco) throws Exception {
        try {
            this.connections();
            String query = String.format("insert into bancos (ban_descripcion, ban_estado) values"
                    + " ('%s', %s)", banco.getNombre(), true);

            PreparedStatement respuesta = this.conexion.prepareStatement(query);
            respuesta.execute();
            System.out.println("ingreso banco");
            return true;

        } catch (SQLException e) {
            System.out.println("no ingreso banco");
            return false;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void updateEstadoBanco(String codigo, String estado) throws Exception {
        try {
            this.connections();
            int resultEstado = (estado.equals("activado")) ? 0 : 1;

            String query = String.format("update bancos set ban_estado = '%s' where id_banco = '%s'", resultEstado, codigo);
            System.out.println("como que quiere cambiar");

            PreparedStatement respuesta = this.conexion.prepareStatement(query);
            respuesta.executeUpdate();

        } catch (SQLException e) {
            System.out.println("pero no cambia nah");

        } finally {
            this.cerrar();
        }
    }

    @Override
    public List<banco> searchBancos(String banco) throws Exception {
        this.connections();
        List<banco> bancos = null;
        try {
            PreparedStatement pstm = this.conexion.prepareStatement("select * from bancos where BAN_DESCRIPCION like '%" + banco + "%'");
            ResultSet respuesta = pstm.executeQuery();
            bancos = new ArrayList();
            while (respuesta.next()) {

                banco ban = new banco();
                ban.setID(respuesta.getInt("BAN_ID_BANCO"));
                ban.setNombre(respuesta.getString("BAN_DESCRIPCION"));
                ban.setEstado(respuesta.getBoolean("BAN_ESTADO"));
                bancos.add(ban);
            }
            return bancos;
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }
}
