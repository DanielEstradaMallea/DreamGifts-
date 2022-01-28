/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrasctructure.categoria_mysql_repository;

import java.util.List;
import model.categoria;

/**
 *
 * @author danie
 */
public interface categoria_repository {
    
    public List<model.categoria> listarCategoria() throws Exception;

    public boolean registrarCategoria(categoria categoria) throws Exception;

    public void updateEstadoCategoria(String codigo, String estado) throws Exception;
    
    public List<model.categoria> searchCategoria(String categoria) throws Exception;    
    
}
