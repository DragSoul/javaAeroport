
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import gestion_vol.*;
import reservation.*;

public class Main{
    public static void main(String[] args){

        Compagnie c = new Compagnie("SF SHOCK");
        /*Timestamp t1 = new Timestamp();
        Aeroport a = new Aeroport("San Fransisco", );

        Date d1, d2;
        try{
            d1 = new SimpleDateFormat("yyyy/MM/dd HH-mm").parse("2020/10/15 13-24");
            d2 = new SimpleDateFormat("yyyy/MM/dd HH-mm").parse("2020/10/15 13-25");
        
        Escale e = new Escale();

        long l = d2.getTime()-d1.getTime();
        Date d3 = dateConvert(l);
        System.out.println(d3);
        }
        catch(ParseException e){
            System.out.println("apprend à faire des regex...");
        }*/
    }

    private static Date dateConvert(long l) throws ParseException{
        int secondes, minutes, heures;
        l = l/1000;
        heures = (int)l/3600;
        l = l - heures*3600;
        minutes = (int)l/60;
        l = l - minutes*60;
        secondes = (int)l;

        return new SimpleDateFormat("HH-mm-ss").parse(heures+"-"+minutes+"-"+secondes);
    }
}

