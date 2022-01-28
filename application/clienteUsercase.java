/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import infrastructure.cliente_mysql_repository.cliente_mysql_repository;
import infrastructure.cliente_mysql_repository.cliente_repository;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import model.cliente;

/**
 *
 * @author danie
 */
public class clienteUsercase {

    cliente_repository cli = new cliente_mysql_repository();

    public DefaultTableModel ListarCliente() throws Exception {

        List<cliente> clientes = new ArrayList();
        clientes = cli.ListarCliente();
        DefaultTableModel model = llenarTabla(clientes);
        
        return model;
    }

    /*public DefaultTableModel carritoArticulos() throws Exception {

        List<articulo> articulos = new ArrayList();
        articulos = art.listarArticulo();
        DefaultTableModel model = llenarCarrito(articulos);

        return model;
    }*/

    public boolean registrarCliente(cliente cliente) throws Exception {
        if (!cliente.getNombreCliente().equals("")) {

            boolean respuesta = cli.registrarCliente(cliente);

            if (respuesta) {
                System.out.println("ok");
                return respuesta;
            } else {
                System.out.println("error");
                return false;
            }
        } else {
            return false;
        }
    }

    public void updateEstadoCliente(String codigo, String estado) throws Exception {

        cli.updateEstadoCliente(codigo, estado);
        System.out.println("ok");

    }

    public DefaultTableModel SearchCliente(String clienteRequest) throws Exception {
        List<cliente> clientes = new ArrayList();
        clientes = cli.searchCliente(clienteRequest);
        DefaultTableModel model = llenarTabla(clientes);

        return model;

    }

    /*public DefaultTableModel llenarCarrito(List<model.articulo> articulosCarro) {

        String[] titulos = {"ID", "Articulo", "Stock"};
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        for (articulo bn : articulosCarro) {

            Object[] art = {bn.getIdArticulo(), bn.getDescripcionArticulo(), bn.getStockArticulo()};

            model.addRow(art);

        }

        return model;

    }*/

    private DefaultTableModel llenarTabla(List<model.cliente> clientes) {

        String[] titulos = {"ID", "Nombre", "Apellido", "Direccion", "Telefono", "E-mail", "Estado","Canal","Comuna", "Cambiar Estado", "Editar"};
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        JButton btnBanco1 = new JButton("estado");
        btnBanco1.setName("estado");

        JButton btnBanco2 = new JButton("editar");
        btnBanco2.setName("editar");

        for (cliente bn : clientes) {
            String resultEstado = (bn.isEstadoCliente()) ? "activado" : "desactivado";
            Object[] cli = {bn.getIdCliente(),bn.getNombreCliente(), bn.getApellidoCliente(),
                bn.getDireccionCliente(), bn.getTelefonoCliente(), bn.getEmailCliente(),
                resultEstado, bn.getCanalCliente(),bn.getComunaCliente(), btnBanco1, btnBanco2};
            model.addRow(cli);
        }
        return model;
    }

}
