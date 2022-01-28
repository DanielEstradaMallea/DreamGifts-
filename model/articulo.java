/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author danie
 */
public class articulo {

    private int idArticulo;
    private String DescripcionArticulo;
    private int stockArticulo;
    private String fechaVencArticulo;
    private boolean estadoArticulo;
    private int IdCatArticulo;
    private int idProvArticulo;
    private String NombreCategoria;
    private String NombreProveedor;
    private int precioArticulo;

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getDescripcionArticulo() {
        return DescripcionArticulo;
    }

    public void setDescripcionArticulo(String DescripcionArticulo) {
        this.DescripcionArticulo = DescripcionArticulo;
    }

    public int getStockArticulo() {
        return stockArticulo;
    }

    public void setStockArticulo(int stockArticulo) {
        this.stockArticulo = stockArticulo;
    }

    public String getFechaVencArticulo() {
        return fechaVencArticulo;
    }

    public void setFechaVencArticulo(String fechaVencArticulo) {
        this.fechaVencArticulo = fechaVencArticulo;
    }

    public boolean isEstadoArticulo() {
        return estadoArticulo;
    }

    public void setEstadoArticulo(boolean estadoArticulo) {
        this.estadoArticulo = estadoArticulo;
    }

    public int getIdCatArticulo() {
        return IdCatArticulo;
    }

    public void setIdCatArticulo(int IdCatArticulo) {
        this.IdCatArticulo = IdCatArticulo;
    }

    public int getIdProvArticulo() {
        return idProvArticulo;
    }

    public void setIdProvArticulo(int idProvArticulo) {
        this.idProvArticulo = idProvArticulo;
    }

    public String getNombreCategoria() {
        return NombreCategoria;
    }

    public void setNombreCategoria(String NombreCategoria) {
        this.NombreCategoria = NombreCategoria;
    }

    public String getNombreProveedor() {
        return NombreProveedor;
    }

    public void setNombreProveedor(String NombreProveedor) {
        this.NombreProveedor = NombreProveedor;
    }

    public int getPrecioArticulo() {
        return precioArticulo;
    }

    public void setPrecioArticulo(int precioArticulo) {
        this.precioArticulo = precioArticulo;
    }

}
