/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.cliente_mysql_repository;

import java.util.List;
import model.*;

/**
 *
 * @author Jorge
 */
public interface cliente_repository {
    
    public List<model.cliente> ListarCliente() throws Exception;
    
    public boolean registrarCliente(cliente cliente) throws Exception;

    public void updateEstadoCliente(String codigo, String estado) throws Exception;
    
    public List<model.cliente> searchCliente(String cliente) throws Exception;

    
    
}
