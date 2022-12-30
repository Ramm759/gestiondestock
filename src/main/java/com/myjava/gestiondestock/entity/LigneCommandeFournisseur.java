package com.myjava.gestiondestock.entity;

import com.myjava.gestiondestock.entity.wihLombok.Article;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "lignecommandefournisseur")
public class LigneCommandeFournisseur extends AbstractEntity {

  @ManyToOne
  @JoinColumn(name = "idarticle")
  private Article article;

  @ManyToOne
  @JoinColumn(name = "idcommandefournisseur")
  private CommandeFournisseur commandeFournisseur;

  @Column(name = "quantite")
  private BigDecimal quantite;

  @Column(name = "prixunitaire")
  private BigDecimal prixUnitaire;

  @Column(name = "identreprise")
  private Integer idEntreprise;

  public Article getArticle() {
    return article;
  }

  public void setArticle(Article article) {
    this.article = article;
  }

  public CommandeFournisseur getCommandeFournisseur() {
    return commandeFournisseur;
  }

  public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
    this.commandeFournisseur = commandeFournisseur;
  }

  public BigDecimal getQuantite() {
    return quantite;
  }

  public void setQuantite(BigDecimal quantite) {
    this.quantite = quantite;
  }

  public BigDecimal getPrixUnitaire() {
    return prixUnitaire;
  }

  public void setPrixUnitaire(BigDecimal prixUnitaire) {
    this.prixUnitaire = prixUnitaire;
  }

  public Integer getIdEntreprise() {
    return idEntreprise;
  }

  public void setIdEntreprise(Integer idEntreprise) {
    this.idEntreprise = idEntreprise;
  }
}
