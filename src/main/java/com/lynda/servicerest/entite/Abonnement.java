package com.lynda.servicerest.entite;

<<<<<<< HEAD


import java.time.LocalDate;

import jakarta.persistence.Column;
=======
>>>>>>> e1c83681ddbc4773f6fc8aac811d97a63ec669c1
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



=======
import jakarta.persistence.Table;

>>>>>>> e1c83681ddbc4773f6fc8aac811d97a63ec669c1
@Entity
@Table(name="abonnement")
public class Abonnement {
      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      Integer id;
<<<<<<< HEAD
      
     
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
=======
      Integer idclient;
      Integer idcompteur;
>>>>>>> e1c83681ddbc4773f6fc8aac811d97a63ec669c1
	  public Integer getId() {
		  return id;
	  }
	  public void setId(Integer id) {
		  this.id = id;
	  }
<<<<<<< HEAD
	 
	  
	  
=======
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
      
>>>>>>> e1c83681ddbc4773f6fc8aac811d97a63ec669c1
}
