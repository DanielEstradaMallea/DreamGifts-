package application;

import infrastructure.proveedor_mysql_repository.proveedor_mysql_repository;
import infrastructure.proveedor_mysql_repository.proveedor_repository;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import model.proveedor;


public class proveedorUsecase {

    proveedor_repository b = new proveedor_mysql_repository();

    public DefaultTableModel listarproveedors() throws Exception {

        List<proveedor> proveedors = new ArrayList();
        proveedors = b.listarproveedor();

        DefaultTableModel model = llenarTabla(proveedors);

        return model;
    }

    public boolean registrarproveedor(proveedor proveedor) throws Exception {
        if (!proveedor.getproveedor().equals("")) {
            boolean respuesta = b.registrarproveedor(proveedor);
            
          

            if (respuesta) {
                return respuesta;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void updateEstadoproveedor(String codigo, String estado) throws Exception {

        b.updateEstadoproveedor(codigo, estado);

    }

    public DefaultTableModel Searchproveedors(String proveedorRequest) throws Exception {
        List<proveedor> proveedors = new ArrayList();
        proveedors = b.searchproveedors(proveedorRequest);
        DefaultTableModel model = llenarTabla(proveedors);

        return model;

    }

    private DefaultTableModel llenarTabla(List<model.proveedor> proveedors) {

        String[] titulos = {"ID","Razón Social", "Nombre Contacto", "Teléfono", "E-mail", "Estado","Cambiar Estado", "Editar Proveedor"};

        DefaultTableModel model = new DefaultTableModel(null, titulos);
        JButton btn1 = new JButton("estado");
        btn1.setName("estado");

        JButton btn2 = new JButton("editar");
        btn2.setName("editar");

        for (proveedor bn : proveedors) {
            String resultEstado = (bn.isEstadoproveedor()) ? "activado" : "desactivado";
            Object[] ba = {bn.getIdproveedor(),bn.getproveedor(),bn.getprovnombre(),bn.getprovfono(),bn.getprovmail(), resultEstado, btn1, btn2};
            model.addRow(ba);
        }
        return model;
    }
}
