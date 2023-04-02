package ro.mycode.View;

import ro.mycode.controllers.ControllMasina;
import ro.mycode.controllers.ControllPescuit;
import ro.mycode.models.Masina;
import ro.mycode.models.Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewMasina {


    private ControllMasina controllMasina;
    private Scanner scanner;

    public ViewMasina() {

        controllMasina = new ControllMasina();
        scanner = new Scanner(System.in);
    }

    public void meniu() {

        System.out.println("Apasati tasta 1 pentru a iesi");
        System.out.println("Apasati tasta 2 pentru a afisa");
        System.out.println("Apasati tasta 3 pentru a filtra dupa model ");
        System.out.println("Apasati tasta 4 pentru a sorta dupa an");
        System.out.println("Apasati tasta 5 pentru a cauta dupa itp");


    }

    public void play3() {
        boolean running = true;
        while (running) {
            meniu();
            int alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {

                case 1:   running = false;
                    break;
                case 2: controllMasina.afisareMasina();
                    break;
                case 3: cautaDupaModel();
                    break;
                case 4: cautaDupaAn();
                    break;
                case 5: cautaItp();
                    break;
                default:
                    System.out.println("nu ati introdus o valoare din meniu, mai incercati");


            }
        }
    }

    public void cautaDupaModel(){
        System.out.println("Alegeti un modela:");
        String model = scanner.nextLine();
        ArrayList<Masina> masina =controllMasina.filterByModel(model);
        for(int i=0; i<masina.size();i++){
            System.out.println(masina.get(i).afisare());
        }

    }

    public void cautaDupaAn(){
        System.out.println("Alegeti anul:");
        int an = Integer.parseInt(scanner.nextLine());
        ArrayList<Masina> masina =controllMasina.sortByYear(an);
        for(int i=0; i<masina.size();i++){
            System.out.println(masina.get(i).afisare());
        }

    }

    public void cautaItp(){
        System.out.println("Cand expira itp-ul:");
        int itp = Integer.parseInt(scanner.nextLine());
        ArrayList<Masina> masina =controllMasina.sortByItp(itp);
        for(int i=0; i<masina.size();i++){
            System.out.println(masina.get(i).afisare());
        }

    }
}
