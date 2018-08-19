package com.intiformation.service;

import com.intiformation.metier.Categorie;
import com.intiformation.metier.Client;
import com.intiformation.metier.Commande;
import com.intiformation.metier.Panier;
import com.intiformation.metier.Role;

public interface IAdminCategoriesMetier {

	public Long ajouterCategorieServ(Categorie c);
	
	public void supprimerCategorieServ(Long idcat);
	
	public void modifierCategorieServ(Categorie c);
	
	public void attribuerRoleServ(Role r, Long userID);
	
}
