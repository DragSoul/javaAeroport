package gestion_vol;


import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class Escale{
    private ZonedDateTime depart;
    private ZonedDateTime arrivee;
    private long duree;
    private Aeroport aeroport;



    public Escale(ZonedDateTime depart, ZonedDateTime arrivee, Aeroport aeroport){
        if(arrivee.isAfter(depart)){
            throw new IllegalArgumentException("retour dans le passé ? Serai-ce l'oeuvre d'un stand ennemi ?");
        }
        this.depart= depart;
        this.arrivee = arrivee;
        this.duree = Duration.between(arrivee, depart).toMinutes();
        this.aeroport = aeroport;
    }

    public String toString(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy à HH:mm");

        return "Escale à " + aeroport + " de " + format.format(arrivee) + " jusqu'à " + format.format(depart) + " durée = " + this.duree;
    }
}