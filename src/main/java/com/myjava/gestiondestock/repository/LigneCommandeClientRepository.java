package com.myjava.gestiondestock.repository;

import com.myjava.gestiondestock.entity.LigneCommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LigneCommandeClientRepository extends CrudRepository<LigneCommandeClient, Integer> {


  List<LigneCommandeClient> findAllByCommandeClientId(Integer id);



  List<LigneCommandeClient> findAllByArticleId(Integer id);
}
