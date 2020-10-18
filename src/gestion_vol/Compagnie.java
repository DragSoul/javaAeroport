package gestion_vol;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.ArrayList;

public class Compagnie{

    private String nom;
    private List<Vol> vols;

    


    public Compagnie(String nom){
        this.nom = nom;
        vols = new ArrayList<>();
    }

    private void creerVol(ZonedDateTime depart, ZonedDateTime arrivee, Aeroport aeroport1, Aeroport aeroport2){
        vols.add(new Vol(depart, arrivee, aeroport1, aeroport2));
        //return new Vol(510).le(15/01/2020).a(clermont).arrive(15/01/2020).a(nevers).passantpar()
    }

    /*private void nouveauVol(num, dated, datea){
        vols[num].clone().le(dated).arrivee(datea);
        
    }*/


}