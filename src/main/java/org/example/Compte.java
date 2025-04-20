package org.example;

import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable {
    // attributes
    private String numero;
    private Date dateCreation;
    private double solde;

    // constructors
    Compte() {

    }
    Compte(String numero, Date dateCreation, double solde) {

    }

    // Getters & Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
