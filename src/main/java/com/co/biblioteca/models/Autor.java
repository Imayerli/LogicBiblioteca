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
@Document(collection = "autor")
public class Autor {
    
    @Id
    private Object _id;
    private String nombre;
    private String nacionalidad;
    private String f_nacimiento;
    private String id_autor;
    
    
    public Autor() {
        
    }

    public Autor(Object _id, String nombre, String nacionalidad, String f_nacimiento, String id_autor){
        this._id = _id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.f_nacimiento = f_nacimiento;
        this.id_autor=id_autor;
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
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the f_nacimiento
     */
    public String getF_nacimiento() {
        return f_nacimiento;
    }

    /**
     * @param f_nacimiento the f_nacimiento to set
     */
    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    /**
     * @return the id_autor
     */
    public String getId_autor() {
        return id_autor;
    }

    /**
     * @param id_autor the id_autor to set
     */
    public void setId_autor(String id_autor) {
        this.id_autor = id_autor;
    }
    
    
    
    
    
    
    
    
}
