/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import infrastructure.canal_mysql_repository.canal_mysql_repository;
import infrastructure.canal_mysql_repository.canal_repository;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import model.canal;

/**
 *
 * @author claudio
 */
public class canalUsecase {

    canal_repository b = new canal_mysql_repository();

    public DefaultTableModel listarCanales() throws Exception {

        List<canal> canales = new ArrayList();
        canales = b.listarCanal();

        DefaultTableModel model = llenarTabla(canales);

        return model;
    }

    public boolean registrarCanal(canal canal) throws Exception {
        if (!canal.getCanal().equals("")) {
            boolean respuesta = b.registrarCanal(canal);

            if (respuesta) {
                return respuesta;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void updateEstadoCanal(String codigo, String estado) throws Exception {

        b.updateEstadoCanal(codigo, estado);

    }

    public DefaultTableModel SearchCanales(String canalRequest) throws Exception {
        List<canal> canales = new ArrayList();
        canales = b.searchCanal(canalRequest);
        DefaultTableModel model = llenarTabla(canales);

        return model;

    }

    private DefaultTableModel llenarTabla(List<model.canal> bancos) {

        String[] titulos = {"Canal", "ID", "Estado", "Cambiar Estado", "Editar Banco"};
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        JButton btn1 = new JButton("estado");
        btn1.setName("estado");

        JButton btn2 = new JButton("editar");
        btn2.setName("editar");

        for (canal bn : bancos) {
            String resultEstado = (bn.isEstadoCanal()) ? "activado" : "desactivado";
            Object[] ba = {bn.getCanal(),bn.getIdCanal(),resultEstado, btn1, btn2};
            model.addRow(ba);
        }
        return model;
    }

}
