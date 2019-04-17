package fr.epsi.eboutique.business.dao;

import java.util.Collection;
import java.util.Collections;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.epsi.eboutique.business.entity.Marque;

@Named
public class MarqueDao {
  
  /**
   * Permet de récupérer l'entity manager via le CDI 
   */
  @PersistenceContext
  private EntityManager em;
  
  public Collection<Marque> findAll(){
    return Collections.emptyList();
  }
}
