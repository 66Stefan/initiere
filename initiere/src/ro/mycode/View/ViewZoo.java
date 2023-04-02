package ro.mycode.View;

import ro.mycode.controllers.ControllZoo;
import ro.mycode.models.Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewZoo {

    private ControllZoo controllZoo;
    private Scanner scanner;

    public ViewZoo(){
        controllZoo = new ControllZoo();
        scanner = new Scanner(System.in);
    }

    public void meniu(){

        System.out.println("Apasati tasta 1 pentru a iesi");
        System.out.println("Apasati tasta 2 pentru a afisa animalele");
        System.out.println("Apasati tasta 3 pentru a cauta un animal dupa boala");
        System.out.println("Apasati tasta 4 pentru a cauta un animal dupa ce mananca");
        System.out.println("Apasati tasta 5 pentru a cauta un animal dupa cusca");


    }

    public  void play(){
        boolean running=true;
        while (running){
            meniu();
            int alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){

                case 1: running=false;
                    break;
                case 2: controllZoo.afisareZoo();
                break;
                case 3: cautaUnAnimalDupaOBoala();
                break;
                case 4:afisazaUnAnimalDupaCeMananca();
                break;
                default:
                    System.out.println("nu ati introdus o valoare din meniu, mai incercati");


            }
        }
    }

    public void cautaUnAnimalDupaOBoala(){
        System.out.println("Alegeti o boala:");
        String boala = scanner.nextLine();
        ArrayList<Zoo> animal =controllZoo.findAnimalSick(boala);
        for(int i=0; i<animal.size();i++){
            System.out.println(animal.get(i).afisareZoo());
        }

    }

    public  void afisazaUnAnimalDupaCeMananca(){
        System.out.println("Ce mananca animalul");
        String hrana = scanner.nextLine();
        ArrayList<Zoo> animal= controllZoo.findAnimalEat(hrana);
        for(int i=0; i<animal.size();i++) {
            System.out.println(animal.get(i).afisareZoo());
        }

    }

    public void afisareAnimalDintroAnumitacusca() {
        System.out.println("Ce cusca vreti sa cautati");
        int cusca = Integer.parseInt(scanner.nextLine());
        ArrayList<Zoo> animal = controllZoo.findDupaNrCusca(cusca);
        for (int i = 0; i < animal.size(); i++) {
            System.out.println(animal.get(i).afisareZoo());
        }
    }
}
