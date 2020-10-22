package gestion_vol;

import java.util.List;
import java.util.ArrayList;

public class Aeroport{

    private String nom;
    private Ville ville;
    private List<Ville> dessert;

    public Aeroport(String nom, Ville v){
        this.nom = nom;
        this.ville = v;
        this.dessert = new ArrayList<>();
        this.ville.ajouterAeroport(this);
    }

    public void addDesservi(Ville v){
        dessert.add(v);
    }
    
    public String toString(){
        return ""+ville;
    }
}