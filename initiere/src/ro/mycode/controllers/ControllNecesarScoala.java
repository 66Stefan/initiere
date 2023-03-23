package ro.mycode.controllers;
import ro.mycode.models.NecesarScoala;
import java.util.ArrayList;
public class ControllNecesarScoala {

    private ArrayList<NecesarScoala> scoala;

    public ControllNecesarScoala(){
        this.scoala = new  ArrayList<>();
        this.load();
    }

    public void load(){

        NecesarScoala scoala1= new NecesarScoala("Matematica", 56, "Creion", 212, "Pinochio");
        NecesarScoala scoala2= new NecesarScoala("Desen", 121, "Stilou", 14, "Miny");
        NecesarScoala scoala3= new NecesarScoala("Biologie", 2, "Carioca", 524, "Troller");
        NecesarScoala scoala4= new NecesarScoala("Romana tip 1", 22, "Creion mecanic", 111, "Army");


        this.scoala.add(scoala1);
        this.scoala.add(scoala2);
        this.scoala.add(scoala3);
        this.scoala.add(scoala4);
    }


        //todo: afisare

    public void afiasareNecesarScoala(){
        for(int i=0; i<scoala.size();i++){
            System.out.println(scoala.get(i).afisareScoala());
        }
    }






}
