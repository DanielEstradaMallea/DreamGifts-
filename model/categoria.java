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
public class categoria {
    
    int idCategoria;
    String Categoria;
    boolean estadoCategoria;

    public categoria(int idCategoria, String Categoria) {
        this.idCategoria = idCategoria;
        this.Categoria = Categoria;
       
    }

    public categoria() {
    }

   

    @Override
    public String toString() {
        return this.Categoria;
    }


    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public boolean isEstadoCategoria() {
        return estadoCategoria;
    }

    public void setEstadoCategoria(boolean estadoCategoria) {
        this.estadoCategoria = estadoCategoria;
    }
    
    
    
}
