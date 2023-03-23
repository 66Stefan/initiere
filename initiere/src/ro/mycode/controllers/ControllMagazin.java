package ro.mycode.controllers;
import ro.mycode.Main;
import ro.mycode.models.EchipaFotbal;
import ro.mycode.models.Magazin;
import java.util.ArrayList;
public class ControllMagazin {
    private ArrayList<Magazin> produs;

    public ControllMagazin(){
        this.produs=new ArrayList<>();
        this.load();
    }


    public void load(){

        Magazin produs1=new Magazin( "Unt", 56, 25, "Lactate", false );
        Magazin produs2=new Magazin( "Unt", 56, 25, "Lactate", false );
        Magazin produs3=new Magazin( "Unt", 56, 25, "Lactate", false );
        Magazin produs4=new Magazin( "Unt", 56, 25, "Lactate", false );

        this.produs.add(produs1);
        this.produs.add(produs2);
        this.produs.add(produs3);
        this.produs.add(produs4);
    }

    //todo: afisare

    public void afiareMagazin(){
        for (int i=0; i<produs.size(); i++){
            System.out.println(produs.get(i).afisareMagazin());
        }

    }


}
