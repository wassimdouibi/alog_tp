package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionCompte extends UnicastRemoteObject implements IGestionCompte {
    protected GestionCompte() throws RemoteException {
        super();
    }

    @Override
    public void creerCompte(String numero, Date dateCreation, double solde) throws RemoteException {
        Compte nouveauCompte = new Compte(numero, dateCreation, solde);
    }
    @Override
    public double getSolde(String numeroCompte) throws RemoteException {
        double solde = 0;
        List<Compte>comptes = new ArrayList<Compte>();
        comptes.add(new Compte("1", new Date(), 2143.32));
        comptes.add(new Compte("2", new Date(), 132));
        comptes.add(new Compte("3", new Date(), 20.43));
        comptes.add(new Compte("4", new Date(), 54));
        comptes.add(new Compte("5", new Date(), 657));

        for (Compte compte : comptes) {
            if (compte.getNumero().equals(numeroCompte)) {
                solde = compte.getSolde();
            }
        }

        return solde;
    }

}
