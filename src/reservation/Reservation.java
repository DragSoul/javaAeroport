package reservation;


import java.time.ZonedDateTime;
import java.util.Date;

public class Reservation {

    private int numeroReservation;
    private ZonedDateTime date;
    private Passager p;

    public Reservation(){
        this.date = ZonedDateTime.now();
        Passager p; 
    }
   

    private void annuler(){

    }

    private void confirmer() {

    }


}