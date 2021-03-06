package com.intiformation.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.intiformation.metier.Categorie;
import com.intiformation.service.IAdminCategoriesMetier;
import com.intiformation.service.InternauteBoutique;

@Controller
public class AdminCategoriesController {

	//declaration du service
	@Autowired
	private IAdminCategoriesMetier catManager;

	@Autowired
	private InternauteBoutique internauteManager;
	
	/**
	 * @param catManager the catManager to set
	 */
	public void setCatManager(IAdminCategoriesMetier catManager) {
		this.catManager = catManager;
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value= {"eboutique/categories/delete/{idCat}"}, 
							method=RequestMethod.GET)
	public String deleteCategorie(@PathVariable("idCat") Long pIdCategorie, 
									  ModelMap modele) {
		
		//suppression de la categorie
		catManager.supprimerCategorieServ(pIdCategorie);
		
		//recup de la liste des categories
		List<Categorie> listeCat= internauteManager.listCategoriesServ();
		
		//donn�es a retourner vers la vue 
		modele.addAttribute("listeCat", listeCat);
		
		//redirection vers categorie.jsp
		return "categories";		
	}
	
	/**
	 * afficher le formulaire � l'utilisateur en r�ponse a une requet GET
	 * @return
	 */
	@RequestMapping(value="/addcategorieform", method=RequestMethod.GET)
	public ModelAndView setUpFormulatire() {
		/**
		 * =============	donn�es a retourner vers la vue 	===================
		 */
		Map<String, Object> data = new HashMap<>();
		
		//1. d�finition de l'objet de commande 
		Categorie categorie = new Categorie();
		
		//2. definition du nom de l'objet de commande
		//facultatif - nom par defaut command
		String objetDeCommande = "categorieCommand";
		
		//3. association du nom a l'objet
		data.put(objetDeCommande, categorie );
		
		// nom logique de la vue 
		// 'ajoutercategorie' --> WEB-INF/view/ajoutercategorie.jsp
		String viewName = "ajoutercategorie";
		
		return new ModelAndView(viewName, data);	
	}
	
	/**
	 * ajoute la cat�gorie dans la bdd
	 * @return
	 */
	@RequestMapping(value="categories/add", method=RequestMethod.POST)
	public String addCategorie(@ModelAttribute("categorieCommand") Categorie pCategorie,
			ModelMap modele) {
		
		// appel du service pour l'ajout de la cat�gorie dans la bdd
		catManager.ajouterCategorieServ(pCategorie);
		
		//recup de la liste des cat�gories
		List<Categorie> listeCat= internauteManager.listCategoriesServ();
		
		//recup de la liste des cat�gories dans la bdd + renvoi des donn�es vers cat�gorie.jsp
		modele.addAttribute("listeCat", listeCat);
		
		//redirection vers categories.jsp
		return "categories";
	}
	
	/**
	 * affiche le formulaire en reponse a une requete en GET pour la modification.
	 * @return : URL = http.../categorie/updatecat�gorieform?fonctid=1
	 */
	@RequestMapping(value="/categories/updatecategorieform" , method=RequestMethod.GET)
	public ModelAndView setUpFormulaireUpdate(@RequestParam("id") Long pIdCat) {
		
		//1.recup de la cat�gorie de la BDD(c'est l'objet de commande)
		Categorie categorie = internauteManager.getCategorieServ(pIdCat);
		
		//nom de la vue : updatecategorie
		// nom de l'objet de commande : categorieUpCommande --> /WEB-IINF/view/updatecategorie.jsp
		// l'objet de commande : categorie
		return new ModelAndView("updatecategorie", "categorieUpCommand", categorie);
		
	}
	
	/**
	 * modifier une categorie dans la bdd
	 * @param pFonctionnaire
	 * @param modele
	 * @return
	 */
	@RequestMapping(value="/categories/update", method=RequestMethod.POST)
	public String updateProduit(@ModelAttribute("categorieUpCommand") Categorie pCategorie, ModelMap modele) {
	
		//appel du service pour modifier de la cat�gorie dans la bdd
		catManager.modifierCategorieServ(pCategorie);
		
		//recup de la liste des cat�gories dans la bdd + renvoi des donn�es vers categorie.jsp
		modele.addAttribute("listeCat", internauteManager.listCategoriesServ());
				
		//redirection vers categories.jsp
		return "categories";
	}
	
	
}
