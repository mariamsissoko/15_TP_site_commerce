package com.intiformation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.intiformation.metier.Categorie;
import com.intiformation.metier.GestionPanier;
import com.intiformation.metier.Panier;
import com.intiformation.metier.Produit;
import com.intiformation.service.InternauteBoutique;


@Controller
public class InternauteController {

	//declaration du service
	@Autowired
	private InternauteBoutique fonctionnaireManager;

	/**
	 * setter pour injection spring
	 * @param fonctionnaireService
	 */

	public void setFonctionnaireService(InternauteBoutique fonctionnaireManager) {
		this.fonctionnaireManager = fonctionnaireManager;
	}
	
	/**
	 * 
	 * @param modele : modele de donn�es a retrouner vers la vue. 
	 * @return le nom logique de la vue.
	 */
	@RequestMapping(value="/eboutique", method=RequestMethod.GET)
	public String listerProduits(ModelMap modele) {
		//appel du serrvice pour r�cup�rer la liste des fonctionnaire dans la bdd
		List<Produit> listeProd = fonctionnaireManager.listproduitsServ();
		
		//donn�es a retourner vers la vue
		modele.addAttribute("produits", listeProd);
		
		Panier n = GestionPanier.getPan();
		
		//donn�es a retourner vers la vue
	    modele.addAttribute("panier", n);
		
	    List<Categorie> listeCat =fonctionnaireManager.listCategoriesServ();
	    
	    modele.addAttribute("categories", listeCat);
	    
		//renvoie du nom logique de la vue
		//'fonctionnaires' --> /WEB-INF/views/fonctionnaires.jsp
		return "eboutique";
		
	}
	
	@RequestMapping(value="/eboutique", method=RequestMethod.GET)
	public String listerProduitsCat(@PathVariable("idCat") Long pIdCat,
			ModelMap modele) {
		//appel du serrvice pour r�cup�rer la liste des fonctionnaire dans la bdd
		List<Produit> listeProd = fonctionnaireManager.produitsParCategorieServ(pIdCat);
		
		//donn�es a retourner vers la vue
		modele.addAttribute("produits", listeProd);
		
		Panier n = GestionPanier.getPan();
		
		//donn�es a retourner vers la vue
	    modele.addAttribute("panier", n);
		
	    List<Categorie> listeCat =fonctionnaireManager.listCategoriesServ();
	    
	    modele.addAttribute("categories", listeCat);
	    
		//renvoie du nom logique de la vue
		//'fonctionnaires' --> /WEB-INF/views/fonctionnaires.jsp
		return "eboutique";
		
	}
	
	@RequestMapping(value="/eboutique", method=RequestMethod.GET)
	public String listerProduitsMotsCles(@PathVariable("idMC") String pIdMC,
			ModelMap modele) {
		//appel du service pour r�cup�rer la liste des fonctionnaire dans la bdd
		List<Produit> listeProd = fonctionnaireManager.produitsParMotCleServ(pIdMC);
		
		//donn�es a retourner vers la vue
		modele.addAttribute("produits", listeProd);
		
		Panier n = GestionPanier.getPan();
		
		//donn�es a retourner vers la vue
	    modele.addAttribute("panier", n);
		
	    List<Categorie> listeCat =fonctionnaireManager.listCategoriesServ();
	    
	    modele.addAttribute("categories", listeCat);
		
		//renvoie du nom logique de la vue
		//'fonctionnaires' --> /WEB-INF/views/fonctionnaires.jsp
		return "eboutique";
	
	}
	
	@RequestMapping(value="/eboutique/addPanier?idProduit={idProd}&quantite={quantite}", method=RequestMethod.GET)
	public String ajouterPanier(@PathVariable("idProd") int pIdProd, @PathVariable("quantite") int pQuantite,
			ModelMap modele) {
		
		//appel du serrvice pour r�cup�rer la liste des fonctionnaire dans la bdd
		List<Produit> listeProd = fonctionnaireManager.listproduitsServ();
				
	    //donn�es a retourner vers la vue
		modele.addAttribute("produits", listeProd);
				
		GestionPanier.addProduct(pIdProd, pQuantite);
		
		Panier n = GestionPanier.getPan();
		
		//donn�es a retourner vers la vue
	    modele.addAttribute("panier", n);
		
	    List<Categorie> listeCat =fonctionnaireManager.listCategoriesServ();
	    
	    modele.addAttribute("categories", listeCat);
	    
		//renvoie du nom logique de la vue
		//'fonctionnaires' --> /WEB-INF/views/fonctionnaires.jsp
		return "eboutique";
	
	}

	
	@RequestMapping(value="/eboutique/addPanier/{idProd}", method=RequestMethod.GET)
	public String supprimerPanier(@PathVariable("idProd") int pIdProd, @PathVariable("quantite") int pQuantite,
			ModelMap modele) {
		
		//appel du serrvice pour r�cup�rer la liste des fonctionnaire dans la bdd
	    List<Produit> listeProd = fonctionnaireManager.listproduitsServ();
				
	    //donn�es a retourner vers la vue
	    modele.addAttribute("produits", listeProd);
	    
		GestionPanier.deleteProduct(pIdProd);
		
		Panier n = GestionPanier.getPan();
		
		//donn�es a retourner vers la vue
	    modele.addAttribute("panier", n);
		
	    List<Categorie> listeCat =fonctionnaireManager.listCategoriesServ();
	    
	    modele.addAttribute("categories", listeCat);
	    
		//renvoie du nom logique de la vue
		//'fonctionnaires' --> /WEB-INF/views/fonctionnaires.jsp
		return "eboutique";
	
	}
	
	
	
}
