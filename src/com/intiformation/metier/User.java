package com.intiformation.metier;

public class User {
	private Long idUser;
	private String userName;
	private String password;
	private boolean actived;
	
	/**
	 * ctor vide
	 */
	public User() {
		super();
	}

	/**
	 * ctor chargé sans l'id
	 * @param userName
	 * @param password
	 * @param actived
	 */
	public User(String userName, String password, boolean actived) {
		super();
		this.userName = userName;
		this.password = password;
		this.actived = actived;
	}
	
	/**
	 * ctor chargé avec l'id
	 * @param idUser
	 * @param userName
	 * @param password
	 * @param actived
	 */

	public User(Long idUser, String userName, String password, boolean actived) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.password = password;
		this.actived = actived;
	}
	
	//Getters|Setters

	/**
	 * @return the idUser
	 */
	public Long getIdUser() {
		return idUser;
	}

	/**
	 * @param idUser the idUser to set
	 */
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the actived
	 */
	public boolean isActived() {
		return actived;
	}

	/**
	 * @param actived the actived to set
	 */
	public void setActived(boolean actived) {
		this.actived = actived;
	}
	
	
	

}
