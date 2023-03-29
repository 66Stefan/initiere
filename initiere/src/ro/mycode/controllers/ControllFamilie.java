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
    //todo: familie cu acelasi prenume
    public  ArrayList<Familie> sortByNume( String nume){
        ArrayList<Familie> filter = new ArrayList<>();
        for(int i=0;i<membru.size();i++){
            if(membru.get(i).getNume().equals(nume)){
                filter.add(membru.get(i));
            }
        }
        return filter;
    }
    //todo: afiseaza cei care au aceiasi varsta

    public ArrayList<Familie> sortByAge(int age){
        ArrayList<Familie> filter = new ArrayList<>();
        for(int i=0;i<membru.size();i++){
            if((membru.get(i).getVarsata())==age){
                filter.add(membru.get(i));
            }
        }
        return  filter;
    }

    }







