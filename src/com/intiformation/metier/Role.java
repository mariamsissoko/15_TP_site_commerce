package com.intiformation.metier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Role implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idRole")
	private Long idRole;
	
	@Column(name="roleName")
	private String roleName;
	
	/**
	 * ctor vide
	 */
	public Role() {
		super();
	}

	//Getters|Setters

	/**
	 * @return the idRole
	 */
	public Long getIdRole() {
		return idRole;
	}


	/**
	 * @param idRole the idRole to set
	 */
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}


	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}


	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
