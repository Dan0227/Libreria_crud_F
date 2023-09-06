package com.api.crud.repositories;

import com.api.crud.models.LibroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IULibroRepository extends JpaRepository<LibroModel, Long> {
}