package gestion_vol;
import reservation.Reservation;

import java.time.ZonedDateTime;
import java.util.ArrayList;


public class Vol {
    private int numero;
    private ZonedDateTime depart;
    private ZonedDateTime arrivee;
    private ArrayList<Escale> escales;


    public Vol(int numero, ZonedDateTime depart, ZonedDateTime arrivee, ArrayList<Escale> escales) {
        this.numero = numero;
        this.depart = depart;
        this.arrivee = arrivee;
        this.escales = escales;

    }

    private void ouvrir(){

    }

    

    private void fermer(){

    }

}

    
    