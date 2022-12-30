package com.myjava.gestiondestock.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity {

  @Column(name = "nom")
  private String nom;

  @Column(name = "prenom")
  private String prenom;

  @Column(name = "email")
  private String email;

  @Column(name = "datedenaissance")
  private Instant dateDeNaissance;

  @Column(name = "motdepasse")
  private String moteDePasse;

  @Embedded
  private Adresse adresse;

  @Column(name = "photo")
  private String photo;

  @ManyToOne
  @JoinColumn(name = "identreprise")
  private Entreprise entreprise;


  @OneToMany(fetch = FetchType.EAGER, mappedBy = "utilisateur")
  @JsonIgnore
  private List<Roles> roles;

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Instant getDateDeNaissance() {
    return dateDeNaissance;
  }

  public void setDateDeNaissance(Instant dateDeNaissance) {
    this.dateDeNaissance = dateDeNaissance;
  }

  public String getMoteDePasse() {
    return moteDePasse;
  }

  public void setMoteDePasse(String moteDePasse) {
    this.moteDePasse = moteDePasse;
  }

  public Adresse getAdresse() {
    return adresse;
  }

  public void setAdresse(Adresse adresse) {
    this.adresse = adresse;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public Entreprise getEntreprise() {
    return entreprise;
  }

  public void setEntreprise(Entreprise entreprise) {
    this.entreprise = entreprise;
  }

  public List<Roles> getRoles() {
    return roles;
  }

  public void setRoles(List<Roles> roles) {
    this.roles = roles;
  }
}
