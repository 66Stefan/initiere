package ro.mycode.View;

import ro.mycode.controllers.ControllBiblioteca;
import ro.mycode.controllers.ControllZoo;
import ro.mycode.models.Biblioteca;
import ro.mycode.models.Locatari;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewBiblioteca {


    private ControllBiblioteca controllBiblioteca;
    private Scanner scanner;

    public ViewBiblioteca(){
        controllBiblioteca = new ControllBiblioteca();
        scanner = new Scanner(System.in);
    }

    public void meniu(){

        System.out.println("Apasati tasta 1 pentru a iesi");
        System.out.println("Apasati tasta 2 pentru a afisa animalele");
        System.out.println("Apasati tasta 3 pentru a vedea daca o carte este sau nu disponibila");
        System.out.println("Apasati tasta 4 pentru a sorta dupa denumire autor");



    }

    public  void play(){
        boolean running=true;
        while (running){
            meniu();
            int alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){

                case 1: running=false;
                    break;
                case 2: controllBiblioteca.afisareBiblioteca();
                    break;
                case 3: cautaDupaAvailable();
                    break;
                case 4:cautaDupaAutor();
                    break;
                default:
                    System.out.println("nu ati introdus o valoare din meniu, mai incercati");


            }
        }
    }
    public void cautaDupaAvailable(){
        System.out.println("Alegeti daca cartea sa fie sau disponibila");
        Boolean disponibil = Boolean.parseBoolean(scanner.nextLine());
        ArrayList<Biblioteca> carte = controllBiblioteca.sortByAvailable(disponibil);
        for(int i=0; i<carte.size();i++){
            System.out.println(carte.get(i).afisareBiblioteca());
        }

    }

    public void cautaDupaAutor(){
        System.out.println("Alegeti autorul");
        String autor= scanner.nextLine();
        ArrayList<Biblioteca> carte = controllBiblioteca.sortByAuthoreName(autor);
        for(int i=0; i<carte.size();i++){
            System.out.println(carte.get(i).afisareBiblioteca());
        }

    }

}
