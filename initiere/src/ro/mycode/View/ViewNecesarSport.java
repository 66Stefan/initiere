package ro.mycode.View;

import ro.mycode.controllers.ControllNecesarSport;
import ro.mycode.models.NecesarSport;
import ro.mycode.models.Pescuit;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewNecesarSport {

    private ControllNecesarSport controllNecesarSport;
    private Scanner scanner;

    public ViewNecesarSport(){
        controllNecesarSport = new ControllNecesarSport();
        scanner = new Scanner(System.in);
    }

    public void meniu() {

        System.out.println("Apasati tasta 1 pentru a iesi");
        System.out.println("Apasati tasta 2 pentru a afisa");
        System.out.println("Apasati tasta 3 pentru a afisa dupa necesar");
        System.out.println("Apasati tasta 4 pentru a pentru a cauta dupa marime");
        System.out.println("Apasati tasta 5 pentru a cauta dupa esential");

    }

    public void play3() {
        boolean running = true;
        while (running) {
            meniu();
            int alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {

                case 1:   running = false;
                    break;
                case 2: controllNecesarSport.sfisare();
                    break;
                case 3: cautareDupaNecesar();
                    break;
                case 4: cautareDupaSize();
                    break;
                case 5: cautareDupaEsential();
                    break;
                default:
                    System.out.println("nu ati introdus o valoare din meniu, mai incercati");


            }
        }
    }

    public void cautareDupaNecesar(){
        System.out.println("Scrieti necesarul");
        String necesar = scanner.nextLine();
        ArrayList<NecesarSport> sport = controllNecesarSport.sortByNecesar(necesar);
        for(int i=0; i<sport.size();i++){
            System.out.println(sport.get(i).afisareNecesar());
        }

    }

    public void cautareDupaSize(){
        System.out.println("Scrieti marimea");
       int size = Integer.parseInt(scanner.nextLine());
        ArrayList<NecesarSport> sport = controllNecesarSport.fiterBySize(size);
        for(int i=0; i<sport.size();i++){
            System.out.println(sport.get(i).afisareNecesar());
        }

    }

    public void cautareDupaEsential(){
        System.out.println("Scrieti esentialul");
        Boolean esential = Boolean.parseBoolean(scanner.nextLine());
        ArrayList<NecesarSport> sport = controllNecesarSport.sortByEsential(esential);
        for(int i=0; i<sport.size();i++){
            System.out.println(sport.get(i).afisareNecesar());
        }

    }
}
