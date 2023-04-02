package ro.mycode.View;

import ro.mycode.controllers.ControllEchipaFotbal;
import ro.mycode.controllers.ControllZoo;
import ro.mycode.models.EchipaFotbal;
import ro.mycode.models.Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewEchipaFotbal {


    private ControllEchipaFotbal controllEchipaFotbal;
    private Scanner scanner;

    public ViewEchipaFotbal(){
        controllEchipaFotbal = new ControllEchipaFotbal();
        scanner = new Scanner(System.in);
    }

    public void meniu(){

        System.out.println("Apasati tasta 1 pentru a iesi");
        System.out.println("Apasati tasta 2 pentru a afisa animalele");
        System.out.println("Apasati tasta 3 pentru a cata un fotbalist dupa inaltime si greutate ");
        System.out.println("Apasati tasta 4 pentru a cauta un fotbalist dupa inaltime");



    }

    public  void play(){
        boolean running=true;
        while (running){
            meniu();
            int alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){

                case 1: running=false;
                    break;
                case 2: controllEchipaFotbal.afisareEchipaFotbal();
                    break;
                case 3: cautareDupaGreutateSiInaltime();
                    break;
                case 4: cautareDupaInaltime();
                    break;
                default:
                    System.out.println("nu ati introdus o valoare din meniu, mai incercati");


            }
        }
    }

    public void cautareDupaGreutateSiInaltime() {
        System.out.println("Ce greutate are");
        int weight = Integer.parseInt(scanner.nextLine());

        System.out.println("Ce inaltime  are");
        int hight = Integer.parseInt(scanner.nextLine());
        ArrayList<EchipaFotbal> fotbalist = controllEchipaFotbal.sortByHightAndWeight(weight, hight);
        for (int i = 0; i < fotbalist.size(); i++) {
            System.out.println(fotbalist.get(i).afisareJucator());
        }
    }

    public void cautareDupaInaltime() {

        System.out.println("Ce inaltime  are");
        int hight = Integer.parseInt(scanner.nextLine());

        ArrayList<EchipaFotbal> fotbalist = controllEchipaFotbal.filterBihight(hight);
        for (int i = 0; i < fotbalist.size(); i++) {
            System.out.println(fotbalist.get(i).afisareJucator());
        }
    }


}
