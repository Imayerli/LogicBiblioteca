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
@Document(collection = "libro")
public class Libro {
    
    @Id
    private Object _id;
    private String titulo;
    private String tipo_libro;
    private String editorial;
    private String anio;
    private String isbn;
    private String portada;
    private String id_autor;

    
     public Libro() {
    }

    public Libro(Object _id,String titulo, String tipo_libro,String editorial, String anio, String isbn, String portada, String id_autor) {
        this._id=_id;
        this.titulo = titulo;
        this.tipo_libro = tipo_libro;
        this.editorial = editorial;
        this.anio = anio;
        this.isbn =  isbn;
        this.portada = portada;
        this.id_autor = id_autor;
    }
    
 

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the tipo_libro
     */
    public String getTipo_libro() {
        return tipo_libro;
    }

    /**
     * @param tipo_libro the tipo_libro to set
     */
    public void setTipo_libro(String tipo_libro) {
        this.tipo_libro = tipo_libro;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the anio
     */
    public String getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(String anio) {
        this.anio = anio;
    }

    /**
     * @return the ISBN
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setIsbn(String isbn) {
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
     * @return the portada
     */
    public String getPortada() {
        return portada;
    }

    /**
     * @param portada the portada to set
     */
    public void setPortada(String portada) {
        this.portada = portada;
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
