package ro.mycode.controllers;
import ro.mycode.Main;
import ro.mycode.models.Magazin;
import java.util.ArrayList;
public class ControllMagazin {


    public static ArrayList<Magazin> magazin=new ArrayList<>();

    public static void load(){

        Magazin primul1= new Magazin();
        Magazin primul2= new Magazin();
        Magazin primul3= new Magazin();
        Magazin primul4= new Magazin();

        primul2.raion="Mezeluri";
        primul2.denumireProdus="Ceafa de porc";
        primul2.pret=23;
        primul2.alarmaStoc=true;
        primul2.nrBucati=3;

        primul3.raion="Parfumuri";
        primul3.denumireProdus="PacoRabana";
        primul3.pret=567;
        primul3.alarmaStoc=false;
        primul3.nrBucati=61;

        primul4.raion="Igena";
        primul4.denumireProdus="Hartie igenica";
        primul4.pret=49;
        primul4.alarmaStoc=true;
        primul4.nrBucati=1;

        primul1.raion="Bauturi";
        primul1.denumireProdus="CocaCola";
        primul1.pret=5;
        primul1.alarmaStoc=false;
        primul1.nrBucati=234;


        magazin.add(primul1);
        magazin.add(primul2);
        magazin.add(primul3);
        magazin.add(primul4);
    }





}
