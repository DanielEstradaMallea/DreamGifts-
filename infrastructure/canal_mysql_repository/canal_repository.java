/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.canal_mysql_repository;


import model.*;
import java.util.List;

/**
 *
 * @author claudio
 */
public interface canal_repository {

    public List<model.canal> listarCanal() throws Exception;

    public boolean registrarCanal(canal canal) throws Exception;

    public void updateEstadoCanal(String codigo, String estado) throws Exception;
    
    public List<model.canal> searchCanal(String comuna) throws Exception;
}

