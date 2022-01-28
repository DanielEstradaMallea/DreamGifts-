/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import infrastructure.pack_mysql_repository.pack_mysql_repository;
import infrastructure.pack_mysql_repository.pack_repository;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import model.pack;

/**
 *
 * @author claudio
 */
public class packUsecase {

    pack_repository b = new pack_mysql_repository();

    public DefaultTableModel listarPacks() throws Exception {

        List<pack> packs = new ArrayList();
        packs = b.listarPack();

        DefaultTableModel model = llenarTabla(packs);

        return model;
    }

//    public boolean registrarBanco(banco banco) throws Exception {
//        if (!banco.getNombre().equals("")) {
//            boolean respuesta = b.registrarBanco(banco);
//
//            if (respuesta) {
//                System.err.println("banco se aprobó");
//                return respuesta;
//            } else {
//                return false;
//            }
//        } else {
//            return false;
//        }
//    }

    public void updateEstadoPack(String codigo, String estado) throws Exception {

        b.updateEstadoPack(codigo, estado);

    }

    public DefaultTableModel SearchPacks(String packRequest) throws Exception {
        List<pack> packs = new ArrayList();
        packs = b.searchPacks(packRequest);
        DefaultTableModel model = llenarTabla(packs);

        return model;

    }

    private DefaultTableModel llenarTabla(List<model.pack> packs) {

        String[] titulos = {"Pack", "ID","Costo","Stock", "Estado", "Cambiar Estado", "Editar Banco"};
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        JButton btnBanco1 = new JButton("estado");
        btnBanco1.setName("estado");

        JButton btnBanco2 = new JButton("editar");
        btnBanco2.setName("editar");

        for (pack bn : packs) {
            String resultEstado = (bn.isEstadoPack()) ? "activado" : "desactivado";
            Object[] ba = {bn.getNombrePack(),bn.getIdPack(),bn.getCostoPack(),bn.getStockPack(),resultEstado, btnBanco1, btnBanco2};
            model.addRow(ba);
        }
        return model;
    }

}
