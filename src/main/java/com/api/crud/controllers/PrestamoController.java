package com.api.crud.controllers;

import com.api.crud.models.LibroModel;
import com.api.crud.models.PrestamoModel;
import com.api.crud.services.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/prestamo")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

    @GetMapping
    public ArrayList<PrestamoModel> getPrestamo(){
        return this.prestamoService.getPrestamo();
    }

    @PostMapping
    public PrestamoModel savePrestamo(@RequestBody PrestamoModel prestamo){
        return this.prestamoService.savePrestamo(prestamo);
    }

    @GetMapping(path = "/{id}")
    public Optional<PrestamoModel> getPrestamoByid(@PathVariable ("id") long id){
        return this.prestamoService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public PrestamoModel updatePrestamoById(@RequestBody PrestamoModel request, @PathVariable("id") Long id){
        return this.prestamoService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deletePrestamoById(@PathVariable("id") Long id){
        boolean ok = this.prestamoService.deletePrestamo(id);

        if (ok){
            return "Prestamo de ID:(" + id + ") fue eliminado!";
        }
        else {
            return "Error, tenemos un problema con el pretamo de ID:" + id ;
        }
    }
}