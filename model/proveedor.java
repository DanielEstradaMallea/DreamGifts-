package model;

public class proveedor {  

    private int idproveedor;
    private String proveedor;
    private boolean estadoproveedor;

    private String provnombre;
    private String provfono;
    private String provmail;
    private String provdireccion;
    private String provrut;

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getproveedor() {
        return proveedor;
    }

    public void setproveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public boolean isEstadoproveedor() {
        return estadoproveedor;
    }

    public void setEstadoproveedor(boolean estadoproveedor) {
        this.estadoproveedor = estadoproveedor;
    }

    public String getprovnombre() {
        return provnombre;
    }

    public void setprovnombre(String provnombre) {
        this.provnombre = provnombre;
    }

    public String getprovmail() {
        return provmail;
    }

    public void setprovmail(String provmail) {
        this.provmail = provmail;
    }

    public String getprovdireccion() {
        return provdireccion;
    }

    public void setprovdireccion(String provdireccion) {
        this.provdireccion = provdireccion;
    }

    public String getprovfono() {
        return provfono;
    }

    public void setprovfono(String provfono) {
        this.provfono = provfono;
    }

    public String getprovrut() {
        return provrut;
    }

    public void setprovrut(String provrut) {
        this.provrut = provrut;
    }
}
