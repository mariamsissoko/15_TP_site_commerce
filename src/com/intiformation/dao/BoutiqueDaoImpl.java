package com.intiformation.dao;

import java.util.List;

import javax.persistence.PersistenceContext;

import com.intiformation.metier.Categorie;
import com.intiformation.metier.Client;
import com.intiformation.metier.Commande;
import com.intiformation.metier.Pannier;
import com.intiformation.metier.Produit;
import com.intiformation.metier.Role;
import com.intiformation.metier.User;

@PersistenceContext
public class BoutiqueDaoImpl implements IBoutiqueDao {

	@Override
	public Long ajouterCategorie(Categorie c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> listCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerCategrorie(Long idcat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierCategorie(Categorie c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> listproduits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitsParMotCle(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitsParCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitsSelectionnes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit getProduit(Long idP) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerProduit(Long idP) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attribuerRole(Role r, Long userID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Commande enregistrerCommande(Pannier p, Client c) {
		// TODO Auto-generated method stub
		return null;
	}

}
