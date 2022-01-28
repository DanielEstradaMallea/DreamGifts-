/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.pack_mysql_repository;

import java.util.List;

/**
 *
 * @author danie
 */
public interface pack_repository {

    public List<model.pack> listarPack() throws Exception;

    public void updateEstadoPack(String codigo, String estado) throws Exception;

    public List<model.pack> searchPacks(String pack) throws Exception;

}
