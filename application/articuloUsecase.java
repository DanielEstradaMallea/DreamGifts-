/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import infrastructure.articulo_mysql_repository.articulo_mysql_repository;
import infrastructure.articulo_mysql_repository.articulo_repository;
import infrastructure.banco_mysql_repository.banco_mysql_repository;
import infrastructure.banco_mysql_repository.banco_repository;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import model.articulo;
import model.banco;

/**
 *
 * @author danie
 */
public class articuloUsecase {

    articulo_repository art = new articulo_mysql_repository();

    public DefaultTableModel listarArticulos() throws Exception {

        List<articulo> articulos = new ArrayList();
        articulos = art.listarArticulo();
        DefaultTableModel model = llenarTabla(articulos);

        return model;
    }

    public DefaultTableModel carritoArticulos() throws Exception {

        List<articulo> articulos = new ArrayList();
        articulos = art.listarArticulo();
        DefaultTableModel model = llenarCarrito(articulos);

        return model;
    }

    public boolean registrarArticulo(articulo articulo) throws Exception {
        if (!articulo.getDescripcionArticulo().equals("")) {

            boolean respuesta = art.registrarArticulo(articulo);

            if (respuesta) {
                System.out.println("se cumplieron condiciones");
                return respuesta;
            } else {
                System.out.println("no se cumplieron condiciones");
                return false;
            }
        } else {
            return false;
        }
    }

    public void updateEstadoArticulo(String codigo, String estado) throws Exception {

        art.updateEstadoArticulo(codigo, estado);
        System.out.println("condicion de estado articulo ok");

    }

    public DefaultTableModel SearchArticulos(String articuloRequest) throws Exception {
        List<articulo> articulos = new ArrayList();
        articulos = art.searchArticulo(articuloRequest);
        DefaultTableModel model = llenarTabla(articulos);

        return model;

    }

    public DefaultTableModel llenarCarrito(List<model.articulo> articulosCarro) {

        String[] titulos = {"ID", "Articulo","Precio"};
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        

                
        for (articulo bn : articulosCarro) {

            Object[] art = {bn.getIdArticulo(), bn.getDescripcionArticulo(), bn.getPrecioArticulo()};

            model.addRow(art);

        }

        return model;

    }

    private DefaultTableModel llenarTabla(List<model.articulo> articulos) {

        String[] titulos = {"Articulo", "ID", "Categoria", "Stock", "Fecha Vencimiento", "Proveedor", "Estado", "Cambiar Estado", "Editar Articulo"};
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        
        JButton btnBanco1 = new JButton("cambiar estado");
        btnBanco1.setName("estado");

        JButton btnBanco2 = new JButton("editar");
        btnBanco2.setName("editar");

        for (articulo bn : articulos) {
            String resultEstado = (bn.isEstadoArticulo()) ? "activado" : "desactivado";
            Object[] art = {bn.getDescripcionArticulo(), bn.getIdArticulo(),
                bn.getNombreCategoria(), bn.getStockArticulo(), bn.getFechaVencArticulo(),
                bn.getNombreProveedor(), resultEstado, btnBanco1, btnBanco2};
            model.addRow(art);
        }
        return model;
    }

}
