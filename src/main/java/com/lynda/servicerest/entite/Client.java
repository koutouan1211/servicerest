package com.lynda.servicerest.entite;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
    String nom;
    String prenom;
    Integer contacte;
    String compte;
    
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Integer getContacte() {
		return contacte;
	}
	public void setContacte(Integer contacte) {
		this.contacte = contacte;
	}
	public String getCompte() {
		return compte;
	}
	public void setCompte(String compte) {
		this.compte = compte;
	}
    
    
    
}
