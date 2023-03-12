package ro.mycode.controllers;

import ro.mycode.models.EchipaFotbal;

import java.util.ArrayList;
public class ControllEchipaFotbal {

    public static ArrayList<EchipaFotbal> fotbal= new ArrayList<>();

    public static void load(){


        EchipaFotbal fotbalist1 = new EchipaFotbal();
        EchipaFotbal fotbalist2 = new EchipaFotbal();
        EchipaFotbal fotbalist3 = new EchipaFotbal();
        EchipaFotbal fotbalist4 = new EchipaFotbal();

        //fotbalist1
        fotbalist1.numeJucator = "Carina";
        fotbalist1.nrTricou = 23;
        fotbalist1.inaltime =188;
        fotbalist1.greutate = 88;
        fotbalist1.accidentat = true;


        //fotbalist2
        fotbalist1.numeJucator = "Marius";
        fotbalist2.nrTricou = 12;
        fotbalist2.inaltime =145;
        fotbalist2.greutate = 120;
        fotbalist2.accidentat = false;

        //fotbalist3
        fotbalist1.numeJucator = "Cosmin";
        fotbalist3.nrTricou = 1;
        fotbalist3.inaltime =128;
        fotbalist3.greutate = 44;
        fotbalist3.accidentat = true;

        //fotbalist4
        fotbalist4.numeJucator = "Catalin";
        fotbalist4.nrTricou = 16;
        fotbalist4.inaltime =176;
        fotbalist4.greutate = 15;
        fotbalist4.accidentat = true;


        fotbal.add(fotbalist1);
        fotbal.add(fotbalist2);
        fotbal.add(fotbalist3);
        fotbal.add(fotbalist4);
    }

    //todo: afisare dupa nume jucator
    public EchipaFotbal afisareDupaNumeJucator(String nume){

        for(int i=0; i<fotbal.size();i++){
            if(nume.equals(fotbal.get(i).numeJucator)){
                return fotbal.get(i);
            }
        }
        return null;
    }


}
