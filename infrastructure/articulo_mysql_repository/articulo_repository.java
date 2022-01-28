/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.articulo_mysql_repository;

import java.util.ArrayList;
import model.articulo;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author claudio
 */
public interface articulo_repository {

    public List<model.articulo> listarArticulo() throws Exception;

    public boolean registrarArticulo(articulo articulo) throws Exception;

    public void updateEstadoArticulo(String codigo, String estado) throws Exception;
    
    public List<model.articulo> searchArticulo(String articulo) throws Exception;    
   
}
