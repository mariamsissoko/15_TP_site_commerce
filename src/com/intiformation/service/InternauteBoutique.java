package com.intiformation.service;

import java.util.List;

import com.intiformation.metier.Categorie;
import com.intiformation.metier.Client;
import com.intiformation.metier.Commande;
import com.intiformation.metier.GestionPanier;
import com.intiformation.metier.Produit;

public interface InternauteBoutique {
	
	public List<Categorie> listCategoriesServ();
	
	public Categorie getCategorieServ(Long idCat);
	
	public List<Produit> listproduitsServ();
	
	public List<Produit> produitsParMotCleServ(String mc);
	
	public List<Produit> produitsParCategorieServ(Long idCat);
	
	public List<Produit> produitsSelectionnesServ();
	
	public Produit getProduitServ(Long idP);
	
	public Commande enregistrerCommandeServ(GestionPanier p, Client c);
	
}
