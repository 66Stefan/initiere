package ro.mycode.controllers;

import ro.mycode.models.Locatari;

import ro.mycode.models.User;

import java.util.ArrayList;
public class ControllLocatari {

    private  ArrayList<Locatari> locatar;

    public ControllLocatari(){
        this.locatar= new ArrayList<>();
        this.load();
    }

    public void load(){

        Locatari locatar1= new Locatari("Stefan", "Costel", 25, 2, true);
        Locatari locatar2= new Locatari("Claudiu", "Furdui", 1, 1, false);
        Locatari locatar3= new Locatari("Alina", "Basescu", 42, 2, false);
        Locatari locatar4= new Locatari("Tudor", "Chirila", 18, 1, true);

        this.locatar.add(locatar1);
        this.locatar.add(locatar2);
        this.locatar.add(locatar3);
        this.locatar.add(locatar4);

    }

    //todo: afisare

    public void afisareLocatari(){
        for(int i=0;i<locatar.size();i++){
        System.out.println(locatar.get(i).afisareBloc());
        }
    }

    //todo: afisaza locatarii care au restanta la regie

    public ArrayList<Locatari> sortByrestante(Boolean restanta){
        ArrayList<Locatari> filtre = new ArrayList<>();
        for(int i=0; i<locatar.size();i++){
            if(locatar.get(i).getRestantaRegie()==restanta){
                filtre.add(locatar.get(i));
            }
        }
        return filtre;
    }

    //todo: afisaza locatarii care locuiesc intr-un interval de apartamente

    public ArrayList<Locatari> sortByApartamentNumber(int min, int max){
        ArrayList<Locatari> filter = new ArrayList<>();
        for(int i=0; i<locatar.size();i++){
            if((locatar.get(i).getnrApartament()>min) && (locatar.get(i).getnrApartament()<max)){
                filter.add(locatar.get(i));
            }
        }
        return  filter;
    }

    //todo: filter dupa numarul de persoane

    public ArrayList<Locatari> sortByPersonsNumber(int number){
        ArrayList<Locatari> filter = new ArrayList<>();
        for(int i=0; i<locatar.size();i++){
            if(locatar.get(i).getnrPersoaneCareLocuiescInApartament()>=number){
                filter.add(locatar.get(i));
            }
        }
        return  filter;
    }

}
