package org.example.dao;

import org.example.entities.Utente;

import javax.persistence.EntityManager;
import java.util.Optional;

public class UtenteRepository {
    private EntityManager entityManager;

    public UtenteRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Utente save(Utente utente) {
        entityManager.persist(utente);
        return utente;
    }

    public void deleteById(String numeroTessera) {
        Utente utente = entityManager.find(Utente.class, numeroTessera);
        if (utente != null) {
            entityManager.remove(utente);
        }
    }

    public Optional<Utente> findById(String numeroTessera) {
        return Optional.ofNullable(entityManager.find(Utente.class, numeroTessera));
    }
}

