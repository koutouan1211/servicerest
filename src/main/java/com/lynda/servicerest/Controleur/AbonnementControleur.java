package com.lynda.servicerest.Controleur;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD

=======
import org.springframework.ui.Model;
>>>>>>> e1c83681ddbc4773f6fc8aac811d97a63ec669c1
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lynda.servicerest.entite.Abonnement;
<<<<<<< HEAD
import com.lynda.servicerest.entite.Client;
import com.lynda.servicerest.entite.Compteur;
import com.lynda.servicerest.entite.Repository.AbonnementRepository;
import com.lynda.servicerest.entite.Repository.ClientRepository;
import com.lynda.servicerest.entite.Repository.CompteurRepository;
=======

import com.lynda.servicerest.entite.Repository.AbonnementRepository;
>>>>>>> e1c83681ddbc4773f6fc8aac811d97a63ec669c1



@RestController
<<<<<<< HEAD
@RequestMapping("/abonnements")
public class AbonnementControleur {

    private final AbonnementRepository abonnementRepository;
    private final ClientRepository clientRepository;
    private final CompteurRepository compteurRepository;

    public AbonnementControleur(
            AbonnementRepository abonnementRepository,
            ClientRepository clientRepository,
            CompteurRepository compteurRepository) {
        this.abonnementRepository = abonnementRepository;
        this.clientRepository = clientRepository;
        this.compteurRepository = compteurRepository;
    }

    //  Lister tous les abonnements
    @GetMapping
    public List<Abonnement> getAll() {
        return abonnementRepository.findAll();
    }

    //  Récupérer un abonnement par ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id) {
        return abonnementRepository.findById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .body("Abonnement avec id " + id + " introuvable"));
    }



    //  Créer un abonnement
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Abonnement abonnement) {

        Integer clientId = abonnement.getClient().getId();
        Integer compteurId = abonnement.getCompteur().getId();

        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new RuntimeException("Client introuvable"));

        Compteur compteur = compteurRepository.findById(compteurId)
                .orElseThrow(() -> new RuntimeException("Compteur introuvable"));

        abonnement.setClient(client);
        abonnement.setCompteur(compteur);

        Abonnement saved = abonnementRepository.save(abonnement);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    //  Modifier un abonnement
    @PutMapping("/{id}")
    public ResponseEntity<?> update(
            @PathVariable Integer id,
            @RequestBody Abonnement newAbonnement) {

        Optional<Abonnement> opt = abonnementRepository.findById(id);
        if (opt.isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Abonnement avec id " + id + " introuvable");
        }

        Abonnement abonnement = opt.get();

        if (newAbonnement.getClient() != null) {
            Integer clientId = newAbonnement.getClient().getId();
            Client client = clientRepository.findById(clientId)
                    .orElseThrow(() -> new RuntimeException("Client introuvable"));
            abonnement.setClient(client);
        }

        if (newAbonnement.getCompteur() != null) {
            Integer compteurId = newAbonnement.getCompteur().getId();
            Compteur compteur = compteurRepository.findById(compteurId)
                    .orElseThrow(() -> new RuntimeException("Compteur introuvable"));
            abonnement.setCompteur(compteur);
        }

        return ResponseEntity.ok(abonnementRepository.save(abonnement));
    }

    //  Supprimer un abonnement
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        if (!abonnementRepository.existsById(id)) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Abonnement avec id " + id + " introuvable");
        }

        abonnementRepository.deleteById(id);
        return ResponseEntity.ok("Abonnement supprimé avec succès");
    }
}




=======
@RequestMapping("/abonnement")
public class AbonnementControleur {
  
	//creation d'un constructeur
	public final AbonnementRepository abonnementRepository;
	public AbonnementControleur(AbonnementRepository abonnementRepository) {
		this.abonnementRepository=abonnementRepository;
	}
	
	//recupere la liste de tout les abonnements
  	@GetMapping
  	 public List<Abonnement> getlistAbonnement(){
  		List<Abonnement> listAbonnement = abonnementRepository.findAll();//recupere tout les element de la base de donnée
  		return listAbonnement;
  	}
	
	//creation d'un formulaire
	@GetMapping("/formulaire")
	public String affichageDuFormulaire(Model model) {
		model.addAttribute("abonnement" , new Abonnement()); //cré un nouvelle objet vide
		return "abonnement/formulaire";//retour d'un formulaire
	}
	
	@PostMapping  //crée une donnée
    public Abonnement save(@RequestBody Abonnement abonnement){//@RequestBody reçoit du Json
        return  abonnementRepository.save(abonnement);//sauvegarde et renvoie la nouvelle donnée cré
	}

	
	//cette parti nous permet de trouver un abonnement precis s'il existe on l'affiche sinon message d'erreur
  	@GetMapping("/{id}")
  	public ResponseEntity<?> getAbonnement(@PathVariable Integer id) {
  		Optional<Abonnement> optUser = abonnementRepository.findById(id);// nous permet de savoir si l'utilisateur existe ou pas avec se ID
  		if(optUser.isEmpty()) return new ResponseEntity<>("Cet Abonnement avec ce id: "+id+" n'existe pas", HttpStatus.NOT_FOUND);
  		
  		return ResponseEntity.ok(optUser.get()); //return new ResponseEntity<>(optUser.get, HttpStatus.OK)
  	}
	
  //sert a cré un nouvelle abonnement
  	@PostMapping("/create")
  	public Abonnement createUser(@RequestBody Abonnement abonnement) {
  		Abonnement user = abonnementRepository.save(abonnement);
  		return user;
  	}
	
  //cette parti sert a supprimer un abonnement par son ID
  	@DeleteMapping("/{id}")
  	public ResponseEntity<?> deleteUser(@PathVariable Integer id) {
  		//Rechercher si un abonnement exist avec cet ID
  		Optional<Abonnement> optUser = abonnementRepository.findById(id);
  		if(optUser.isEmpty()) return new ResponseEntity<>("Cet abonnement avec ce id: "+id+"n'existe pas", HttpStatus.NOT_FOUND); // Si non trouvé, retourné message
  		
  		//Si trouvé, recuperer l'information, supprimer et afficher le resultat
  		Abonnement user = optUser.get();
  		abonnementRepository.delete(user);
  		return ResponseEntity.ok("abonnement avec id: "+id+" a ete supprimé avec succès");
  	}
  	
  //cette parti va modifier un abonnement
  	@PutMapping("/{id}")
  	public ResponseEntity<?> updateEntity(@PathVariable Integer id , @RequestBody Abonnement newUser){
  		Optional<Abonnement> optUser = abonnementRepository.findById(id);
  		
  		// Vérifier si l'abonnement existe
  	    if (optUser.isEmpty()) {
  	        return ResponseEntity
  	                .status(HttpStatus.NOT_FOUND)
  	                .body("abonnement avec id: " + id + " n'existe pas");
  	    }
  	    
    	  // Récupérer l'abonnement existant
  	  Abonnement user = optUser.get();
  	    

  	    
  	    //Mettre à jour les champs
  	    if (newUser.getIdclient() != null) user.setIdclient(newUser.getIdclient());
  	    if (newUser.getIdcompteur() != null) user.setIdcompteur(newUser.getIdcompteur());
  	    

  	    
  	 //  Sauvegarder les modifications
  	  abonnementRepository.save(user);

  	    //  Retourner la réponse
  	    return ResponseEntity.ok(user);
}
}


>>>>>>> e1c83681ddbc4773f6fc8aac811d97a63ec669c1
