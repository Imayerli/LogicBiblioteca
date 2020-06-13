/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.biblioteca.inteface;

import com.co.biblioteca.models.Libro;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mayer
 */

public interface LibroRepository extends CrudRepository<Libro, String>{
    
    @Override
    public List<Libro> findAll();

    @Override
    public void delete(Libro libro);
    
    @Override
    public Libro save(Libro libro);
}
