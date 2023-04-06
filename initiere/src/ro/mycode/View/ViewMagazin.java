package ro.mycode.View;

import ro.mycode.controllers.ControllMagazin;
import ro.mycode.controllers.ControllZoo;
import ro.mycode.models.Magazin;
import ro.mycode.models.Masina;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewMagazin {


    private ControllMagazin controllMagazin;
    private Scanner scanner;

    public ViewMagazin(){
        controllMagazin = new ControllMagazin();
        scanner = new Scanner(System.in);
    }

    public void meniu(){

        System.out.println("Apasati tasta 1 pentru a iesi");
        System.out.println("Apasati tasta 2 pentru a afisa animalele");
        System.out.println("Apasati tasta 3 pentru a cauta dupa denumire produs ");
        System.out.println("Apasati tasta 4 pentru a cauta dupa nr de bucati si pret");
        System.out.println("Apasati tasta 5 pentru a ");


    }

    public  void play(){
        boolean running=true;
        while (running){
            meniu();
            int alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){

                case 1: running=false;
                    break;
                case 2: controllMagazin.afiareMagazin();
                    break;
                case 3: cautaDenProdus();
                    break;
                case 4:cautaNrbucatiSiPret();
                    break;
                default:
                    System.out.println("nu ati introdus o valoare din meniu, mai incercati");


            }
        }
    }

    public void cautaDenProdus(){
        System.out.println("Alegeti un modela:");
        String denProdus = scanner.nextLine();
        ArrayList<Magazin> produs =controllMagazin.sortProdus(denProdus);
        for(int i=0; i<produs.size();i++){
            System.out.println(produs.get(i).afisareMagazin());
        }

    }



    public void cautaNrbucatiSiPret(){
        System.out.println("Alegeti un pret:");
        int pret = Integer.parseInt(scanner.nextLine());
        System.out.println("Alegeti nr de bucati:");
        int nrBuc = Integer.parseInt(scanner.nextLine());
        ArrayList<Magazin> produs =controllMagazin.sortByPrigeAndStoc(pret, nrBuc);
        for(int i=0; i<produs.size();i++){
            System.out.println(produs.get(i).afisareMagazin());
        }

    }


}
