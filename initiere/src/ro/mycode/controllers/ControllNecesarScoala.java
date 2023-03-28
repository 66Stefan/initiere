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

    //todo: filtru dupa numar bucati de scris


    public ArrayList<NecesarScoala> sortByNrBucatiInsDeScris(int scris) {
        ArrayList<NecesarScoala> filter = new ArrayList<>();
        for (int i = 0; i < scoala.size(); i++) {
            if ((scoala.get(i).getnrBucatiInstrDeScris()) < scris){
                filter.add(scoala.get(i));
            }
        }
        return filter;
    }

    //todo: filtru dupa caiet si nr de bucati

    public ArrayList<NecesarScoala> sortByCaietAndNumber(String caiet, int number){
        ArrayList<NecesarScoala> filter = new ArrayList<>();
        for(int i=0; i<scoala.size();i++){
            if((scoala.get(i).getCaiet().equals(caiet)) && (scoala.get(i).getnrBucati()>number)){
                filter.add(scoala.get(i));
            }
        }
        return filter;
    }




}
