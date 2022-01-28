/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import model.banco;
import infrastructure.banco_mysql_repository.banco_mysql_repository;
import infrastructure.banco_mysql_repository.banco_repository;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author claudio
 */
public class bancoUsecase {

    banco_repository b = new banco_mysql_repository();

    public DefaultTableModel listarBancos() throws Exception {

        List<banco> bancos = new ArrayList();
        bancos = b.listarBanco();

        DefaultTableModel model = llenarTabla(bancos);

        return model;
    }

    public boolean registrarBanco(banco banco) throws Exception {
        if (!banco.getNombre().equals("")) {
            boolean respuesta = b.registrarBanco(banco);

            if (respuesta) {
                System.err.println("banco se aprobó");
                return respuesta;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void updateEstadoBanco(String codigo, String estado) throws Exception {

        b.updateEstadoBanco(codigo, estado);

    }

    public DefaultTableModel SearchBancos(String bancoRequest) throws Exception {
        List<banco> bancos = new ArrayList();
        bancos = b.searchBancos(bancoRequest);
        DefaultTableModel model = llenarTabla(bancos);

        return model;

    }

    private DefaultTableModel llenarTabla(List<model.banco> bancos) {

        String[] titulos = {"Banco", "ID", "Estado", "Cambiar Estado", "Editar Banco"};
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        JButton btnBanco1 = new JButton("estado");
        btnBanco1.setName("estado");

        JButton btnBanco2 = new JButton("editar");
        btnBanco2.setName("editar");

        for (banco bn : bancos) {
            String resultEstado = (bn.isEstado()) ? "activado" : "desactivado";
            Object[] ba = {bn.getNombre(),bn.getID(),resultEstado, btnBanco1, btnBanco2};
            model.addRow(ba);
        }
        return model;
    }

}
