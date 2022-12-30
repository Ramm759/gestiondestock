package com.myjava.gestiondestock.entity;


import com.myjava.gestiondestock.entity.wihLombok.Article;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "mvtstk")
public class MvtStk extends AbstractEntity {

  @Column(name = "datemvt")
  private Instant dateMvt;

  @Column(name = "quantite")
  private BigDecimal quantite;

  @ManyToOne
  @JoinColumn(name = "idarticle")
  private Article article;

  @Column(name = "typemvt")
  @Enumerated(EnumType.STRING)
  private TypeMvtStk typeMvt;

  @Column(name = "sourcemvt")
  @Enumerated(EnumType.STRING)
  private SourceMvtStk sourceMvt;

  @Column(name = "identreprise")
  private Integer idEntreprise;

  public Instant getDateMvt() {
    return dateMvt;
  }

  public void setDateMvt(Instant dateMvt) {
    this.dateMvt = dateMvt;
  }

  public BigDecimal getQuantite() {
    return quantite;
  }

  public void setQuantite(BigDecimal quantite) {
    this.quantite = quantite;
  }

  public Article getArticle() {
    return article;
  }

  public void setArticle(Article article) {
    this.article = article;
  }

  public TypeMvtStk getTypeMvt() {
    return typeMvt;
  }

  public void setTypeMvt(TypeMvtStk typeMvt) {
    this.typeMvt = typeMvt;
  }

  public SourceMvtStk getSourceMvt() {
    return sourceMvt;
  }

  public void setSourceMvt(SourceMvtStk sourceMvt) {
    this.sourceMvt = sourceMvt;
  }

  public Integer getIdEntreprise() {
    return idEntreprise;
  }

  public void setIdEntreprise(Integer idEntreprise) {
    this.idEntreprise = idEntreprise;
  }
}
