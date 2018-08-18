package com.intiformation.service;

import java.util.List;

import com.intiformation.metier.Categorie;
import com.intiformation.metier.Client;
import com.intiformation.metier.Commande;
import com.intiformation.metier.Pannier;
import com.intiformation.metier.Role;

public interface IAdminCategoriesMetier {

	public Long ajouterCategorieServ(Categorie c);
	
	public void supprimerCategorieServ(Long idcat);
	
	public void modifierCategorieServ(Categorie c);
	
	public void attribuerRoleServ(Role r, Long userID);
	
	public Commande enregistrerCommandeServ(Pannier p, Client c);
	
}
