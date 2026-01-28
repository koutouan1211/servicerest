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

import com.lynda.servicerest.entite.Abonnement;
import com.lynda.servicerest.entite.Client;
import com.lynda.servicerest.entite.Compteur;
import com.lynda.servicerest.entite.Repository.AbonnementRepository;
import com.lynda.servicerest.entite.Repository.ClientRepository;
import com.lynda.servicerest.entite.Repository.CompteurRepository;



@RestController
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




