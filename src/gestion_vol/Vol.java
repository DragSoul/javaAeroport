package gestion_vol;
import reservation.Reservation;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.ArrayList;


public class Vol {
    private int numero;
    private ZonedDateTime dateDepart;
    private ZonedDateTime dateArrivee;
    private Aeroport depart;
    private Aeroport arrivee;
    private ArrayList<Escale> escales;


    public Vol(ZonedDateTime dateDepart, ZonedDateTime dateArrivee, Aeroport a1, Aeroport a2) {
        this.numero = Numero.numero();
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.depart = a1;
        this.arrivee = a2;
    }

    private void ouvrir(){

    }

    private void fermer(){

    }
}

    
    