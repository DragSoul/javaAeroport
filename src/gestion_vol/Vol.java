package gestion_vol;
import reservation.Reservation;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;


public class Vol {
    private int numero;
    private ZonedDateTime dateDepart;
    private ZonedDateTime dateArrivee;
    private Aeroport depart;
    private Aeroport arrivee;
    private long duree; //nb minutes
    private ArrayList<Escale> escales;

    
    public Vol(ZonedDateTime dateDepart, ZonedDateTime dateArrivee, Aeroport a1, Aeroport a2){
        if(dateArrivee.isBefore(dateDepart)){
            throw new IllegalArgumentException("Date d'aarivée antérieure à la date de départ");
        }
        this.duree = Duration.between(dateDepart, dateArrivee).toMinutes();
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

    public String toString(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy à HH:mm");
        String s = "";
        s = s + "vol n°" + numero + "\n";
        s = s + "Départ " + depart + " le " + format.format(dateDepart) + "\n";
        s = s + "Arrivée " + arrivee + " le " + format.format(dateArrivee) + "\n";
        s = s + "Durée du vol : " + duree + "min";
        return s;
    }
}

