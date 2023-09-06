package com.api.crud.models;

import jakarta.persistence.*;

import javax.lang.model.element.Name;

@Entity
@Table(name = "prestamo")
public class PrestamoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombrePrestatario;

    @Column
    private Long numeroTelefono;

    @Column
    private String direccion;

    @Column
    private  Long idLibro;

    @Column
    private  String libroTitulo;

    @Column
    private String fechaPestamo;

    @Column
    private String fechaEntrega;

    //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrePrestatario() {
        return nombrePrestatario;
    }

    public void setNombrePrestatario(String nombrePrestatario) {
        this.nombrePrestatario = nombrePrestatario;
    }

    public Long getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(Long numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Long idLibro) {
        this.idLibro = idLibro;
    }

    public String getLibroTitulo() {
        return libroTitulo;
    }

    public void setLibroTitulo(String libroTitulo) {
        this.libroTitulo = libroTitulo;
    }

    public String getFechaPestamo() {
        return fechaPestamo;
    }

    public void setFechaPestamo(String fechaPestamo) {
        this.fechaPestamo = fechaPestamo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}