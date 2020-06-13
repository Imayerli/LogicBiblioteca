/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.biblioteca.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author mayer
 */
@Document(collection = "copia")
public class Copia {
    
    @Id
    private Object _id;
    private String estado;
    private String isbn;
    
    public Copia() {
        
    }

    public Copia(Object _id, String estado, String isbn){
        this._id = _id;
        this.estado = estado;
        this.isbn = isbn;
        
    }

    /**
     * @return the _id
     */
    public Object getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(Object _id) {
        this._id = _id;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    
    
}
