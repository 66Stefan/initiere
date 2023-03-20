package ro.mycode.controllers;

import ro.mycode.models.Zoo;

import java.util.ArrayList;
public class ControllZoo {
    private ArrayList<Zoo> animal;

    public  ControllZoo(){
        this.animal = new ArrayList<>();
        this.load();
    }

    public void  load(){
        Zoo animal1 = new Zoo("Leu", "Carne", "Sanatos", 12, 8);
        Zoo animal2 = new Zoo("Zebra", "Vegetarian", "Sanatos", 3, 5);
        Zoo animal3 = new Zoo("Urs", "Omnivor", "Durere masea", 1, 7);
        Zoo animal4 = new Zoo("Maimuta", "Banane", "Sanatos", 17, 11);
        Zoo animal5 = new Zoo("Papagal", "Seminte", "Nu doarme", 22, 6);

        this.animal.add(animal1);
        this.animal.add(animal2);
        this.animal.add(animal3);
        this.animal.add(animal4);
        this.animal.add(animal5);
        }

    //todo afisare

    public void afisareZoo() {
        for (int i = 0; i < animal.size();i++){
            System.out.println(animal.get(i).afisareZoo());
        }

    }




}
