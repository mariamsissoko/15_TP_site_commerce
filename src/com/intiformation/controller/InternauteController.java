package com.intiformation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.intiformation.metier.Categorie;
import com.intiformation.metier.Commande;
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
	 * @param fonctionnaireManager the fonctionnaireManager to set
	 */
	public void setFonctionnaireManager(InternauteBoutique fonctionnaireManager) {
		this.fonctionnaireManager = fonctionnaireManager;
	}

	/**
	 * 
	 * @param modele : modele de données a retrouner vers la vue. 
	 * @return le nom logique de la vue.
	 */
	@RequestMapping(value="/eboutique/liste", method=RequestMethod.GET)
	public String listerProduits(ModelMap modele) {
		//appel du service pour récupérer la liste des fonctionnaire dans la bdd
		List<Produit> listeProd = fonctionnaireManager.listproduitsServ();
		
		//données a retourner vers la vue
		modele.addAttribute("produits", listeProd);
		
		Panier n = GestionPanier.getPan();
		
		//données a retourner vers la vue
	    modele.addAttribute("panier", n);
		
	    List<Categorie> listeCat =fonctionnaireManager.listCategoriesServ();
	    
	    modele.addAttribute("categories", listeCat);
	    
		//renvoie du nom logique de la vue
		//'fonctionnaires' --> /WEB-INF/views/fonctionnaires.jsp
		return "eboutique";
		
	}

	@RequestMapping(value="/eboutique/listeCat", method=RequestMethod.GET)
	public String listerProduitsCat(@PathVariable("idCat") Long pIdCat,
			ModelMap modele) {
		//appel du service pour récupérer la liste des fonctionnaire dans la bdd
		List<Produit> listeProd = fonctionnaireManager.produitsParCategorieServ(pIdCat);
		
		//données a retourner vers la vue
		modele.addAttribute("produits", listeProd);
		
		Panier n = GestionPanier.getPan();
		
		//données a retourner vers la vue
	    modele.addAttribute("panier", n);
		
	    List<Categorie> listeCat =fonctionnaireManager.listCategoriesServ();
	    
	    modele.addAttribute("categories", listeCat);
	    
		//renvoie du nom logique de la vue
		//'fonctionnaires' --> /WEB-INF/views/fonctionnaires.jsp
		return "eboutique";
		
	}
	
	@RequestMapping(value="/eboutique/listeMot", method=RequestMethod.GET)
	public String listerProduitsMotsCles(@PathVariable("idMC") String pIdMC,
			ModelMap modele) {
		//appel du service pour récupérer la liste des fonctionnaire dans la bdd
		List<Produit> listeProd = fonctionnaireManager.produitsParMotCleServ(pIdMC);
		
		//données a retourner vers la vue
		modele.addAttribute("produits", listeProd);
		
		Panier n = GestionPanier.getPan();
		
		//données a retourner vers la vue
	    modele.addAttribute("panier", n);
		
	    List<Categorie> listeCat =fonctionnaireManager.listCategoriesServ();
	    
	    modele.addAttribute("categories", listeCat);
		
		//renvoie du nom logique de la vue
		//'fonctionnaires' --> /WEB-INF/views/fonctionnaires.jsp
		return "eboutique";
	
	}
	
	@RequestMapping(value="/eboutique/ajouterAuPanier?idProduit={idProd}&quantite={quantite}", method=RequestMethod.GET)
	public String ajouterPanier(@PathVariable("idProd") Long pIdProd, @PathVariable("quantite") int pQuantite,
			@RequestParam("commande") Commande pComm,
			@RequestParam("prix") int prix,
			ModelMap modele) {
		
		//appel du service pour récupérer la liste des fonctionnaire dans la bdd
		List<Produit> listeProd = fonctionnaireManager.listproduitsServ();
		
	    //données a retourner vers la vue
		modele.addAttribute("produits", listeProd);
				
		Produit prod= fonctionnaireManager.getProduitServ(pIdProd);
				
		GestionPanier.addProduct(pComm, prod, prix, pQuantite);
		
		Panier n = GestionPanier.getPan();
		
		//données a retourner vers la vue
	    modele.addAttribute("panier", n);
		
	    List<Categorie> listeCat =fonctionnaireManager.listCategoriesServ();
	    
	    modele.addAttribute("categories", listeCat);
	    
		//renvoie du nom logique de la vue
		//'fonctionnaires' --> /WEB-INF/views/fonctionnaires.jsp
		return "eboutique";
	
	}

	/*
	@RequestMapping(value="/eboutique/suprimerDuPanier/{idProd}", method=RequestMethod.GET)
	public String supprimerPanier(@PathVariable("idProd") int pIdProd, @PathVariable("quantite") int pQuantite,
			ModelMap modele) {
		
		//appel du service pour récupérer la liste des fonctionnaire dans la bdd
	    List<Produit> listeProd = fonctionnaireManager.listproduitsServ();
				
	    //données a retourner vers la vue
	    modele.addAttribute("produits", listeProd);
	    
		GestionPanier.deleteProduct(pIdProd);
		
		Panier n = GestionPanier.getPan();
		
		//données a retourner vers la vue
	    modele.addAttribute("panier", n);
		
	    List<Categorie> listeCat =fonctionnaireManager.listCategoriesServ();
	    
	    modele.addAttribute("categories", listeCat);
	    
		//renvoie du nom logique de la vue
		//'fonctionnaires' --> /WEB-INF/views/fonctionnaires.jsp
		return "eboutique";
	
	}
	*/
}
