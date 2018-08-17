package com.intiformation.metier;

public class Categorie {
	private Long idCategorie;
	private String nomCategorie;
	private byte[] photo;
	private String description;
	
	/**
	 * ctor vide 
	 */
	public Categorie() {
		super();
	}

	/**
	 * ctor chargé sans l'id
	 * @param nomCategorie
	 * @param photo
	 * @param description
	 */
	public Categorie(String nomCategorie, byte[] photo, String description) {
		super();
		this.nomCategorie = nomCategorie;
		this.photo = photo;
		this.description = description;
	}

	/**
	 * ctor chargé avec l'id
	 * @param idCategorie
	 * @param nomCategorie
	 * @param photo
	 * @param description
	 */
	public Categorie(Long idCategorie, String nomCategorie, byte[] photo, String description) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.photo = photo;
		this.description = description;
	}
	
	
	//Getters|Setters

	/**
	 * @return the idCategorie
	 */
	public Long getIdCategorie() {
		return idCategorie;
	}

	/**
	 * @param idCategorie the idCategorie to set
	 */
	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	/**
	 * @return the nomCategorie
	 */
	public String getNomCategorie() {
		return nomCategorie;
	}

	/**
	 * @param nomCategorie the nomCategorie to set
	 */
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	/**
	 * @return the photo
	 */
	public byte[] getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
