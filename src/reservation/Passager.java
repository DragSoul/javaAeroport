package reservation;


public class Passager{
    private String nom;
    private Reservation reservation;

    public Passager(String nom){
        this.nom = nom;
    }

    public void reserve(Reservation r){
        this.reservation = r;
    }

    public String toString(){
        return ""+this.nom;
    }
}