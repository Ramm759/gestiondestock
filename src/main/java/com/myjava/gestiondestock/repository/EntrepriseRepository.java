package com.myjava.gestiondestock.repository;

import com.myjava.gestiondestock.entity.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {

}
