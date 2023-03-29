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
        Magazin produs2=new Magazin( "Vin", 21, 546, "Alchool", true );
        Magazin produs3=new Magazin( "Covrig", 332, 4,"Patiserie", false );
        Magazin produs4=new Magazin( "Bere", 2345, 12, "Alchool", true );

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

    //todo: cautare dupa denumire produs

    public ArrayList<Magazin> sortProdus(String denProd){
        ArrayList<Magazin> filter= new ArrayList<>();
        for(int i=0;i<produs.size();i++){
            if(produs.get(i).getDenumireProdus().equals(denProd)){
                filter.add(produs.get(i));
            }
        }
        return  filter;
    }

    //todo: filtreaza dupa numarul de bucati si pret
    public ArrayList<Magazin> sortByPrigeAndStoc(int pret, int stoc){
        ArrayList<Magazin> filter = new ArrayList<>();
        for(int i=0; i<produs.size();i++){
            if((produs.get(i).getpret()<pret) && (produs.get(i).getnrBucati()>stoc)){
                filter.add(produs.get(i));
            }
        }
        return  filter;
    }




}




