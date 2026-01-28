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

import com.lynda.servicerest.entite.Client;

import com.lynda.servicerest.entite.Repository.ClientRepository;



@RestController
@RequestMapping("/client")
public class ClientControleur {

    // injection par constructeur
    public final ClientRepository clientRepository;
    public ClientControleur(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

  //recupere la liste de tout les clients
  	@GetMapping
  	 public List<Client> getlistUtilisateurs(){
  		List<Client> listClients = clientRepository.findAll();//recupere tout les element de la base de donnée
  		return listClients;
  	}

  	@PostMapping  //crée une donnée
    public Client save(@RequestBody Client client){//@RequestBody reçoit du Json
        return clientRepository.save(client);//sauvegarde et renvoie la nouvelle donnée cré
	}

  //cette parti nous permet de trouver un client precis s'il existe on l'affiche sinon message d'erreur
  	@GetMapping("/{id}")
  	public ResponseEntity<?> getClient(@PathVariable Integer id) {
  		Optional<Client> optUser = clientRepository.findById(id);// nous permet de savoir si l'utilisateur existe ou pas avec se ID
  		if(optUser.isEmpty()) return new ResponseEntity<>("Cet client avec ce id: "+id+" n'existe pas", HttpStatus.NOT_FOUND);
  		
  		return ResponseEntity.ok(optUser.get()); //return new ResponseEntity<>(optUser.get, HttpStatus.OK)
  	}

  //sert a cré un nouvelle client
  	@PostMapping("/create")
  	public Client createUser(@RequestBody Client client) {
  		Client user = clientRepository.save(client);
  		return user;
  	}

  //cette parti sert a supprimer un client par son ID
  	@DeleteMapping("/{id}")
  	public ResponseEntity<?> deleteUser(@PathVariable Integer id) {
  		//Rechercher si un client exist avec cet ID
  		Optional<Client> optUser = clientRepository.findById(id);
  		if(optUser.isEmpty()) return new ResponseEntity<>("Cet client avec ce id: "+id+"n'existe pas", HttpStatus.NOT_FOUND); // Si non trouvé, retourné message
  		
  		//Si trouvé, recuperer l'information, supprimer et afficher le resultat
  		Client user = optUser.get();
  		clientRepository.delete(user);
  		return ResponseEntity.ok("client avec id: "+id+" et nom :"+user.getNom()+" a ete supprimé avec succès");
  	}

  //cette parti va modifier un client
  	@PutMapping("/{id}")
  	public ResponseEntity<?> updateEntity(@PathVariable Integer id , @RequestBody Client newUser){
  		Optional<Client> optUser = clientRepository.findById(id);
  		
  		// Vérifier si le client existe
  	    if (optUser.isEmpty()) {
  	        return ResponseEntity
  	                .status(HttpStatus.NOT_FOUND)
  	                .body("Client avec id: " + id + " n'existe pas");
  	    }
  	    
  	  // Récupérer le client existant
  	  Client user = optUser.get();
	    

	    
	    //Mettre à jour les champs
	    if (newUser.getNom() != null) user.setNom(newUser.getNom());
	    if (newUser.getPrenom() != null) user.setPrenom(newUser.getPrenom());
	    if (newUser.getContacte() != null) user.setContacte(newUser.getContacte());
	    if (newUser.getCompte() != null) user.setCompte(newUser.getCompte());

	    
	 //  Sauvegarder les modifications
	    clientRepository.save(user);

	    //  Retourner la réponse
	    return ResponseEntity.ok(user);
	}
}
  	
  	



