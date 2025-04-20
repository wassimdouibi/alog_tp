package org.example;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(1099);
            GestionCompte objet = new GestionCompte();
            Naming.rebind("gestionCompteRmi", objet);
            System.out.print("Le serveur est prêt");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}