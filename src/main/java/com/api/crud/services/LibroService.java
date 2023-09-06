package com.api.crud.services;

import com.api.crud.models.LibroModel;
import com.api.crud.repositories.IULibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    IULibroRepository libroRepository;

    public ArrayList<LibroModel> getLibros() {
        return (ArrayList<LibroModel>) libroRepository.findAll();
    }

    public LibroModel saveLibro(LibroModel libro) {
        return libroRepository.save(libro);
    }

    public Optional<LibroModel> getById(Long id) {
        return libroRepository.findById(id);
    }

    public LibroModel updateById(LibroModel request, Long id){
        LibroModel libro = libroRepository.findById(id).get();

        libro.setTitulo(request.getTitulo());
        libro.setAutor(request.getAutor());
        libro.setAñoPublicacion(request.getAñoPublicacion());
        libro.setDisponivilidad(request.getDisponivilidad());

        return libro;
    }

    public Boolean deleteLibro (Long id){
        try{
            libroRepository.deleteById(id);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}