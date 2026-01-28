package com.lynda.servicerest.entite;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
=======
import org.springframework.web.bind.annotation.RequestMapping;

>>>>>>> e1c83681ddbc4773f6fc8aac811d97a63ec669c1
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.OneToMany;
=======
>>>>>>> e1c83681ddbc4773f6fc8aac811d97a63ec669c1

@Entity
@RequestMapping("/compteur")
public class Compteur {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Integer id;
	 Integer numerocompteur;
	 String typepaiement;
<<<<<<< HEAD
	 
	 @JsonIgnore
	 @OneToMany(mappedBy = "compteur" , cascade = CascadeType.ALL , orphanRemoval = true)
	 private List<Abonnement> abonnements = new ArrayList<>();
	 
	 
	 public List<Abonnement> getAbonnements() {
		return abonnements;
	}
	 public void setAbonnements(List<Abonnement> abonnements) {
		 this.abonnements = abonnements;
	 }
=======
>>>>>>> e1c83681ddbc4773f6fc8aac811d97a63ec669c1
	 public Integer getId() {
		 return id;
	 }
	 public void setId(Integer id) {
		 this.id = id;
	 }
	 public Integer getNumerocompteur() {
		 return numerocompteur;
	 }
	 public void setNumerocompteur(Integer numerocompteur) {
		 this.numerocompteur = numerocompteur;
	 }
	 public String getTypepaiement() {
		 return typepaiement;
	 }
	 public void setTypepaiement(String typepaiement) {
		 this.typepaiement = typepaiement;
	 }
	 
}
