package com.myjava.gestiondestock.repository;


import com.myjava.gestiondestock.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
  Optional<Category> findByCode(String code);


}
