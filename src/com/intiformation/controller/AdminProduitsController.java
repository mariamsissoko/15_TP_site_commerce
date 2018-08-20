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

import com.intiformation.metier.Produit;
import com.intiformation.service.IAdminProduitMetier;
import com.intiformation.service.InternauteBoutique;

@Controller
public class AdminProduitsController {

		//Declaration du service
		@Autowired
		private IAdminProduitMetier prodManager;

		@Autowired
		private InternauteBoutique internauteManager;

		/**
		 * @param prodManager the prodManager to set
		 */
		public void setProdManager(IAdminProduitMetier prodManager) {
			this.prodManager = prodManager;
		}

		/**
		 * @param internauteManager the internauteManager to set
		 */
		public void setInternauteManager(InternauteBoutique internauteManager) {
			this.internauteManager = internauteManager;
		}

		/**
		 * 
		 * @return
		 */
		@RequestMapping(value= {"/eboutique/produits/delete/{idProduit}"}, 
								method=RequestMethod.GET)
		public String deleteProduit(@PathVariable("idProduit") Long pIdProduit, 
										  ModelMap modele) {
			
			//suppression du produit
			prodManager.supprimerProduitServ(pIdProduit);
			
			//recup de la liste des produits
			List<Produit> listeProd= internauteManager.listproduitsServ();
			
			//données a retourner vers la vue 
			modele.addAttribute("listeProd", listeProd);
			
			//redirection avec le prefixe redirect vers produit.jsp
			return "produits";		
		}
		
		/**
		 * afficher le formulaire à l'utilisateur en réponse a une requet GET
		 * @return
		 */
		@RequestMapping(value="/addproduitform", method=RequestMethod.GET)
		public ModelAndView setUpFormulatire() {
			/**
			 * =============	données a retourner vers la vue 	===================
			 */
			Map<String, Object> data = new HashMap<>();
			
			//1. définition de l'objet de commande
			Produit produit = new Produit();
			
			//2. definition du nom de l'objet de commande
			//facultatif - nom par defaut command
			String objetDeCommande = "produitCommand";
			
			//3. association du nom a l'objet
			data.put(objetDeCommande, produit );
			
			// nom logique de la vue 
			// 'ajouterproduit' --> WEB-INF/view/ajouterproduit.jsp
			String viewName = "ajouterproduit";
			
			return new ModelAndView(viewName, data);	
		}
		
		/**
		 * ajoute le produit dans la bdd
		 * @return
		 */
		@RequestMapping(value="produits/add", method=RequestMethod.POST)
		public String addProduit(@ModelAttribute("produitCommand") Produit pProduit,
				@RequestParam("idCat") Long pIdCat,
				ModelMap modele) {
			
			// appel du service pour l'ajout du produit dans la bdd
			prodManager.ajouterProduitServ(pProduit, pIdCat);
			
			//recup de la liste des produits
			List<Produit> listeProd= internauteManager.listproduitsServ();
			
			//recup de la lsite des produits dans la bdd + renvoi des données vers produit.jsp
			modele.addAttribute("listeProd", listeProd);
			
			//redirection vers produits.jsp
			return "produits";
		}
		
		/**
		 * affiche le formulaire en reponse a une requete en GET pour la modification.
		 * @return : URL = http.../produit/updateproduitform?fonctid=1
		 */
		@RequestMapping(value="/produits/updateproduitform" , method=RequestMethod.GET)
		public ModelAndView setUpFormulaireUpdate(@RequestParam("id") Long pIdProduit) {
			
			//1.recup du produit de la BDD(c'est l'objet de commande)
			Produit produit = internauteManager.getProduitServ(pIdProduit);
			
			//nom de la vue : updateproduit
			// nom de l'objet de commade : produitUpCommande --> /WEB-IINF/view/updateproduit.jsp
			// l'objet de commande : produit
			return new ModelAndView("updateproduit", "produitUpCommand", produit);
			
		}
		
		/**
		 * modifier un produit dans la bdd
		 * @param pFonctionnaire
		 * @param modele
		 * @return
		 */
		@RequestMapping(value="/produits/update", method=RequestMethod.POST)
		public String updateProduit(@ModelAttribute("produitUpCommand") Produit pProduit, ModelMap modele) {
		
			//appel du service pour modifier le produit dans la bdd
			prodManager.modifierProduitServ(pProduit);
			
			//recup de la liste des produits dans la bdd + renvoi des données vers produit.jsp
			modele.addAttribute("listeProd", internauteManager.listproduitsServ());
					
			//redirection vers produits.jsp
			return "produits";
		}
		
}
