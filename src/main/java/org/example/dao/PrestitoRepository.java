package org.example.dao;

import org.example.entities.Prestito;

import javax.persistence.EntityManager;
import java.util.Optional;

public class PrestitoRepository {
    private EntityManager entityManager;

    public PrestitoRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Prestito save(Prestito prestito) {
        entityManager.persist(prestito);
        return prestito;
    }

    public void deleteById(Long id) {
        Prestito prestito = entityManager.find(Prestito.class, id);
        if (prestito != null) {
            entityManager.remove(prestito);
        }
    }

    public Optional<Prestito> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Prestito.class, id));
    }
}

