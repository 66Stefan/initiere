package ro.mycode.controllers;

import ro.mycode.models.Zoo;

import java.util.ArrayList;
public class ControllZoo {

    public static ArrayList<Zoo> animal = new ArrayList<>();

    public static void load(){



        Zoo animal1 = new Zoo();
        Zoo animal2 = new Zoo();
        Zoo animal3 =new Zoo();
        Zoo animal4= new Zoo();

        animal1.numeAnimal="Tigru";
        animal1.ceMananca="Carne";
        animal1.stareaDeSanatate = "Sanatos";
        animal1.nrCusca=12;
        animal1.varsta =12;


        animal2.numeAnimal="maimuta";
        animal2.ceMananca="Banane";
        animal2.stareaDeSanatate = "Conjunctivita";
        animal2.nrCusca=1;
        animal2.varsta =3;

        animal3.numeAnimal="Urs";
        animal3.ceMananca="Carne si Legume";
        animal3.stareaDeSanatate = "Sanatos";
        animal3.nrCusca=3;
        animal3.varsta =15;

        animal4.numeAnimal="Iepure";
        animal4.ceMananca="Legume";
        animal4.stareaDeSanatate = "Piceor Rupt";
        animal4.nrCusca=33;
        animal4.varsta =22;

        animal.add(animal1);
        animal.add(animal2);
        animal.add(animal3);
        animal.add(animal4);
    }

    //todo: afisaza un anume animal daca exista

    public Zoo couaterAnimalDupaNume(String numeAnimal){

        for(int i=0; i<animal.size();i++){
            if(animal.get(i).numeAnimal.equals(numeAnimal)){
                return animal.get(i);
            }
        }
        return null;
    }

    //todo: afisaza animalele din cusca mai mare de 5

    public void animaleDinCuscaMaiMareDe5(){

        for(int i=0; i<animal.size();i++){
            if(animal.get(i).nrCusca>5){
                System.out.print(animal.get(i).afisareZoo());
            }
        }
    }


//todo:afisaza cel mai batran animal
    public Zoo celMaiBatranAnimal(){
        Zoo animalBatran=this.animal.get(0);
        for(int i=0;i<animal.size();i++){

            if(animalBatran.varsta<animal.get(i).varsta){
                animalBatran=animal.get(i);
            }
        }
        return animalBatran;
    }













}
