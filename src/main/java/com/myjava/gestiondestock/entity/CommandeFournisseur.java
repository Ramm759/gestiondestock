package com.myjava.gestiondestock.entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;


@Entity
@Table(name = "commandefournisseur")
public class CommandeFournisseur extends AbstractEntity {

  @Column(name = "code")
  private String code;

  @Column(name = "datecommande")
  private Instant dateCommande;

  @Column(name = "etatcommande")
  @Enumerated(EnumType.STRING)
  private EtatCommande etatCommande;

  @Column(name = "identreprise")
  private Integer idEntreprise;

  @ManyToOne
  @JoinColumn(name = "idfournisseur")
  private Fournisseur fournisseur;

  @OneToMany(mappedBy = "commandeFournisseur")
  private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;


}
