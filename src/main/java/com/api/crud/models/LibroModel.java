package com.api.crud.models;

import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class LibroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String titulo;

    @Column
    private String autor;

    @Column
    private int añoPublicacion;

    @Column
    private String disponivilidad;

    // getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getDisponivilidad() {
        return disponivilidad;
    }

    public void setDisponivilidad(String disponivilidad) {
        this.disponivilidad = disponivilidad;
    }
}

