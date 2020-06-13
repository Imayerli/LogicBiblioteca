/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.biblioteca.inteface;

import com.co.biblioteca.models.Copia;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mayer
 */
public interface CopiaRepository extends CrudRepository<Copia, String>{
    @Override
    public List<Copia> findAll();

    @Override
    public void delete(Copia copia);
    
    @Override
    public Copia save(Copia copia);
}
