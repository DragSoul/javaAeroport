package gestion_vol;

import java.util.ArrayList;

public class Ville{
    private String nom;
    private ArrayList<Aeroport> desservi;

    public Ville(String nom, ArrayList<Aeroport> desservi){
        this.nom = nom;
        this.desservi = desservi;
    }
}