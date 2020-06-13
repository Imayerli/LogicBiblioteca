/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.biblioteca.inteface;

import com.co.biblioteca.models.Autor;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mayer
 */
public interface AutorRepository extends CrudRepository<Autor, String>{
    
    @Override
    public List<Autor> findAll();

    @Override
    public void delete(Autor autor);
    
    @Override
    public Autor save(Autor autor);
}

