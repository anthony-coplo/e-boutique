package fr.epsi.eboutique.business.service;

import java.util.Collection;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import fr.epsi.eboutique.business.dao.MarqueDao;
import fr.epsi.eboutique.business.entity.Marque;

@Named
public class MarqueService {

  @Inject
  private MarqueDao marqueDao;

  public Collection<Marque> findAll() {
    return this.marqueDao.findAll();
  }

  public Optional<Marque> findByLibelle(String marque) {
    return null;
  }

}
