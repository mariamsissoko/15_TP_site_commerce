package com.intiformation.metier;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ligneCommande implements Serializable {
	
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="quantite")
	private int quantite;
	
	@Column(name="prix")
	private int prix;
	
	@ManyToOne
	@JoinColumn(name = "produit_id", referencedColumnName = "idProduit" )
	private Produit produit;

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
	
	public Produit getProduit() {
		return produit;
	}


	public void setProduit(Produit produit) {
		this.produit = produit;
	}


	@Override
	public String toString() {
		return "ligneCommande [quantite=" + quantite + ", prix=" + prix + ", produit=" + produit + "]";
	}
	
	

}
