package ro.mycode.controllers;

import ro.mycode.models.Zoo;

import java.util.ArrayList;
public class  ControllZoo {
    private ArrayList<Zoo> animal;

    public  ControllZoo(){
        this.animal = new ArrayList<>();
        this.load();
    }

    public void  load(){
        Zoo animal1 = new Zoo("Leu", "Carne", "Sanatos", 12, 8);
        Zoo animal2 = new Zoo("Zebra", "Vegetarian", "Sanatos", 3, 5);
        Zoo animal3 = new Zoo("Urs", "Omnivor", "Durere masea", 1, 7);
        Zoo animal4 = new Zoo("Maimuta", "Omnivor", "Sanatos", 17, 11);
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


    //todo: metoda ce returneaza animal dupa ce mananca

    public ArrayList<Zoo> findAnimalEat(String eat){
        ArrayList<Zoo> filter = new ArrayList<>();
        for(int i=0;i<animal.size();i++){
            if(animal.get(i).getCeMananca().equals(eat)){
                filter.add(animal.get(i));
            }
        }
        return  filter;
    }

//todo: metoda ce afiseaza toate animalele cu un anumit status la boala

     public ArrayList<Zoo> findAnimalSick( String sick){
        ArrayList<Zoo> filter = new ArrayList<>();
        for (int i=0; i<animal.size();i++){
            if(animal.get(i).getStareaDeSanatate().equals(sick)){
                filter.add(animal.get(i));
            }
        }
        return filter;
     }


     //todo: metoda ce afisaza anialele dintr-o anumita cusca

    public  ArrayList<Zoo> findDupaNrCusca(int nrCusca){

        ArrayList<Zoo> filter= new ArrayList<>();
        for(int i=0; i<animal.size();i++){
        if(animal.get(i).getNrCusca()==nrCusca){
            filter.add(animal.get(i));
        }
        }
        return  filter;
    }


}
