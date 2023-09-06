package com.api.crud.controllers;

import com.api.crud.models.LibroModel;
import com.api.crud.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public ArrayList<LibroModel> getLibros(){
        return this.libroService.getLibros();
    }

    @PostMapping
    public LibroModel saveLibro(@RequestBody LibroModel libro){
        return this.libroService.saveLibro(libro);
    }

    @GetMapping(path = "/{id}")
    public Optional<LibroModel> getLibroByid(@PathVariable ("id") long id){
        return this.libroService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public LibroModel updateLibroById(@RequestBody LibroModel request, @PathVariable("id") Long id){
        return this.libroService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteLibroById(@PathVariable("id") Long id){
        boolean ok = this.libroService.deleteLibro(id);

        if (ok){
            return "Libro de ID:(" + id + ") fue eliminado!";
        }
        else {
            return "Error, tenemos un problema con el libro de ID:" + id ;
        }
    }
}
