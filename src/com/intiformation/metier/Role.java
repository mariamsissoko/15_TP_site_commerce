package com.intiformation.metier;

public class Role {
	private Long idRole;
	private String roleName;
	
	/**
	 * ctor vide
	 */
	public Role() {
		super();
	}

	/**
	 * chargé sans l'id
	 * @param roleName
	 */
	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}


	/**
	 * ctor chargé avec l'id
	 * @param idRole
	 * @param roleName
	 */
	public Role(Long idRole, String roleName) {
		super();
		this.idRole = idRole;
		this.roleName = roleName;
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
