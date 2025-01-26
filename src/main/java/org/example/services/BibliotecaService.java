package org.example.services;

import org.example.dao.LibroRepository;
import org.example.dao.PrestitoRepository;
import org.example.dao.RivistaRepository;
import org.example.dao.UtenteRepository;
import org.example.entities.Libro;
import org.example.entities.Prestito;
import org.example.entities.Rivista;
import org.example.entities.Utente;

import javax.persistence.EntityManager;
import java.util.Optional;

public class BibliotecaService {
    private LibroRepository libroRepository;
    private RivistaRepository rivistaRepository;
    private UtenteRepository utenteRepository;
    private PrestitoRepository prestitoRepository;

    public BibliotecaService(EntityManager entityManager) {
        this.libroRepository = new LibroRepository(entityManager);
        this.rivistaRepository = new RivistaRepository(entityManager);
        this.utenteRepository = new UtenteRepository(entityManager);
        this.prestitoRepository = new PrestitoRepository(entityManager);
    }

    public Libro aggiungiLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public void rimuoviLibro(String isbn) {
        libroRepository.deleteById(isbn);
    }

    public Optional<Libro> cercaLibroPerIsbn(String isbn) {
        return libroRepository.findById(isbn);
    }

    public Rivista aggiungiRivista(Rivista rivista) {
        return rivistaRepository.save(rivista);
    }

    public void rimuoviRivista(String isbn) {
        rivistaRepository.deleteById(isbn);
    }

    public Optional<Rivista> cercaRivistaPerIsbn(String isbn) {
        return rivistaRepository.findById(isbn);
    }

    public Utente aggiungiUtente(Utente utente) {
        return utenteRepository.save(utente);
    }

    public void rimuoviUtente(String numeroTessera) {
        utenteRepository.deleteById(numeroTessera);
    }

    public Optional<Utente> cercaUtentePerNumeroTessera(String numeroTessera) {
        return utenteRepository.findById(numeroTessera);
    }

    public Prestito aggiungiPrestito(Prestito prestito) {
        return prestitoRepository.save(prestito);
    }

    public void rimuoviPrestito(long id) {
        prestitoRepository.deleteById(id);
    }

    public Optional<Prestito> cercaPrestitoPerId(long id) {
        return prestitoRepository.findById(id);
    }
}
