package fr.epsi.eboutique.web.controller.site;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.epsi.eboutique.business.service.MarqueService;

@Controller
public class AccueilController {

  @Inject
  private MarqueService marqueService;
  
  /**
   * Permet d'afficher la page d'accueil
   * 
   * @param critere Critere de reccherche
   * @return
   */
  @GetMapping("/accueil")
  public ModelAndView displayAccueil(@RequestParam(required = false) String critere) {
    ModelAndView mv = new ModelAndView("public/accueil");
    mv.addObject("marques", this.marqueService.findAll());
    
    //TODO Recuperer les 10 premiers produits
    
    //TODO Recuperer le nombre total de produits afin de permettre la pagination
    
    return mv;
  }
  
  
  @GetMapping("/accueil/{marque}")
  public ModelAndView displayMarque(@PathVariable String marque) {
    ModelAndView mv = new ModelAndView("public/accueil");
    mv.addObject("marques", this.marqueService.findAll());
    
    //TODO Recuperer les 10 premiers produits correspondant à la marque recherché
    
    //TODO Recuperer le nombre total de produits correspondant à la marque recherché 
    //afin de permettre la pagination
    
    return mv;
  }
  
  
}
