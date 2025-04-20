package org.example;

import java.rmi.Naming;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {
        try{
            String hostUrl = "rmi://localhost:1099/gestionCompteRmi";
            String username = "admin";
            IGestionCompte stub = (IGestionCompte) Naming.lookup(hostUrl);
            stub.creerCompte("1", new Date(), 124.543);
            System.out.print(stub.getSolde("1"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}