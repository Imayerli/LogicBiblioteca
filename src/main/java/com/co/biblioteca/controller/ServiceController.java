/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.biblioteca.controller;

import com.co.biblioteca.inteface.AutorRepository;
import com.co.biblioteca.inteface.CopiaRepository;
import com.co.biblioteca.inteface.LectorRepository;
import com.co.biblioteca.inteface.LibroRepository;
import com.co.biblioteca.inteface.PrestamoRepository;
import com.co.biblioteca.models.Autor;
import com.co.biblioteca.models.Copia;
import com.co.biblioteca.models.Lector;
import com.co.biblioteca.models.Libro;
import com.co.biblioteca.models.Prestamo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mayer
 */
@RestController
public class ServiceController {
    
     @Autowired
     LibroRepository libroRepository;
     @Autowired
     AutorRepository autorRepository;
     @Autowired
     CopiaRepository copiaRepository;
     @Autowired
     LectorRepository lectorRepository;
     @Autowired
     PrestamoRepository prestamoRepository;
     
     
   
    @GetMapping
    public String home(){
        return "Hola mundo";
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/libros")
    public List<Libro> libro() {
        return libroRepository.findAll();
    }
   
    @RequestMapping(method=RequestMethod.POST, value="/libros")
    public Libro saveLibro(@RequestBody Libro libro) {
        return libroRepository.save(libro);
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/autores")
    public List<Autor> autor() {
        return autorRepository.findAll();
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/autores")
    public Autor saveAutores(@RequestBody Autor autor) {
        return autorRepository.save(autor);
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/copia")
    public List<Copia> copia() {
        return copiaRepository.findAll();
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/copia")
    public Copia saveCopia(@RequestBody Copia copia) {
        return copiaRepository.save(copia);
    }
   
    
    @RequestMapping(method=RequestMethod.GET, value="/lector")
    public List<Lector> lector() {
        return lectorRepository.findAll();
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/lector")
    public Lector saveLector(@RequestBody Lector lector) {
        return lectorRepository.save(lector);
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/prestamo")
    public List<Prestamo> prestamo() {
        return prestamoRepository.findAll();
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/prestamo")
    public Prestamo savePrestamo(@RequestBody Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }
     
    
}
