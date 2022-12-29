package com.myjava.gestiondestock.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.Instant;
import java.util.List;


@Entity
@Table(name = "ventes")
public class Ventes extends AbstractEntity {

  @Column(name = "code")
  private String code;

  @Column(name = "datevente")
  private Instant dateVente;

  @Column(name = "commentaire")
  private String commentaire;

  @Column(name = "identreprise")
  private Integer idEntreprise;

  @OneToMany(mappedBy = "vente")
  private List<LigneVente> ligneVentes;
}
