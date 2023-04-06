package ro.mycode.View;

import ro.mycode.controllers.ControllLocatari;
import ro.mycode.controllers.ControllZoo;
import ro.mycode.models.Locatari;
import ro.mycode.models.Masina;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewLocatari {

    private ControllLocatari controllLocatari;
    private Scanner scanner;

    public ViewLocatari(){
        controllLocatari = new ControllLocatari();
        scanner = new Scanner(System.in);
    }

    public void meniu(){

        System.out.println("Apasati tasta 1 pentru a iesi");
        System.out.println("Apasati tasta 2 pentru a afisa animalele");
        System.out.println("Apasati tasta 3 pentru a afisa restantieri sau cei la zi cu regia");
        System.out.println("Apasati tasta 4 pentru a cauta dupa nmarul de apartament");
        System.out.println("Apasati tasta 5 pentru a cauta dupa numarul de persoane");


    }

    public  void play(){
        boolean running=true;
        while (running){
            meniu();
            int alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){

                case 1: running=false;
                    break;
                case 2: controllLocatari.afisareLocatari();
                    break;
                case 3: cautaDupaRestante();
                    break;
                case 4: cautaDupaNrApartament();
                    break;
                case 5: cautaDupaNrDePersoane();
                    break;
                default:
                    System.out.println("nu ati introdus o valoare din meniu, mai incercati");


            }
        }
    }

    public void cautaDupaRestante(){
        System.out.println("Alegeti daca sa fie sau sa nu fie restantier");
        Boolean restantier = Boolean.parseBoolean(scanner.nextLine());
        ArrayList<Locatari> locatar = controllLocatari.sortByrestante(restantier);
        for(int i=0; i<locatar.size();i++){
            System.out.println(locatar.get(i).afisareBloc());
        }

    }

    public void cautaDupaNrApartament(){
        System.out.println("Alegeti nr apartament interval mic");
        int numarmic = Integer.parseInt(scanner.nextLine());
        System.out.println("Alegeti nr apartament interval mare");
        int numarmare = Integer.parseInt(scanner.nextLine());
        ArrayList<Locatari> locatar = controllLocatari.sortByApartamentNumber(numarmic, numarmare);
        for(int i=0; i<locatar.size();i++){
            System.out.println(locatar.get(i).afisareBloc());
        }

    }

    public void cautaDupaNrDePersoane(){
        System.out.println("Alegeti numarul de persoane");
        int persoane = Integer.parseInt(scanner.nextLine());
        ArrayList<Locatari> locatar = controllLocatari.sortByPersonsNumber(persoane);
        for(int i=0; i<locatar.size();i++){
            System.out.println(locatar.get(i).afisareBloc());
        }

    }

}
