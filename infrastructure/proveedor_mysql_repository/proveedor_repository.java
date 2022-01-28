package infrastructure.proveedor_mysql_repository;

import model.*;
import java.util.List;


public interface proveedor_repository {

    public List<model.proveedor> listarproveedor() throws Exception;

    public boolean registrarproveedor(proveedor proveedor) throws Exception;

    public void updateEstadoproveedor(String codigo, String estado) throws Exception;
    
    public List<model.proveedor> searchproveedors(String proveedor) throws Exception;
}
