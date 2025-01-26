package org.example.dao;

import org.example.entities.Rivista;

import javax.persistence.EntityManager;
import java.util.Optional;

public class RivistaRepository {
    private EntityManager entityManager;

    public RivistaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Rivista save(Rivista rivista) {
        entityManager.persist(rivista);
        return rivista;
    }

    public void deleteById(String isbn) {
        Rivista rivista = entityManager.find(Rivista.class, isbn);
        if (rivista != null) {
            entityManager.remove(rivista);
        }
    }

    public Optional<Rivista> findById(String isbn) {
        return Optional.ofNullable(entityManager.find(Rivista.class, isbn));
    }
}

