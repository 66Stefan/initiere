package ro.mycode;

import ro.mycode.controllers.*;
import  ro.mycode.controllers.ControllFamilie;
import ro.mycode.models.*;
import  ro.mycode.controllers.ControllKarate;
import ro.mycode.controllers.ControllLocatari;
import ro.mycode.controllers.ControllMasina;
import  ro.mycode.controllers.ControllNecesarScoala;
import ro.mycode.controllers.ControllNecesarSport;

import ro.mycode.controllers.ControllMagazin;
import java.net.SocketOption;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ControllZoo animalnou = new ControllZoo();

        ArrayList<Zoo> filter = animalnou.findAnimalEat("Omnivor");
        for (int i = 0; i < filter.size(); i++) {
            System.out.println(filter.get(i).afisareZoo());
        }

    }
}