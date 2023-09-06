package com.api.crud.repositories;

import com.api.crud.models.PrestamoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUPrestamoRepository extends JpaRepository <PrestamoModel, Long> {
}
