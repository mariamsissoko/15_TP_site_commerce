package com.intiformation.metier;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idUser")
	private Long idUser;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="actived")
	private boolean actived;
	
	@OneToMany
	@JoinColumn(name = "role_id", referencedColumnName="idRole")
	private Role role;
	
	/**
	 * ctor vide
	 */
	public User() {
		super();
	}

	/**
	 * 
	 * @param idUser
	 * @param userName
	 * @param password
	 * @param actived
	 * @param role
	 */
	public User(Long idUser, String userName, String password, boolean actived, Role role) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.password = password;
		this.actived = actived;
		this.role = role;
	}


	/**
	 * @param userName
	 * @param password
	 * @param actived
	 * @param role
	 */
	public User(String userName, String password, boolean actived, Role role) {
		super();
		this.userName = userName;
		this.password = password;
		this.actived = actived;
		this.role = role;
	}

	//Getters|Setters

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

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

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", userName=" + userName + ", password=" + password + ", actived=" + actived
				+ ", roles=" + role + "]";
	}
	
	
	

}
