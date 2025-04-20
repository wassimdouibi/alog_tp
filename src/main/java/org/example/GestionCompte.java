package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionCompte extends UnicastRemoteObject implements IGestionCompte {
    private List<Compte> comptes;

    protected GestionCompte() throws RemoteException {
        super();
        comptes = new ArrayList<Compte>();
        comptes.add(new Compte("1", new Date(), 2143.32));
        comptes.add(new Compte("2", new Date(), 132));
        comptes.add(new Compte("3", new Date(), 20.43));
        comptes.add(new Compte("4", new Date(), 54));
        comptes.add(new Compte("5", new Date(), 657));
    }

    @Override
    public void creerCompte(String numero, Date dateCreation, double solde) throws RemoteException {
        Compte nouveauCompte = new Compte(numero, dateCreation, solde);
    }
    @Override
    public double getSolde(String numeroCompte) throws RemoteException {
        return comptes.get(Integer.getInteger(numeroCompte)).getSolde();
    }
}
