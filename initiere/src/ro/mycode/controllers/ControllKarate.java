package ro.mycode.controllers;
import ro.mycode.models.Karate;


import java.util.ArrayList;
public class ControllKarate {
    private ArrayList<Karate> caratist;

    public ControllKarate(){
        this.caratist = new ArrayList<>();
        this.load();
    }

    public void load(){

        Karate caratist1 = new Karate("Carina", "F", "Rosie", 8, "Puma");
        Karate caratist2 = new Karate("Valentin", "M", "Neagra", 5, "Puma");
        Karate caratist3 = new Karate("Radu", "M", "Verde", 8, "Dragonul");
        Karate caratist4 = new Karate("Carmnen", "F", "Neagra", 8, "Puma");


        this.caratist.add(caratist1);
        this.caratist.add(caratist2);
        this.caratist.add(caratist3);
        this.caratist.add(caratist4);

    }


    //todo: afisare

    public void afisareKarate(){
        for(int i=0; i<caratist.size();i++){
            System.out.println(caratist.get(i).afisareKarate());
        }
    }







}
