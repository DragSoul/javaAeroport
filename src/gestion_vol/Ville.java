package gestion_vol;

import java.util.Collection;
import java.util.ArrayList;

public class Ville{
    private String nom;
    private Collection<Aeroport> desservi = new ArrayList<>();

    public Ville(String nom){
        this.nom = nom;
    }

    public void ajouterAeroport(Aeroport a){
        this.desservi.add(a);
    }

    public String toString(){
        return ""+nom;
    }
}