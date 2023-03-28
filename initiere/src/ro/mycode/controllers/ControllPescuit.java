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
        Pescuit echipament4 =new Pescuit("Prastie momit", 253, 3, "Somn");

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


    //todo: afiseaza tot ce are pretul mai mic decat x

    public ArrayList<Pescuit> dortAbovePrice(int price){
        ArrayList<Pescuit> filter = new ArrayList<>();
        for(int i=0; i<echipament.size(); i++){
            if ((echipament.get(i).getPret()) < price) {
                filter.add(echipament.get(i));
            }
        }
        return  filter;
    }

    //todo: filrare dupfa folosit pentu

    public ArrayList<Pescuit>  fisteUseFor(String useFor){
        ArrayList<Pescuit> filter = new ArrayList<>();
        for(int i=0; i<echipament.size();i++){
            if(echipament.get(i).getFolositPentru().equals(useFor)){
                filter.add(echipament.get(i));
            }
        }
        return filter;
    }


    //todo:  filtrare dupa denumire echipament

    public ArrayList<Pescuit> filtrareDupaDenumireEchipament(String name){
        ArrayList<Pescuit> filter = new ArrayList<>();
        for(int i=0; i<echipament.size();i++){
            if(echipament.get(i).getDenechipament().equals(name)){
                filter.add(echipament.get(i));
            }
        }
                return  filter;
    }





}


