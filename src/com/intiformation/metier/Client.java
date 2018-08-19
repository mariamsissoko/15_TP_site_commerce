package com.intiformation.metier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idClient")
	private Long idClient;
	
	@Column(name="nomClient")
	private String nomClient;
	
	@Column(name="adresse")
	private String adresse;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telephone")
	private String telephone;
	
	@OneToMany(mappedBy = "client", targetEntity = Commande.class, cascade = CascadeType.ALL)
	private List<Commande> commandes;
	
	/**
	 * ctor vide
	 */
	public Client() {
		super();
	}
	
	/**
	 * @param idClient
	 * @param nomClient
	 * @param adresse
	 * @param email
	 * @param telephone
	 * @param commandes
	 */
	public Client(Long idClient, String nomClient, String adresse, String email, String telephone,
			List<Commande> commandes) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
		this.commandes = commandes;
	}
	
	/**
	 * @param nomClient
	 * @param adresse
	 * @param email
	 * @param telephone
	 * @param commandes
	 */
	public Client(String nomClient, String adresse, String email, String telephone, List<Commande> commandes) {
		super();
		this.nomClient = nomClient;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
		this.commandes = commandes;
	}

	//Getters|Setters

	/**
	 * @return the idClient
	 */
	public Long getIdClient() {
		return idClient;
	}

	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	/**
	 * @return the nomClient
	 */
	public String getNomClient() {
		return nomClient;
	}

	/**
	 * @param nomClient the nomClient to set
	 */
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nomClient=" + nomClient + ", adresse=" + adresse + ", email=" + email
				+ ", telephone=" + telephone + ", commandes=" + commandes + "]";
	}
	

	
}
