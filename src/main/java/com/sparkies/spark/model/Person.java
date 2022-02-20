package com.sparkies.spark.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * 'Person' abstract Entity
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {

	/**
	 * id : "idUtilisateur" type : long
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_utilisateur") // AutoIncremental
	private long idUtilisateur;

	/**
	 * 'lastName' -> 'NOM' Max length of 255 'car' (default) && not NULL
	 */

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 'userEmail' -> 'EMAIL' Max length of 50 'car' && not NULL
	 */
	@Column(name = "EMAIL", length = 50)
	private String userEmail;

	/**
	 * 'userPwd' -> 'MOT_DE_PASSE' Max length of 255 'car' (default) && not NULL
	 */
	@Column(name = "MOT_DE_PASSE", length = 255)
	private String userPwd;

	public Person() {
		// TODO AUTOGENERATED
	}

	public Person(String username, String userEmail, String userPwd) {
		super();

		this.username = username;
		this.userEmail = userEmail;
		this.userPwd = userPwd;
	}

	public long getIdUtilisateur() {
		return idUtilisateur;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setIdUtilisateur(long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	@Override
	public String toString() {
		return "Person [idUtilisateur=" + idUtilisateur + ", username=" + username + ", userEmail=" + userEmail
				+ ", userPwd=" + userPwd + "]";
	}

	// TODO tester bon fonctionnement
//    public static long getIdUtilisateur() {
//        return idUtilisateur;
//    }
//
//    public static void setIdUtilisateur(long idUtilisateur) {
//        Person.idUtilisateur = idUtilisateur;
//    }

}