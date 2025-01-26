package org.example.dao;

import org.example.entities.Libro;

import javax.persistence.EntityManager;
import java.util.Optional;

public class LibroRepository {
    private EntityManager entityManager;

    public LibroRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Libro save(Libro libro) {
        entityManager.persist(libro);
        return libro;
    }

    public void deleteById(String isbn) {
        Libro libro = entityManager.find(Libro.class, isbn);
        if (libro != null) {
            entityManager.remove(libro);
        }
    }

    public Optional<Libro> findById(String isbn) {
        return Optional.ofNullable(entityManager.find(Libro.class, isbn));
    }
}

