package com.myjava.gestiondestock.repository;

import com.myjava.gestiondestock.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
