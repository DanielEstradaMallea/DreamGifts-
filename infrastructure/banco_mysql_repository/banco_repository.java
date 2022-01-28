/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.banco_mysql_repository;

import model.banco;
import java.util.List;

/**
 *
 * @author claudio
 */
public interface banco_repository {

    public List<model.banco> listarBanco() throws Exception;

    public boolean registrarBanco(banco banco) throws Exception;

    public void updateEstadoBanco(String codigo, String estado) throws Exception;
    
    public List<model.banco> searchBancos(String banco) throws Exception;
}
