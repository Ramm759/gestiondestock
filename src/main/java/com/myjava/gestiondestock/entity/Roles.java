package com.myjava.gestiondestock.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Roles extends AbstractEntity {

  @Column(name = "rolename")
  private String roleName;

  @ManyToOne
  @JoinColumn(name = "idutilisateur")
  private Utilisateur utilisateur;

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public Utilisateur getUtilisateur() {
    return utilisateur;
  }

  public void setUtilisateur(Utilisateur utilisateur) {
    this.utilisateur = utilisateur;
  }
}
