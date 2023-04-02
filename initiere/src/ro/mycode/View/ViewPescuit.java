package ro.mycode.View;

import ro.mycode.controllers.ControllPescuit;
import ro.mycode.models.Pescuit;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewPescuit {

    private ControllPescuit controllPescuit;
    private Scanner scanner;

    public ViewPescuit() {

        controllPescuit = new ControllPescuit();
        scanner = new Scanner(System.in);
    }

    public void meniu() {

        System.out.println("Apasati tasta 1 pentru a iesi");
        System.out.println("Apasati tasta 2 pentru a afisa");
        System.out.println("Apasati tasta 3 pentru a cauta dupa pret");
        System.out.println("Apasati tasta 4 pentru a cauta dupa folosit pentru");
        System.out.println("Apasati tasta 5 pentru a cauta dupa denumire echipament");


    }

    public void play3() {
        boolean running = true;
        while (running) {
            meniu();
            int alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {

                case 1:
                    running = false;
                    break;
                case 2:
                    controllPescuit.afisarepescuit();
                    break;
                case 3:
                    cautareDupaPret();
                    break;
                case 4:
                    folositPentu();
                    break;
                case 5:
                    denumireEchipament();
                    break;
                default:
                    System.out.println("nu ati introdus o valoare din meniu, mai incercati");


            }
        }
    }

    public void cautareDupaPret() {
        System.out.println("Scrieti pretul");
        int pret = Integer.parseInt(scanner.nextLine());
        ArrayList<Pescuit> pescar = controllPescuit.dortAbovePrice(pret);
        for (int i = 0; i < pescar.size(); i++) {
            System.out.println(pescar.get(i).afisarePescuit());
        }

    }

    public void folositPentu() {
        System.out.println("Pentru ce este folosit");
        String folosit = scanner.nextLine();
        ArrayList<Pescuit> pescar = controllPescuit.fisteUseFor(folosit);
        for (int i = 0; i < pescar.size(); i++) {
            System.out.println(pescar.get(i).afisarePescuit());
        }

    }

    public void denumireEchipament() {
        System.out.println("Denumire echipament");
        String echipament = scanner.nextLine();
        ArrayList<Pescuit> pescar = controllPescuit.filtrareDupaDenumireEchipament(echipament);
        for (int i = 0; i < pescar.size(); i++) {
            System.out.println(pescar.get(i).afisarePescuit());
        }

    }
}