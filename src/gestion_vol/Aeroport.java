package gestion_vol;

import java.util.Collection;
import java.util.ArrayList;

public class Aeroport{

    private String nom;
    private Ville ville;
    private Collection<Ville> dessert = new ArrayList<>();

    public Aeroport(String nom, Ville v){
        this.nom = nom;
        this.ville = v;
        this.ville.ajouterAeroport(this);
    }

    public void addDesservi(Ville v){
        dessert.add(v);
    }
    
    public String toString(){
        return ""+ville;
    }
}