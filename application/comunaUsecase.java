/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import model.banco;
import infrastructure.banco_mysql_repository.banco_mysql_repository;
import infrastructure.banco_mysql_repository.banco_repository;
import infrastructure.comuna_mysql_repository.folder.comuna_mysql_repository;
import infrastructure.comuna_mysql_repository.folder.comuna_repository;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import model.comuna;

/**
 *
 * @author claudio
 */
public class comunaUsecase {

    comuna_repository b = new comuna_mysql_repository();

    public DefaultTableModel listarComunas() throws Exception {

        List<comuna> comunas = new ArrayList();
        comunas = b.listarComuna();

        DefaultTableModel model = llenarTabla(comunas);

        return model;
    }

    public boolean registrarComuna(comuna comuna) throws Exception {
        if (!comuna.getComuna().equals("")) {
            boolean respuesta = b.registrarComuna(comuna);

            if (respuesta) {
                return respuesta;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void updateEstadoComuna(String codigo, String estado) throws Exception {

        b.updateEstadoComuna(codigo, estado);

    }

    public DefaultTableModel SearchComunas(String comunaRequest) throws Exception {
        List<comuna> comunas = new ArrayList();
        comunas = b.searchComunas(comunaRequest);
        DefaultTableModel model = llenarTabla(comunas);

        return model;

    }

    private DefaultTableModel llenarTabla(List<model.comuna> comunas) {

        String[] titulos = {"Comuna", "ID", "Estado", "Cambiar Estado", "Editar Comuna"};
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        JButton btn1 = new JButton("estado");
        btn1.setName("estado");

        JButton btn2 = new JButton("editar");
        btn2.setName("editar");

        for (comuna bn : comunas) {
            String resultEstado = (bn.isEstadoComuna()) ? "activado" : "desactivado";
            Object[] ba = {bn.getComuna(),bn.getIdComuna(),  resultEstado, btn1, btn2};
            model.addRow(ba);
        }
        return model;
    }

}
