package com.lynda.servicerest.entite;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="abonnement")
public class Abonnement {
      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      Integer id;
      Integer idclient;
      Integer idcompteur;
	  public Integer getId() {
		  return id;
	  }
	  public void setId(Integer id) {
		  this.id = id;
	  }
	  public Integer getIdclient() {
		  return idclient;
	  }
	  public void setIdclient(Integer idclient) {
		  this.idclient = idclient;
	  }
	  public Integer getIdcompteur() {
		  return idcompteur;
	  }
	  public void setIdcompteur(Integer idcompteur) {
		  this.idcompteur = idcompteur;
	  }
      
}
