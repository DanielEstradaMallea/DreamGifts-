/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author danie
 */
public class pack {
    
    private int idPack;
    private String nombrePack;
    private String costoPack;
    private int stockPack;
    private boolean estadoPack;
    private int cantidadArticulosPack;
    private int IdArticuloHasPack;
    private int idPackhasArticulo;

    public int getIdPack() {
        return idPack;
    }

    public void setIdPack(int idPack) {
        this.idPack = idPack;
    }

    public String getNombrePack() {
        return nombrePack;
    }

    public void setNombrePack(String nombrePack) {
        this.nombrePack = nombrePack;
    }

    public String getCostoPack() {
        return costoPack;
    }

    public void setCostoPack(String costoPack) {
        this.costoPack = costoPack;
    }

    public int getStockPack() {
        return stockPack;
    }

    public void setStockPack(int stockPack) {
        this.stockPack = stockPack;
    }

    public boolean isEstadoPack() {
        return estadoPack;
    }

    public void setEstadoPack(boolean estadoPack) {
        this.estadoPack = estadoPack;
    }

    public int getCantidadArticulosPack() {
        return cantidadArticulosPack;
    }

    public void setCantidadArticulosPack(int cantidadArticulosPack) {
        this.cantidadArticulosPack = cantidadArticulosPack;
    }

    public int getIdArticuloHasPack() {
        return IdArticuloHasPack;
    }

    public void setIdArticuloHasPack(int IdArticuloHasPack) {
        this.IdArticuloHasPack = IdArticuloHasPack;
    }

    public int getIdPackhasArticulo() {
        return idPackhasArticulo;
    }

    public void setIdPackhasArticulo(int idPackhasArticulo) {
        this.idPackhasArticulo = idPackhasArticulo;
    }
    
    
    

    
    
    
    
}
