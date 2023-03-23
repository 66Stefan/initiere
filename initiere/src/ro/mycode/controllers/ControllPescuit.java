package ro.mycode.controllers;


import ro.mycode.models.Pescuit;

import java.util.ArrayList;


public class ControllPescuit {

    private ArrayList<Pescuit> echipament;
    public ControllPescuit(){
        this.echipament=new ArrayList<>();
        this.load();

}

    public void load(){

        Pescuit echipament1 =new Pescuit("Undita", 586, 23, "Somn");
        Pescuit echipament2 =new Pescuit("Carlig", 15, 523, "Caras");
        Pescuit echipament3 =new Pescuit("Miciog", 155, 11, "Pastrav");
        Pescuit echipament4 =new Pescuit("Prastie momit", 253, 3, "Crap");

        this.echipament.add(echipament1);
        this.echipament.add(echipament2);
        this.echipament.add(echipament3);
        this.echipament.add(echipament4);


    }
    //todo: afisare

    public void afisarepescuit(){
        for(int i=0; i<echipament.size();i++){
            System.out.println(echipament.get(i).afisarePescuit());
        }
    }

}
