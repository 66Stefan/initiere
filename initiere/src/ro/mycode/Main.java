package ro.mycode;

import ro.mycode.View.ViewUser;
import ro.mycode.View.ViewZoo;
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




        ViewZoo view = new ViewZoo();
        ViewUser view1 = new ViewUser();

        view.play();
        view1.play1();
    }
}