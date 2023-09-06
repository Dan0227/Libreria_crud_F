package com.api.crud.services;

import com.api.crud.models.LibroModel;
import com.api.crud.models.PrestamoModel;
import com.api.crud.repositories.IUPrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PrestamoService {

    @Autowired
    IUPrestamoRepository prestamoRepository;

    public ArrayList<PrestamoModel> getPrestamo() {
        return (ArrayList<PrestamoModel>) prestamoRepository.findAll();
    }

    public PrestamoModel savePrestamo(PrestamoModel prestamo) {
        return prestamoRepository.save(prestamo);
    }

    public Optional<PrestamoModel> getById(Long id) {
        return prestamoRepository.findById(id);
    }

    public PrestamoModel updateById(PrestamoModel request, Long id) {
        PrestamoModel prestamo = prestamoRepository.findById(id).get();

        prestamo.setNombrePrestatario(request.getNombrePrestatario());
        prestamo.setNumeroTelefono(request.getNumeroTelefono());
        prestamo.setDireccion(request.getDireccion());
        prestamo.setIdLibro(request.getIdLibro());
        prestamo.setLibroTitulo(request.getLibroTitulo());
        prestamo.setFechaPestamo(request.getFechaPestamo());
        prestamo.setFechaEntrega(request.getFechaEntrega());

        return prestamo;
    }

    public Boolean deletePrestamo (Long id){
        try{
            prestamoRepository.deleteById(id);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}