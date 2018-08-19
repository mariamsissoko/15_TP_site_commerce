package com.intiformation.metier;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Categorie implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idCategorie")
	private Long idCategorie;
	
	@Column(name="nomCategorie")
	private String nomCategorie;
	
	@Column(name="photo")
	private byte[] photo;
	
	@Column(name="description")
	private String description;
	
	// one session To Many Module
    
    @OneToMany(mappedBy = "categorie", targetEntity = Produit.class, cascade = CascadeType.ALL)
    private List<Produit> listProduit;

	/**
	 * ctor vide 
	 */
	public Categorie() {
	
	}

    /***
     * @param idCategorie
     * @param nomCategorie
     * @param photo
     * @param description
     * @param listProduit
     */
	public Categorie(Long idCategorie, String nomCategorie, byte[] photo, String description,
			List<Produit> listProduit) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.photo = photo;
		this.description = description;
		this.listProduit = listProduit;
	}

	/**
	 * @param nomCategorie
	 * @param photo
	 * @param description
	 * @param listProduit
	 */
	public Categorie(String nomCategorie, byte[] photo, String description, List<Produit> listProduit) {
		super();
		this.nomCategorie = nomCategorie;
		this.photo = photo;
		this.description = description;
		this.listProduit = listProduit;
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
	
	public List<Produit> getListProduit() {
		return listProduit;
	}

	public void setListProduit(List<Produit> listProduit) {
		this.listProduit = listProduit;
	}
	
	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", nomCategorie=" + nomCategorie + ", photo="
				+ Arrays.toString(photo) + ", description=" + description + "]";
	}

}
