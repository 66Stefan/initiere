package ro.mycode.View;

import ro.mycode.controllers.ControllFamilie;
import ro.mycode.controllers.ControllZoo;
import ro.mycode.models.Familie;
import ro.mycode.models.Locatari;

import java.util.ArrayList;
import java.util.Scanner;

public class VieuFamilie {


    private ControllFamilie controllFamilie;
    private Scanner scanner;

    public VieuFamilie(){
        controllFamilie = new ControllFamilie();
        scanner = new Scanner(System.in);
    }

    public void meniu(){

        System.out.println("Apasati tasta 1 pentru a iesi");
        System.out.println("Apasati tasta 2 pentru a afisa animalele");
        System.out.println("Apasati tasta 3 pentru a cauta un membru a familiei dupa varsta");
        System.out.println("Apasati tasta 4 pentru a cauta dupa nume");



    }

    public  void play(){
        boolean running=true;
        while (running){
            meniu();
            int alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){

                case 1: running=false;
                    break;
                case 2: controllFamilie.afisareFamilie();
                    break;
                case 3: cautaDupaAni();
                    break;
                case 4: cautaDupaNume();
                    break;
                default:
                    System.out.println("nu ati introdus o valoare din meniu, mai incercati");


            }
        }
    }


    public void cautaDupaAni(){
        System.out.println("Alegeti varsta membrului");
        int varsta = Integer.parseInt(scanner.nextLine());
        ArrayList<Familie> familie = controllFamilie.sortByAge(varsta);
        for(int i=0; i<familie.size();i++){
            System.out.println(familie.get(i).afisareFamilie());
        }

    }

    public void cautaDupaNume(){
        System.out.println("Alegeti un nume");
       String nume = scanner.nextLine();
        ArrayList<Familie> familie = controllFamilie.sortByNume(nume);
        for(int i=0; i<familie.size();i++){
            System.out.println(familie.get(i).afisareFamilie());
        }

    }


}
