package com.intiformation.dao;

import java.util.List;

import com.intiformation.metier.Categorie;
import com.intiformation.metier.Client;
import com.intiformation.metier.Commande;
import com.intiformation.metier.GestionPanier;
import com.intiformation.metier.Panier;
import com.intiformation.metier.Produit;
import com.intiformation.metier.Role;
import com.intiformation.metier.User;

public interface IBoutiqueDao {
	
	public Long ajouterCategorie(Categorie c);
	
	public List<Categorie> listCategories();
	
	public Categorie getCategorie(Long idCat);
	
	public void supprimerCategorie(Long idcat);
	
	public void modifierCategorie(Categorie c);
	
	public Long ajouterProduit(Produit p, Long idCat);
	
	public List<Produit> listproduits();
	
	public List<Produit> produitsParMotCle(String mc);
	
	public List<Produit> produitsParCategorie(Long idCat);
	
	public List<Produit> produitsSelectionnes();
	
	public Produit getProduit(Long idP);
	
	public void supprimerProduit(Long idP);
	
	public void modifierProduit(Produit p);
	
	public void ajouterUser(User u);
	
	public void attribuerRole(Role r, Long userID);
	
	public Commande enregistrerCommande(GestionPanier p, Client c);
}
