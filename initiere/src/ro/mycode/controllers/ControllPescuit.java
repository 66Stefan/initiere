package ro.mycode.controllers;

import ro.mycode.controllers.ControllPescuit;
import ro.mycode.models.Pescuit;

import java.util.ArrayList;


public class ControllPescuit {

    public ArrayList<Pescuit> pescuit = new ArrayList<>();

    public void load() {

        Pescuit pescar1 = new Pescuit();

        pescar1.denechipament = "Undita";
        pescar1.folositPentru = "Pescuit";
        pescar1.pret = 56;
        pescar1.cantitate = 4;

        Pescuit pescar2 = new Pescuit();

        pescar2.denechipament = "Mulineta";
        pescar2.folositPentru = "Pescuit";
        pescar2.pret = 534;
        pescar2.cantitate = 2;

        Pescuit pescar3 = new Pescuit();

        pescar3.denechipament = "12";
        pescar3.folositPentru = "Bagaj";
        pescar3.pret = 1;
        pescar3.cantitate = 1234;

        Pescuit pescar4 = new Pescuit();

        pescar4.denechipament = "Carlig Somn";
        pescar4.folositPentru = "Pescuit somn";
        pescar4.pret = 12;
        pescar4.cantitate = 23;

        pescuit.add(pescar1);
        pescuit.add(pescar2);
        pescuit.add(pescar3);
        pescuit.add(pescar4);


    }


    //todo: metoda de afisare a pescarilor existenti

    public void afisarePescari() {

        for (int i = 0; i < pescuit.size(); i++) {

            System.out.println(pescuit.get(i).afisarePescuit());
        }
    }
    //todo: metoda ce afisaza toate produsele ce sunt mai scummpe decat bani

    public void afisareMaiScumpDupa(int lei) {

        for (int i = 0; i < pescuit.size(); i++) {
            if ((pescuit.get(i).pret) > lei) {
                System.out.println(pescuit.get(i).afisarePescuit());
            }
        }

    }


    public Pescuit afisareDupaDenumireEchipament(String echipament){

        for(int i=0; i<pescuit.size();i++){
            if((pescuit.get(i).denechipament.equals(echipament))){
                return  pescuit.get(i);
            }
        }
        return null;
    }



}