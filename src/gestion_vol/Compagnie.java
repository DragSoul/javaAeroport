package gestion_vol;

import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.ArrayList;

public class Compagnie{

    private String nom;
    private Collection<Vol> vols = new ArrayList<>();


    public Compagnie(String nom){
        this.nom = nom;
    }

    public void creerVol(ZonedDateTime depart, ZonedDateTime arrivee, Aeroport aeroport1, Aeroport aeroport2){
        vols.add(new Vol(depart, arrivee, aeroport1, aeroport2));
    }

    public Collection<Vol> getVols(){
        return this.vols;  
    }

    public void addEscale(Escale e, int id){
        for(Vol v:vols){
            if(v.getNumero() == id){
                v.addEscale(e);
            }
        }
    }

    public String toString(){
        String s = "";
        for(Vol v : vols){
            s = s + v +"\n";
        }
        return s;
    }


}