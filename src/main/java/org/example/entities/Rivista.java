package org.example.entities;

import javax.persistence.*;

@Entity
@Table(name= "Rivista")
public class Rivista {
    @Id
    private String codiceISBN;
    private String titolo;
    private String autore;
    private int annoPubblicazione;
    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;


    public Rivista() {}

    public Rivista(String codiceISBN, String titolo, String autore, int annoPubblicazione, Periodicita periodicita) {
        this.codiceISBN = codiceISBN;
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
        this.periodicita = periodicita;
    }

    public String getCodiceISBN() {
        return codiceISBN;
    }

    public void setCodiceISBN(String codiceISBN) {
        this.codiceISBN = codiceISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "codiceISBN='" + codiceISBN + '\'' +
                ", titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", periodicita=" + periodicita +
                '}';
    }
}
