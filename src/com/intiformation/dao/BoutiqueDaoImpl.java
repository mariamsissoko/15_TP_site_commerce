package com.intiformation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
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
	
	// Recup de l'entity Manager
	EntityManager em = Persistence.createEntityManagerFactory("").createEntityManager();
	
	
 
	@Override
	public Long ajouterCategorie(Categorie c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> listCategories() {
		List<Categorie> listCat = em.createQuery("SELECT c FROM Categorie c").getResultList();
		em.close();
		return listCat;
		
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
		List<Produit> listProd = em.createQuery("SELECT p FROM Produit p").getResultList();
		em.close();
		return listProd;
	}

	@Override
	public List<Produit> produitsParMotCle(String mc) {
		List<Produit> listProdMC = em.createQuery("SELECT FROM  WHERE").getResultList();
		em.close();
		return listProdMC;
	}

	@Override
	public List<Produit> produitsParCategorie(Long idCat) {
		List<Produit> listProdidCat = em.createQuery("SELECT FROM  WHERE").getResultList();
		em.close();
		return listProdidCat;
	}

	@Override
	public List<Produit> produitsSelectionnes() {
		List<Produit> listProdSelect = em.createQuery("SELECT FROM  WHERE").getResultList();
		em.close();
		return listProdSelect ;
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
