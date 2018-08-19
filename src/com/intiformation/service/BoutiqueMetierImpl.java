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
		return dao.ajouterProduit(p, idCat);
	}

	@Override
	public void supprimerProduitServ(Long idP) {
		dao.supprimerProduit(idP);
		
	}

	@Override
	public void modifierProduitServ(Produit p) {
		dao.modifierProduit(p);
		
	}

	@Override
	public Long ajouterCategorieServ(Categorie c) {
		return dao.ajouterCategorie(c);
	}

	@Override
	public void supprimerCategorieServ(Long idcat) {
		dao.supprimerCategorie(idcat);
		
	}

	@Override
	public void modifierCategorieServ(Categorie c) {
		dao.modifierCategorie(c);
		
	}

	@Override
	public void attribuerRoleServ(Role r, Long userID) {
		dao.attribuerRole(r, userID);
		
	}

	@Override
	public List<Categorie> listCategoriesServ() {
		return dao.listCategories();
	}

	@Override
	public Categorie getCategorieServ(Long idCat) {
		return dao.getCategorie(idCat);
	}

	@Override
	public List<Produit> listproduitsServ() {
		return dao.listproduits();
	}

	@Override
	public List<Produit> produitsParMotCleServ(String mc) {
		return dao.produitsParMotCle(mc);
	}

	@Override
	public List<Produit> produitsParCategorieServ(Long idCat) {
		return dao.produitsParCategorie(idCat);
	}

	@Override
	public List<Produit> produitsSelectionnesServ() {
		return dao.produitsSelectionnes();
	}

	@Override
	public Produit getProduitServ(Long idP) {
		return dao.getProduit(idP);
	}

	@Override
	public Commande enregistrerCommandeServ(Panier p, Client c) {
		return dao.enregistrerCommande(p, c);
	}

}
