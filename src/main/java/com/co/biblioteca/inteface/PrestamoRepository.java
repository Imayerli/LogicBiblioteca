/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.biblioteca.inteface;

import com.co.biblioteca.models.Prestamo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mayer
 */
public interface PrestamoRepository  extends CrudRepository<Prestamo, String>{
    
    @Override
    public List<Prestamo> findAll();

    @Override
    public void delete(Prestamo prestamo);
    
    @Override
    public Prestamo save(Prestamo prestamo);
}
