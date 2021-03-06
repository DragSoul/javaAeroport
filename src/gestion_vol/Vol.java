package gestion_vol;
import reservation.Reservation;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;


public class Vol {
    private boolean estOuvert; 
    private static int num = 0;
    private int numero;
    private ZonedDateTime dateDepart;
    private ZonedDateTime dateArrivee;
    private Aeroport depart;
    private Aeroport arrivee;
    private long duree; //nb minutes
    private Collection<Escale> escales = new ArrayList<>();

    
    public Vol(ZonedDateTime dateDepart, ZonedDateTime dateArrivee, Aeroport a1, Aeroport a2){
        if(dateArrivee.isBefore(dateDepart)){
            throw new IllegalArgumentException("Date d'aarivée antérieure à la date de départ");
        }
        this.duree = Duration.between(dateDepart, dateArrivee).toMinutes();
        this.num++;
        this.numero = num;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.depart = a1;
        this.arrivee = a2;
        this.estOuvert = false;
    }

    public boolean getEtatOuverture(){
        return this.estOuvert;
    }

    public void ouvrir(){
        this.estOuvert = true;
    }

    public void fermer(){
        this.estOuvert = false;
    }

    public ZonedDateTime getDateDepart(){
        return this.dateDepart;
    }

    public int getNumero(){
        return this.numero;
    }

    public void addEscale(Escale e){
        this.escales.add(e);
    }

    public String toString(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy à HH:mm");
        String s = "";
        s = s + "vol n°" + numero + "\n";
        s = s + "Départ " + depart + " le " + format.format(dateDepart) + "\n";
        s = s + "Arrivée " + arrivee + " le " + format.format(dateArrivee) + "\n";
        s = s + "Durée du vol : " + duree + "min\n";
        for(Escale e: escales){
            s = s + e;
        }
        return s;
    }
}

