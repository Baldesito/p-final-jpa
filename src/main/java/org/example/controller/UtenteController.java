package org.example.controller;

import org.example.entities.Utente;
import org.example.services.BibliotecaService;

import java.util.Optional;

public class UtenteController {
    private BibliotecaService bibliotecaService;

    public UtenteController(BibliotecaService bibliotecaService) {
        this.bibliotecaService = bibliotecaService;
    }

    public Utente aggiungiUtente(Utente utente) {
        return bibliotecaService.aggiungiUtente(utente);
    }

    public void rimuoviUtente(String numeroTessera) {
        bibliotecaService.rimuoviUtente(numeroTessera);
    }

    public Optional<Utente> cercaUtentePerNumeroTessera(String numeroTessera) {
        return bibliotecaService.cercaUtentePerNumeroTessera(numeroTessera);
    }
}
