/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.comuna_mysql_repository.folder;

import infrastructure.banco_mysql_repository.*;
import model.*;
import java.util.List;

/**
 *
 * @author claudio
 */
public interface comuna_repository {

    public List<model.comuna> listarComuna() throws Exception;

    public boolean registrarComuna(comuna comuna) throws Exception;

    public void updateEstadoComuna(String codigo, String estado) throws Exception;
    
    public List<model.comuna> searchComunas(String comuna) throws Exception;
}
