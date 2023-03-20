package ro.mycode.controllers;

import ro.mycode.models.Locatari;
import ro.mycode.models.Pescuit;
import ro.mycode.models.User;

import java.util.ArrayList;
public class ControllLocatari {

    public static ArrayList<Locatari> locatar= new ArrayList<>();

//    public static void load(){
//
//        Locatari locatar1=new Locatari();
//        Locatari locatar2=new Locatari();
//        Locatari locatar3=new Locatari();
//        Locatari locatar4=new Locatari();
//
//
//        locatar1.nume="Stefan";
//        locatar1.prenume="Ion";
//        locatar1.restantaRegie=true;
//        locatar1.nrApartament=4;
//        locatar1.nrPersoaneCareLocuiescInApartament=12;
//
//
//        locatar2.nume="Iliescu";
//        locatar2.prenume="Florin";
//        locatar2.restantaRegie=false;
//        locatar2.nrApartament=2;
//        locatar2.nrPersoaneCareLocuiescInApartament=2;
//
//
//        locatar3.nume="Dumitras";
//        locatar3.prenume="Anca";
//        locatar3.restantaRegie=false;
//        locatar3.nrApartament=5;
//        locatar3.nrPersoaneCareLocuiescInApartament=1;
//
//
//        locatar4.nume="Sebastian";
//        locatar4.prenume="Calin";
//        locatar4.restantaRegie=true;
//        locatar4.nrApartament=9;
//        locatar4.nrPersoaneCareLocuiescInApartament=7;
//
//
//        locatar.add(locatar1);
//        locatar.add(locatar2);
//        locatar.add(locatar3);
//        locatar.add(locatar4);
//
//    }
//


//    public void afisareDupaNrPersoane(int persoane){
//
//        for(int i=0;i<locatar.size();i++){
//            if((locatar.get(i).nrPersoaneCareLocuiescInApartament)>=persoane){
//                System.out.println(locatar.get(i).afisareBloc());
//            }
//        }
//    }
//
//
//
//    public  void afisareRestantaRegieSiMaiMultDexxPersoane(Boolean regie, int persoane){
//
//        for( int i=0; i<locatar.size(); i++){
//
//            if((locatar.get(i).restantaRegie==regie) && (locatar.get(i).nrPersoaneCareLocuiescInApartament>persoane) ){
//                System.out.println(locatar.get(i).afisareBloc());
//            }
//        }
//    }
//
//
//
//    public Locatari cautaunNumeFamilieSiNrApartament(String familie, int apartament){
//
//        for(int i=0; i<locatar.size();i++){
//
//            if((locatar.get(i).nume.equals(familie)) && (locatar.get(i).nrApartament==apartament)){
//                return locatar.get(i);
//            }
//        }
//
//
//        return null;
//    }
//
//
//
//    public Locatari ceimaiMultiInApartament() {
//
//        Locatari regieMare = this.locatar.get(0);
//
//        for (int i = 0; i < locatar.size(); i++) {
//
//
//            if((regieMare.nrPersoaneCareLocuiescInApartament)<(locatar.get(i).nrPersoaneCareLocuiescInApartament)){
//
//                regieMare=locatar.get(i);
//            }
//        }
//
//        return regieMare;
//    }
//
//
//



}
