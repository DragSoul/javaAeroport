package reservation;


import java.time.ZonedDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import gestion_vol.Vol;

public class Reservation {

    private static int num = 0;
    private int numero;
    private Vol vol;
    private ZonedDateTime date;
    private Client client;
    private Passager passager;

    public Reservation(Client client,Passager passager,Vol vol){
        if(ZonedDateTime.now().isAfter(vol.getDateDepart())){
            vol.fermer();
            throw new IllegalArgumentException("Attention les réservations pour ce vol étaient encore ouvertes alors que ce vol est terminé, heureusement comme je suis une personne responsable et bien intentionnée, je viens de fermer les réservations pour ce vol");
        }
        this.num ++;
        this.numero = this.num;
        this.date = ZonedDateTime.now();
        this.vol = vol;
        this.client = client;
        this.passager = passager; 
        client.reserve(this);
        passager.reserve(this);
    }

    public String toString(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy à HH:mm");
        return "La réservation numéro "+this.num+" faite le "+ format.format(this.date) +" pour le vol n°"+ this.vol.getNumero() +" concernant le client "+ this.client +" et le passager "+ this.passager;
    }

}