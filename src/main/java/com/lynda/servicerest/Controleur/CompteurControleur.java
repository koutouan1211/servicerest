package com.lynda.servicerest.Controleur;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lynda.servicerest.entite.Compteur;
import com.lynda.servicerest.entite.Repository.CompteurRepository;



@RestController
@RequestMapping("/compteur")
public class CompteurControleur {

	public final CompteurRepository compteurRepository;
	public CompteurControleur(CompteurRepository compteurRepository) {
		this.compteurRepository=compteurRepository;
	}
	
	//recupere la liste de tout les compteurs
  	@GetMapping
  	 public List<Compteur> getlistCompteur(){
  		List<Compteur> listCompteur = compteurRepository.findAll();//recupere tout les element de la base de donnée
  		return listCompteur;
  	}
    
	@PostMapping  //crée une donnée
    public Compteur save(@RequestBody Compteur compteur){//@RequestBody reçoit du Json
        return compteurRepository.save(compteur);//sauvegarde et renvoie la nouvelle donnée cré
	}
    
	//cette parti nous permet de trouver un compteur precis s'il existe on l'affiche sinon message d'erreur
  	@GetMapping("/{id}")
  	public ResponseEntity<?> getCompteur(@PathVariable Integer id) {
  		Optional<Compteur> optUser = compteurRepository.findById(id);// nous permet de savoir si l'utilisateur existe ou pas avec se ID
  		if(optUser.isEmpty()) return new ResponseEntity<>("Cet compteur avec ce id: "+id+" n'existe pas", HttpStatus.NOT_FOUND);
  		
  		return ResponseEntity.ok(optUser.get()); //return new ResponseEntity<>(optUser.get, HttpStatus.OK)
  	}

    
  //sert a cré un nouvelle compteur
  	@PostMapping("/create")
  	public Compteur createUser(@RequestBody Compteur compteur) {
  		Compteur user = compteurRepository.save(compteur);
  		return user;
  	}
    
  //cette parti sert a supprimer un compteur par son ID
  	@DeleteMapping("/{id}")
  	public ResponseEntity<?> deleteUser(@PathVariable Integer id) {
  		//Rechercher si un compteur exist avec cet ID
  		Optional<Compteur> optUser = compteurRepository.findById(id);
  		if(optUser.isEmpty()) return new ResponseEntity<>("Cet compteur avec ce id: "+id+"n'existe pas", HttpStatus.NOT_FOUND); // Si non trouvé, retourné message
  		
  		//Si trouvé, recuperer l'information, supprimer et afficher le resultat
  		Compteur user = optUser.get();
  		compteurRepository.delete(user);
  		return ResponseEntity.ok("compteur avec id: "+id+" a ete supprimé avec succès");
  	}
    
 //cette parti va modifier un compteur
  	@PutMapping("/{id}")
  	public ResponseEntity<?> updateEntity(@PathVariable Integer id , @RequestBody Compteur newUser){
  		Optional<Compteur> optUser = compteurRepository.findById(id);
  		
  		// Vérifier si le compteur existe
  	    if (optUser.isEmpty()) {
  	        return ResponseEntity
  	                .status(HttpStatus.NOT_FOUND)
  	                .body("compteur avec id: " + id + " n'existe pas");
  	    }
  	    
    	  // Récupérer le compteur existant
    	  Compteur user = optUser.get();
  	    

  	    
  	    //Mettre à jour les champs
  	    if (newUser.getNumerocompteur() != null) user.setNumerocompteur(newUser.getNumerocompteur());
  	    if (newUser.getTypepaiement() != null) user.setTypepaiement(newUser.getTypepaiement());
  	    

  	    
  	 //  Sauvegarder les modifications
  	  compteurRepository.save(user);

  	    //  Retourner la réponse
  	    return ResponseEntity.ok(user);
}
  	
  	
}
