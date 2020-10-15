package gestion_vol;


import java.util.Date;

public class Escale{
    private Date depart;
    private Date arrivee;
    private Date duree;
    private Aeroport aeroport;



    public Escale(Date depart, Date arrivee, Aeroport aeroport){
        this.depart= depart;
        this.arrivee = arrivee;
        long l = depart.getTime()-arrivee.getTime();
        System.out.println(l);
        this.aeroport = aeroport;
    }


}