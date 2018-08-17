package com.intiformation.metier;

public class ligneCommande {
	private int quantite;
	private int prix;
	
	/**
	 * ctor vide
	 */
	public ligneCommande() {
		super();
	}

	
	/**
	 * ctor chargé
	 * @param quantite
	 * @param prix
	 */
	public ligneCommande(int quantite, int prix) {
		super();
		this.quantite = quantite;
		this.prix = prix;
	}

	
	//Getters|Setters

	/**
	 * @return the quantite
	 */
	public int getQuantite() {
		return quantite;
	}


	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	/**
	 * @return the prix
	 */
	public int getPrix() {
		return prix;
	}


	/**
	 * @param prix the prix to set
	 */
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	
	
	

}
