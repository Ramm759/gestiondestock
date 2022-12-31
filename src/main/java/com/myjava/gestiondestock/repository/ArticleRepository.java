package com.myjava.gestiondestock.repository;

import com.myjava.gestiondestock.entity.wihLombok.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
  Optional<Article> findByCodeArticle(String codeArticle);

  List<Article> findAllByCategoryId(Integer idCategory);


}
