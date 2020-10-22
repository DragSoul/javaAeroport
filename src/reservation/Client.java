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

    public void effectue(String nom){
        Reservation r = new Reservation();
        
    }

    public String toString(){
        return ""+nom+"\npaiement : "+paiement;
    }
}