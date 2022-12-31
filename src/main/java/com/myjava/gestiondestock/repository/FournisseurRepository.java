package com.myjava.gestiondestock.repository;

import com.myjava.gestiondestock.entity.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {

}
