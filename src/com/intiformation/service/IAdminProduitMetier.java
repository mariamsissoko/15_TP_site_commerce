package com.intiformation.service;

import com.intiformation.metier.Produit;

public interface IAdminProduitMetier {

	public Long ajouterProduitServ(Produit p, Long idCat);
	
	public void supprimerProduitServ(Long idP);
	
	public void modifierProduitServ(Produit p);
	
}
