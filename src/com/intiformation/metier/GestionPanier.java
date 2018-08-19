package com.intiformation.metier;

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
	
	public static void addProduct(int idProd, int quantite) {
		
	}
	
	public static void deleteProduct(int idProd) {
		
	}
	
}
