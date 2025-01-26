package org.example;

import org.example.entities.*;
import org.example.services.BibliotecaService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("progetto-final");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        BibliotecaService bibliotecaService = new BibliotecaService(entityManager);

        entityManager.getTransaction().begin();

        // Creazione di 3 libri di esempio
        Libro libro1 = new Libro("1234567890123", "Il Signore degli Anelli", "Tolkien", 1954, 1216);
        Libro libro2 = new Libro("9876543210123", "Rock Star", "George", 1949, 328);
        Libro libro3 = new Libro("4567890123456", "Dick One", "Melville", 1851, 635);

        // Aggiunta dei libri
        bibliotecaService.aggiungiLibro(libro1);
        bibliotecaService.aggiungiLibro(libro2);
        bibliotecaService.aggiungiLibro(libro3);

        // Creazione di 3 riviste con diverse periodicita
        Rivista rivista1 = new Rivista("1111111111111", "Tech", "Vari", 2021, Periodicita.SETTIMANALE);
        Rivista rivista2 = new Rivista("2222222222222", "Science", "Pippo", 2024, Periodicita.MENSILE);
        Rivista rivista3 = new Rivista("3333333333333", "Art", "Umberto", 2023, Periodicita.SEMESTRALE);

        // Aggiunta delle riviste
        bibliotecaService.aggiungiRivista(rivista1);
        bibliotecaService.aggiungiRivista(rivista2);
        bibliotecaService.aggiungiRivista(rivista3);

        // Aggiunta di un utente di esempio
        Utente utente1 = new Utente("001", "Mario", "Yarry", LocalDate.of(1995, 1, 1));
        Utente utente2 = new Utente("002", "Maria", "Rassel", LocalDate.of(2000, 2, 2));
        Utente utente3 = new Utente("003", "Martina", "Rossa", LocalDate.of(1999, 3, 3));
        // 3 Utenti aggiunti
        bibliotecaService.aggiungiUtente(utente1);
        bibliotecaService.aggiungiUtente(utente2);
        bibliotecaService.aggiungiUtente(utente3);

        // Creazione di un prestito di esempio
        Prestito prestito1 = new Prestito();
        prestito1.setUtente(utente1);
        prestito1.setElementoPrestato(libro2); // Assegniamo uno dei libri creati
        prestito1.setDataInizioPrestito(LocalDate.now());
        prestito1.setDataRestituzionePrevista(LocalDate.now().plusDays(30));

        bibliotecaService.aggiungiPrestito(prestito1);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
