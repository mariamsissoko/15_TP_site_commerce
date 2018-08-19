package com.intiformation.metier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Panier implements Serializable {

	@OneToMany(mappedBy = "panier", targetEntity = ligneCommande.class, cascade = CascadeType.ALL)
	private List<ligneCommande> panier;

	public Panier(List<ligneCommande> panier) {
		super();
		this.panier = panier;
	}

	public Panier() {
		
	}
	
	/**
	 * @return the panier
	 */
	public List<ligneCommande> getPanier() {
		return panier;
	}

	/**
	 * @param panier the panier to set
	 */
	public void setPanier(List<ligneCommande> panier) {
		this.panier = panier;
	}
	
}
