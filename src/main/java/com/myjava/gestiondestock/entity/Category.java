package com.myjava.gestiondestock.entity;


import com.myjava.gestiondestock.entity.wihLombok.Article;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;


@Entity
@Table(name = "category")
public class Category extends AbstractEntity {

  @Column(name = "code")
  private String code;

  @Column(name = "designation")
  private String designation;

  @Column(name = "identreprise")
  private Integer idEntreprise;

  @OneToMany(mappedBy = "category")
  private List<Article> articles;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public Integer getIdEntreprise() {
    return idEntreprise;
  }

  public void setIdEntreprise(Integer idEntreprise) {
    this.idEntreprise = idEntreprise;
  }

  public List<Article> getArticles() {
    return articles;
  }

  public void setArticles(List<Article> articles) {
    this.articles = articles;
  }
}
