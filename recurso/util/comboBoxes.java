/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurso.util;

import com.oracle.webservices.internal.api.databinding.DatabindingModeFeature;
import conexion.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.categoria;

/**
 *
 * @author danie
 */
public class comboBoxes extends conexion {

    public void boxCategoria(JComboBox box) {

        DefaultComboBoxModel value;

        try {
            this.connections();
            PreparedStatement pstm = this.conexion.prepareStatement("select * from categoria");

            ResultSet respuesta = pstm.executeQuery();
            value = new DefaultComboBoxModel();
            box.setModel(value);

            while (respuesta.next()) {

                value.addElement(new categoria(respuesta.getInt("id_cat"), respuesta.getString("cat_descripcion")));

            }

        } catch (Exception e) {
        }

    }

    public void boxProveedores(JComboBox box) {

        DefaultComboBoxModel value;

        try {
            this.connections();
            PreparedStatement pstm = this.conexion.prepareStatement("select * from proveedor");

            ResultSet respuesta = pstm.executeQuery();
            value = new DefaultComboBoxModel();
            box.setModel(value);

            while (respuesta.next()) {

                value.addElement(new categoria(respuesta.getInt("id_proveedor"), respuesta.getString("prov_nombre")));

            }

        } catch (Exception e) {
        }

    }

}
