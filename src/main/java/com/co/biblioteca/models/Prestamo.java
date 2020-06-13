/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.biblioteca.models;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author mayer
 */
@Document(collection = "prestamo")
public class Prestamo {
    
    @Id
    private Object _id;
    private Date f_entrega;
    private Date f_devolucion;
    private String multa;
    private String isbn;
    
    public Prestamo() {
        
    }

    public Prestamo(Object _id, Date f_entrega,Date f_devolucion,String multa ,String isbn){
        this._id = _id;
        this.f_entrega = f_entrega;
        this.f_devolucion = f_devolucion;
        this.multa = multa;
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
     * @return the f_entrega
     */
    public Date getF_entrega() {
        return f_entrega;
    }

    /**
     * @param f_entrega the f_entrega to set
     */
    public void setF_entrega(Date f_entrega) {
        this.f_entrega = f_entrega;
    }

    /**
     * @return the f_devolucion
     */
    public Date getF_devolucion() {
        return f_devolucion;
    }

    /**
     * @param f_devolucion the f_devolucion to set
     */
    public void setF_devolucion(Date f_devolucion) {
        this.f_devolucion = f_devolucion;
    }

    /**
     * @return the multa
     */
    public String getMulta() {
        return multa;
    }

    /**
     * @param multa the multa to set
     */
    public void setMulta(String multa) {
        this.multa = multa;
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
