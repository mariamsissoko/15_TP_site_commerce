package com.intiformation.metier;

public class Client {
	private Long idClient;
	private String nomClient;
	private String adresse;
	private String email;
	private String telephone;
	
	/**
	 * ctor vide
	 */
	public Client() {
		super();
	}

	/**
	 * ctor chargé sans l'id
	 * @param nomClient
	 * @param adresse
	 * @param email
	 * @param telephone
	 */
	public Client(String nomClient, String adresse, String email, String telephone) {
		super();
		this.nomClient = nomClient;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
	}

	
	/**
	 * ctor chargé avec l'id
	 * @param idClient
	 * @param nomClient
	 * @param adresse
	 * @param email
	 * @param telephone
	 */
	public Client(Long idClient, String nomClient, String adresse, String email, String telephone) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
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
	
	

}
