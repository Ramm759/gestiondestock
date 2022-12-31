package com.myjava.gestiondestock.repository;

import com.myjava.gestiondestock.entity.Ventes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VentesRepository extends JpaRepository<Ventes, Integer> {

  Optional<Ventes> findVentesByCode(String code);
}
