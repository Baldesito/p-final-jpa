package org.example.controller;

import org.example.entities.Prestito;
import org.example.services.BibliotecaService;

import java.util.Optional;

public class PrestitoController {
    private BibliotecaService bibliotecaService;

    public PrestitoController(BibliotecaService bibliotecaService) {
        this.bibliotecaService = bibliotecaService;
    }

    public Prestito aggiungiPrestito(Prestito prestito) {
        return bibliotecaService.aggiungiPrestito(prestito);
    }

    public void rimuoviPrestito(long id) {
        bibliotecaService.rimuoviPrestito(id);
    }

    public Optional<Prestito> cercaPrestitoPerId(long id) {
        return bibliotecaService.cercaPrestitoPerId(id);
    }
}
