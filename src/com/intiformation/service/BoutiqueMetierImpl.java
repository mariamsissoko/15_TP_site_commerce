package com.intiformation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.dao.IBoutiqueDao;
import com.intiformation.metier.Categorie;
import com.intiformation.metier.Client;
import com.intiformation.metier.Commande;
import com.intiformation.metier.Panier;
import com.intiformation.metier.Produit;
import com.intiformation.metier.Role;

@Transactional
@Service //declare un bean de service dans le conteneur (equivalent de faire bean id, class etc ..)
public class BoutiqueMetierImpl implements InternauteBoutique, IAdminCategoriesMetier, IAdminProduitMetier{

	//declaration de la couche DAO
	@Autowired //injection par type du dao (equiv property name value etc ..)
	private IBoutiqueDao dao;
	
	/**
	 * setter pour l'injection du DAO avec spring
	 * @param dao the dao to set
	 */
	public void setDao(IBoutiqueDao dao) {
		this.dao = dao;
	}

	@Override
	public Long ajouterProduitServ(Produit p, Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerProduitServ(Long idP) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierProduitServ(Produit p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long ajouterCategorieServ(Categorie c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerCategorieServ(Long idcat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierCategorieServ(Categorie c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attribuerRoleServ(Role r, Long userID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Categorie> listCategoriesServ() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie getCategorieServ(Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> listproduitsServ() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitsParMotCleServ(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitsParCategorieServ(Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitsSelectionnesServ() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit getProduitServ(Long idP) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commande enregistrerCommandeServ(Panier p, Client c) {
		// TODO Auto-generated method stub
		return null;
	}

}
