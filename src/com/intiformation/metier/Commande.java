package com.intiformation.metier;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Commande implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idCommande")
	private Long idCommande;
	
	@Column(name="dateCommande")
	@Temporal(TemporalType.DATE)
	private Date dateCommande;
	
	@ManyToOne
	@JoinColumn(name = "client_id", referencedColumnName = "idClient" )
	private Client client;

	@OneToMany(mappedBy = "commande", targetEntity = ligneCommande.class, cascade = CascadeType.ALL)
	private List<ligneCommande> ligneCommandes;
	
	/**
	 * ctor vide
	 */
	public Commande() {
		super();
	}

	/**
	 * @param idCommande
	 * @param dateCommande
	 * @param client
	 * @param ligneCommandes
	 */
	public Commande(Long idCommande, Date dateCommande, Client client, List<ligneCommande> ligneCommandes) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
		this.client = client;
		this.ligneCommandes = ligneCommandes;
	}

	/**
	 * @param dateCommande
	 * @param client
	 * @param ligneCommandes
	 */
	public Commande(Date dateCommande, Client client, List<ligneCommande> ligneCommandes) {
		super();
		this.dateCommande = dateCommande;
		this.client = client;
		this.ligneCommandes = ligneCommandes;
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
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}


	public List<ligneCommande> getLigneCommandes() {
		return ligneCommandes;
	}

	public void setLigneCommandes(List<ligneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}

	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", dateCommande=" + dateCommande + ", client=" + client
				+ ", ligneCommandes=" + ligneCommandes + "]";
	}

}
