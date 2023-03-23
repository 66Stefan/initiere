package ro.mycode.controllers;
import  ro.mycode.models.NecesarSport;
import  java.util.ArrayList;
public class ControllNecesarSport {

    private ArrayList<NecesarSport> sportiv;

    public ControllNecesarSport(){
        this.sportiv= new ArrayList<>();
        this.load();
    }

    public void load(){

        NecesarSport sportiv1 = new NecesarSport("Sort alergat", "XL", "Bumbac", true, "Rosu");
        NecesarSport sportiv2 = new NecesarSport("Geaca ploaie", "XXL", "Fsi", false, "Negru");
        NecesarSport sportiv3 = new NecesarSport("Racheta tenis", "45", "Aliaji metal", true, "Alb");
        NecesarSport sportiv4 = new NecesarSport("Minge hambal", "2", "Piele", true, "Portocaliu");


        this.sportiv.add(sportiv1);
        this.sportiv.add(sportiv2);
        this.sportiv.add(sportiv3);
        this.sportiv.add(sportiv4);
    }


    //todo:afisare

    public void sfisare(){
        for(int i=0;i<sportiv.size();i++){
            System.out.println(sportiv.get(i).afisareNecesar());
        }
    }
}
