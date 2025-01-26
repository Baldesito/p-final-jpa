package org.example.controller;

import org.example.entities.Libro;
import org.example.services.BibliotecaService;

import java.util.Optional;

public class LibroController {
    private BibliotecaService bibliotecaService;

    public LibroController(BibliotecaService bibliotecaService) {
        this.bibliotecaService = bibliotecaService;
    }

    public Libro aggiungiLibro(Libro libro) {
        return bibliotecaService.aggiungiLibro(libro);
    }

    public void rimuoviLibro(String isbn) {
        bibliotecaService.rimuoviLibro(isbn);
    }

    public Optional<Libro> cercaLibroPerIsbn(String isbn) {
        return bibliotecaService.cercaLibroPerIsbn(isbn);
    }
}

