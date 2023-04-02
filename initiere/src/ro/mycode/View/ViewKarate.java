package ro.mycode.View;

import ro.mycode.controllers.ControllKarate;
import ro.mycode.controllers.ControllLocatari;
import ro.mycode.models.Karate;
import ro.mycode.models.Locatari;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewKarate {

    private ControllKarate controllKarate;
    private Scanner scanner;

    public ViewKarate(){
        controllKarate = new ControllKarate();
        scanner = new Scanner(System.in);
    }

    public void meniu(){

        System.out.println("Apasati tasta 1 pentru a iesi");
        System.out.println("Apasati tasta 2 pentru a afisa animalele");
        System.out.println("Apasati tasta 3 pentru cauta sportivii dupa sex");
        System.out.println("Apasati tasta 4 pentru cauta dupa medalii si centura");



    }

    public  void play(){
        boolean running=true;
        while (running){
            meniu();
            int alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){

                case 1: running=false;
                    break;
                case 2: controllKarate.afisareKarate();
                    break;
                case 3: cautaDupaSex();
                    break;
                case 4: cautaDupaMedaliiSiCentura();
                    break;

                default:
                    System.out.println("nu ati introdus o valoare din meniu, mai incercati");


            }
        }
    }


    public void cautaDupaSex(){
        System.out.println("Alegeti sexul sportiviului");
        String sex = scanner.nextLine();
        ArrayList<Karate> karatist = controllKarate.filterBySex(sex);
        for(int i=0; i<karatist.size();i++){
            System.out.println(karatist.get(i).afisareKarate());
        }

    }

    public void cautaDupaMedaliiSiCentura(){
        System.out.println("Alegeti culoarea centurii");
        String centura = scanner.nextLine();

        System.out.println("Alegeti numarul de medalii");
        int medalii = Integer.parseInt(scanner.nextLine());

        ArrayList<Karate> karatist = controllKarate.sortByMedalieAndCentura(medalii, centura);
        for(int i=0; i<karatist.size();i++){
            System.out.println(karatist.get(i).afisareKarate());
        }

    }

}
