package reservation;

import java.util.Collection;
import java.util.ArrayList;

public class Client{
    private String nom;
    private Paiement paiement;
    private String contact;
    private Collection<Reservation> references = new ArrayList<>();

    public Client(String nom){
        this.nom = nom;
    }

    public void ajoutPaiement(Paiement p){
        this.paiement = p;
    }

    public void reserve(Reservation r){
        this.references.add(r);
    }

    public String toString(){
        return ""+nom;
    }

    public void printReservations(){
        for(Reservation r : this.references){
            System.out.println(r.toString());
        }
    }
}