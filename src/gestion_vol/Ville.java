package gestion_vol;

import java.util.List;
import java.util.ArrayList;

public class Ville{
    private String nom;
    private List<Aeroport> desservi;

    public Ville(String nom){
        this.nom = nom;
        this.desservi = new ArrayList<>();;
    }

    public void ajouterAeroport(Aeroport a){
        this.desservi.add(a);
    }
}