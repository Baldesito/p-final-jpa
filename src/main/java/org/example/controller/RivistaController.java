package org.example.controller;

import org.example.entities.Rivista;
import org.example.services.BibliotecaService;

import java.util.Optional;

public class RivistaController {
    private BibliotecaService bibliotecaService;

    public RivistaController(BibliotecaService bibliotecaService) {
        this.bibliotecaService = bibliotecaService;
    }

    public Rivista aggiungiRivista(Rivista rivista) {
        return bibliotecaService.aggiungiRivista(rivista);
    }

    public void rimuoviRivista(String isbn) {
        bibliotecaService.rimuoviRivista(isbn);
    }

    public Optional<Rivista> cercaRivistaPerIsbn(String isbn) {
        return bibliotecaService.cercaRivistaPerIsbn(isbn);
    }
}

