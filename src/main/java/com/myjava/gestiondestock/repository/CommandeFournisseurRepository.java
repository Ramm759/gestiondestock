package com.myjava.gestiondestock.repository;

import com.myjava.gestiondestock.entity.CommandeClient;
import com.myjava.gestiondestock.entity.CommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommandeFournisseurRepository extends JpaRepository<CommandeFournisseur, Integer> {

  Optional<CommandeFournisseur> findByCode(String code);

  List<CommandeClient> findAllByFournisseurId(Integer id);
}
