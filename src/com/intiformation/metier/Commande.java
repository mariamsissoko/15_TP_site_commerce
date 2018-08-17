package com.intiformation.metier;

import java.util.Date;

public class Commande {
	private Long idCommande;
	private Date dateCommande;
	
	/**
	 * ctor vide
	 */
	public Commande() {
		super();
	}

	/**
	 * ctor chargé sans l'id
	 * @param dateCommande
	 */
	public Commande(Date dateCommande) {
		super();
		this.dateCommande = dateCommande;
	}

	
	/**
	 * ctor chargé avec l'id
	 * @param idCommande
	 * @param dateCommande
	 */
	public Commande(Long idCommande, Date dateCommande) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
	}

	/**
	 * @return the idCommande
	 */
	public Long getIdCommande() {
		return idCommande;
	}

	/**
	 * @param idCommande the idCommande to set
	 */
	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	/**
	 * @return the dateCommande
	 */
	public Date getDateCommande() {
		return dateCommande;
	}

	/**
	 * @param dateCommande the dateCommande to set
	 */
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	
	
	

}
