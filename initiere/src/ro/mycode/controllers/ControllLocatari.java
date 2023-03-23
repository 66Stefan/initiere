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



}
