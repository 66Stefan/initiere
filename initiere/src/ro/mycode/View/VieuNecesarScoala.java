package ro.mycode.View;

import ro.mycode.controllers.ControllNecesarScoala;
import ro.mycode.controllers.ControllNecesarSport;
import ro.mycode.models.NecesarScoala;
import ro.mycode.models.Pescuit;

import java.util.ArrayList;
import java.util.Scanner;

public class VieuNecesarScoala {


    private ControllNecesarScoala controllNecesarScoala;
    private Scanner scanner;

    public VieuNecesarScoala(){
        controllNecesarScoala = new ControllNecesarScoala()
        scanner = new Scanner(System.in);
    }

    public void meniu() {

        System.out.println("Apasati tasta 1 pentru a iesi");
        System.out.println("Apasati tasta 2 pentru a afisa");
        System.out.println("Apasati tasta 3 pentru a afisa duba nr bucati scris ");
        System.out.println("Apasati tasta 4 pentru a afisa un anume caiet si bucatiile lui");

    }

    public void play5() {
        boolean running = true;
        while (running) {
            meniu();
            int alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {

                case 1:   running = false;
                    break;
                case 2: controllNecesarScoala.afiasareNecesarScoala();
                    break;
                case 3: nrBucatiScris();
                    break;
                case 4: sortByDenCaietSiNumber();
                       break;
                default:
                    System.out.println("nu ati introdus o valoare din meniu, mai incercati");


            }
        }
    }

    public void nrBucatiScris(){
        System.out.println("Nr bucati de scris");
        int bucati = Integer.parseInt(scanner.nextLine());
        ArrayList<NecesarScoala> scoala = controllNecesarScoala.sortByNrBucatiInsDeScris(bucati);
        for(int i=0; i<scoala.size();i++){
            System.out.println(scoala.get(i).afisareScoala());
        }

    }

    public void sortByDenCaietSiNumber(){
        System.out.println("Ce fel de caiet");
        String caiet = scanner.nextLine();
        System.out.println("Nr de caiete");
        int bucati = Integer.parseInt(scanner.nextLine());
        ArrayList<NecesarScoala> scoala = controllNecesarScoala.sortByCaietAndNumber(caiet, bucati);
        for(int i=0; i<scoala.size();i++){
            System.out.println(scoala.get(i).afisareScoala());
        }

    }

}
