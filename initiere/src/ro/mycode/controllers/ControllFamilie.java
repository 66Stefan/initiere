package ro.mycode.controllers;

import ro.mycode.models.Familie;
import java.util.ArrayList;
public class ControllFamilie {

    private ArrayList<Familie> membru;

    public ControllFamilie(){

        this.membru = new ArrayList<>();
        this.load();
    }

    public void load(){

        Familie membru1 = new Familie("Traian", "Vuia", "Tata", 54, "M");
        Familie membru2 = new Familie("Carmen", "Spataru", "Soacra", 81, "F");
        Familie membru3 = new Familie("Cosmin", "Vuia", "Fiu", 19, "M");
        Familie membru4 = new Familie("Maria", "Vuia", "Mama", 44, "F");


        this.membru.add(membru1);
        this.membru.add(membru2);
        this.membru.add(membru3);
        this.membru.add(membru4);
    }


    //todo: afisare

    public void afisareFamilie(){
        for(int i=0;i<membru.size();i++){
            System.out.println(membru.get(i).afisareFamilie());
        }
    }
    }
