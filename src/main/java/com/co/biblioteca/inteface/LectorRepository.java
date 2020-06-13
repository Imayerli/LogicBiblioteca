/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.biblioteca.inteface;

import com.co.biblioteca.models.Lector;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mayer
 */
public interface LectorRepository extends CrudRepository<Lector, String>{
    
    @Override
    public List<Lector> findAll();

    @Override
    public void delete(Lector lector);
    
    @Override
    public Lector save(Lector lector);
    
}
