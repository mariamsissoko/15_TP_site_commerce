package com.intiformation.metier;

import javax.persistence.EntityTransaction;

public class GestionPanier {

	public static Panier pan;

	public GestionPanier(Panier pan) {
		super();
		this.pan = pan;
	}

	public GestionPanier() {
		super();
	}

	/**
	 * @return the pan
	 */
	public static Panier getPan() {
		return pan;
	}

	/**
	 * @param pan the pan to set
	 */
	public void setPan(Panier pan) {
		this.pan = pan;
	}
	
	public static void addProduct(Commande c, Produit p, int prix, int quantite) {
		
		p.setSelectionne(true);
		
		ligneCommande com = new ligneCommande(p, c, quantite, prix);
		
		pan.getPanier().add(com);
		
	}
	
	public static void deleteProduct() {
		
		pan.getPanier().clear();
		
	}
	
}
