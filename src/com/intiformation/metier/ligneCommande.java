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

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JoinColumn(name = "produit_id", referencedColumnName = "idProduit" )
	private Produit produit;

	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	@JoinColumn(name = "commande_id", referencedColumnName = "idCommande" )
	private Commande commande;
	
	@Column(name="quantite")
	private int quantite;
	
	@Column(name="prix")
	private int prix;
	/**
	 * ctor vide
	 */
	public ligneCommande() {
		super();
	}

	
	public ligneCommande(Produit produit, Commande commande, int quantite, int prix) {
		super();
		this.produit = produit;
		this.commande = commande;
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

	/**
	 * @return the commande
	 */
	public Commande getCommande() {
		return commande;
	}

	/**
	 * @param commande the commande to set
	 */
	public void setCommande(Commande commande) {
		this.commande = commande;
	}

}
