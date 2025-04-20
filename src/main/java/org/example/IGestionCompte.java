package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface IGestionCompte extends Remote {
    void creerCompte(String numero, Date dateCreation, double solde) throws RemoteException;
    double getSolde(String numeroCompte) throws RemoteException;
}
