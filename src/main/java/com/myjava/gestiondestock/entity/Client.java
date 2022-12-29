package com.myjava.gestiondestock.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "client")
public class Client extends AbstractEntity {

  @Column(name = "nom")
  private String nom;

  @Column(name = "prenom")
  private String prenom;

  @ManyToOne
  @JoinColumn(name = "adresse_id")
  private Adresse adresse;

  @Column(name = "photo")
  private String photo;

  @Column(name = "mail")
  private String mail;

  @Column(name = "numTel")
  private String numTel;

  @Column(name = "identreprise")
  private Integer idEntreprise;

  @OneToMany(mappedBy = "client")
  private List<CommandeClient> commandeClients;



}
