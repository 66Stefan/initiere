package ro.mycode.controllers;
import ro.mycode.models.NecesarScoala;
import java.util.ArrayList;
public class ControllNecesarScoala {

    public static ArrayList<NecesarScoala> scoala= new ArrayList<>();

    public static void load(){


        NecesarScoala scoala1 = new NecesarScoala();
        NecesarScoala scoala2 = new NecesarScoala();
        NecesarScoala scoala3 = new NecesarScoala();
        NecesarScoala scoala4 = new NecesarScoala();
        NecesarScoala scoala5 =new NecesarScoala();

        scoala1.caiet="Mate";
        scoala1.modelGhiozdan="Miny";
        scoala1.nrBucatiInstrDeScris=23;
        scoala1.intrumentDeScris="Creion";
        scoala1.nrBucati=33;

        scoala2.caiet="Mate";
        scoala2.modelGhiozdan="Miny";
        scoala2.nrBucatiInstrDeScris=23;
        scoala2.intrumentDeScris="Creion";
        scoala2.nrBucati=33;

        scoala3.caiet="Mate";
        scoala3.modelGhiozdan="Miny";
        scoala3.nrBucatiInstrDeScris=23;
        scoala3.intrumentDeScris="Creion";
        scoala3.nrBucati=33;

        scoala4.caiet="Mate";
        scoala4.modelGhiozdan="Miny";
        scoala4.nrBucatiInstrDeScris=23;
        scoala4.intrumentDeScris="Creion";
        scoala4.nrBucati=33;

        scoala5.caiet="Mate";
        scoala5.modelGhiozdan="Miny";
        scoala5.nrBucatiInstrDeScris=23;
        scoala5.intrumentDeScris="Creion";
        scoala5.nrBucati=33;


        scoala.add(scoala1);
        scoala.add(scoala2);
        scoala.add(scoala3);
        scoala.add(scoala4);
        scoala.add(scoala5);





    }







}
