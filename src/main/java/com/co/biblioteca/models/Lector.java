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
@Document(collection = "lector")
public class Lector {
    
    @Id
    private Object _id;
    private String identificacion;
    private String nombre;
    private String telefono;
    private String estado;
    
    
    public Lector() {
        
    }

    public Lector(Object _id, String identificacion, String nombre, String telefono, String estado){
        this._id = _id;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.estado = estado;
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
     * @return the identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
    
    

    
}
