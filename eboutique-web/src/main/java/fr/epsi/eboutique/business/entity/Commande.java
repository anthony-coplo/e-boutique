package fr.epsi.eboutique.business.entity;

import java.time.LocalDate;
import java.util.Collection;

public class Commande {

  private Long identifier;
  
  private Collection<CommandeLigne> lignes;
  
  private LocalDate dateCreation;

  public Collection<CommandeLigne> getLignes() {
    return lignes;
  }

  public void setLignes(Collection<CommandeLigne> lignes) {
    this.lignes = lignes;
  }

  public LocalDate getDateCreation() {
    return dateCreation;
  }

  public void setDateCreation(LocalDate dateCreation) {
    this.dateCreation = dateCreation;
  }

  public Long getIdentifier() {
    return identifier;
  }

  public void setIdentifier(Long identifier) {
    this.identifier = identifier;
  }
  
  
}
