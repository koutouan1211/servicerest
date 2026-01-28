package com.lynda.servicerest.entite;




import java.time.LocalDate;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;







@Entity
@Table(name="abonnement")
public class Abonnement {
      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      Integer id;

      
     
      @Column(name = "dateemprunt",nullable=false)
      private LocalDate dateemprunt;

	
	  public LocalDate getDateemprunt() {
		return dateemprunt;
	}
	  public void setDateemprunt(LocalDate dateemprunt) {
		  this.dateemprunt = dateemprunt;
	  }
	  @ManyToOne
      @JoinColumn(name="client_id" , nullable=false)
      private Client client;
      
      @ManyToOne
      @JoinColumn(name="compteur_id", nullable=false)
      private Compteur compteur;
      
      
	  public Client getClient() {
		return client;
	}
	  public void setClient(Client client) {
		  this.client = client;
	  }
	  public Compteur getCompteur() {
		  return compteur;
	  }
	  public void setCompteur(Compteur compteur) {
		  this.compteur = compteur;
	  }

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
