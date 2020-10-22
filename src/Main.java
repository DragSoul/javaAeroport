
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import gestion_vol.*;
import reservation.*;

public class Main{
    public static void main(String[] args){

        Compagnie c = new Compagnie("SF SHOCK");
        /* Création des villes */
        Ville v1 = new Ville("Paris");
        Ville v2 = new Ville("Rome");
        Ville v3 = new Ville("New York");
        Ville v4 = new Ville("Barcelone");
        Ville v5 = new Ville("Tokyo");
        Ville v6 = new Ville("Singapour");

        /* Création des aéroports */
        Aeroport a1 = new Aeroport("aeroport de paris", v1);
        Aeroport a2 = new Aeroport("aeroport de rome", v2);
        Aeroport a3 = new Aeroport("aeroport de New York", v3);
        Aeroport a4 = new Aeroport("aeroport de Barcelone", v4);
        Aeroport a5 = new Aeroport("aeroport de Tokyo", v5);
        Aeroport a6 = new Aeroport("aeroport de Singapour", v6);

        /* Ajoute les villes desservies par ces aéroports */
        a1.addDesservi(v3);
        a1.addDesservi(v4);

        a2.addDesservi(v4);
        a2.addDesservi(v5);

        a3.addDesservi(v1);
        a3.addDesservi(v6);

        a4.addDesservi(v1);
        a4.addDesservi(v2);

        a5.addDesservi(v2);
        a5.addDesservi(v6);

        a6.addDesservi(v3);
        a6.addDesservi(v5);

        /* ajout de dates départ/arrivé */
        ZoneId zoneId = ZoneId.of("UTC+1");
        ZonedDateTime d11 = ZonedDateTime.of(2020, 10, 15, 13, 24, 00, 00, zoneId);
        ZonedDateTime d12 = ZonedDateTime.of(2020, 10, 15, 14, 36, 00, 00, zoneId);
        ZonedDateTime d21 = ZonedDateTime.of(2020, 10, 15, 22, 00, 00, 00, zoneId);
        ZonedDateTime d22 = ZonedDateTime.of(2020, 10, 16, 23, 36, 00, 00, zoneId);
        ZonedDateTime d31 = ZonedDateTime.of(2020, 10, 15, 2, 15, 00, 00, zoneId);
        ZonedDateTime d32 = ZonedDateTime.of(2020, 10, 15, 8, 43, 00, 00, zoneId);
        ZonedDateTime d41 = ZonedDateTime.of(2020, 10, 15, 3, 56, 00, 00, zoneId);
        ZonedDateTime d42 = ZonedDateTime.of(2020, 10, 15, 15, 25, 00, 00, zoneId);
        ZonedDateTime d51 = ZonedDateTime.of(2020, 10, 15, 21, 6, 00, 00, zoneId);
        ZonedDateTime d52 = ZonedDateTime.of(2020, 10, 16, 5, 47, 00, 00, zoneId);

        /* création des vols */
        c.creerVol(d11, d12, a1, a3);
        c.creerVol(d21, d22, a2, a4);
        c.creerVol(d31, d32, a4, a1);
        c.creerVol(d41, d42, a6, a5);
        c.creerVol(d51, d52, a6, a3);
        

        /* inventation d'escales */
        Escale e1 = new Escale(d51, d12, a1);
        c.addEscale(e1, 1);
        System.out.println(c);
        Client iencli= new Client("Gérard");
        iencli.ajoutPaiement(Paiement.PAYPAL);
        System.out.println(iencli);

    }
}

