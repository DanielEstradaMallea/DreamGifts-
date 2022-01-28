/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import infrasctructure.categoria_mysql_repository.categoria_mysql_repository;
import infrasctructure.categoria_mysql_repository.categoria_repository;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import model.categoria;

/**
 *
 * @author danie
 */
public class categoriaUsecase {
    
    categoria_repository b = new categoria_mysql_repository();

    public DefaultTableModel listarCategorias() throws Exception {

        List<categoria> categoria = new ArrayList();
        categoria = b.listarCategoria();

        DefaultTableModel model = llenarTabla(categoria);

        return model;
    }
    
    

    public boolean registrarCategoria(categoria categoria) throws Exception {
        if (!categoria.getCategoria().equals("")) {
            boolean respuesta = b.registrarCategoria(categoria);

            if (respuesta) {
                return respuesta;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void updateEstadoCategoria(String codigo, String estado) throws Exception {

        b.updateEstadoCategoria(codigo, estado);

    }

    public DefaultTableModel SearchCategorias(String categoriaRequest) throws Exception {
        List<categoria> categorias = new ArrayList();
        categorias = b.searchCategoria(categoriaRequest);
        DefaultTableModel model = llenarTabla(categorias);

        return model;

    }

    private DefaultTableModel llenarTabla(List<model.categoria> categoria) {

        String[] titulos = {"Categoria", "ID", "Estado", "Cambiar Estado", "Editar Banco"};
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        JButton btn1 = new JButton("estado");
        btn1.setName("estado");

        JButton btn2 = new JButton("editar");
        btn2.setName("editar");

        for (categoria bn : categoria) {
            String resultEstado = (bn.isEstadoCategoria()) ? "activado" : "desactivado";
            Object[] ba = {bn.getCategoria(),bn.getIdCategoria(),resultEstado, btn1, btn2};
            model.addRow(ba);
        }
        return model;
    }

    
}
