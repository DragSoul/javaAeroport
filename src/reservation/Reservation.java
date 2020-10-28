package reservation;


import java.time.ZonedDateTime;
import java.util.Date;

public class Reservation {

    private int numeroReservation;
    private ZonedDateTime date;
    private Passager p;

    public Reservation(int numeroVol){
        this.date = ZonedDateTime.now();
        
    }
   

    private void annuler(){

    }

    private void confirmer() {

    }


}