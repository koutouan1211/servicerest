package com.lynda.servicerest.entite;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@RequestMapping("/compteur")
public class Compteur {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Integer id;
	 Integer numerocompteur;
	 String typepaiement;
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
