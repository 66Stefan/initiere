package ro.mycode.controllers;
import ro.mycode.models.Familie;
import ro.mycode.models.Karate;
import ro.mycode.models.User;

import java.util.ArrayList;
public class ControllKarate {


    public static ArrayList<Karate>  karatist= new ArrayList<>();
    public static void  load(){

        Karate karatist1=new Karate();
        Karate karatist2=new Karate();
        Karate karatist3=new Karate();
        Karate karatist4=new Karate();

      karatist1.denumireClub = "Puma";
      karatist1.nrMedalii = 3;
      karatist1.culoareCentura ="Alb";
      karatist1.sexul ="F";
      karatist1.numeSportiv="Carina";

        karatist2.denumireClub = "Jaguar";
        karatist2.nrMedalii = 31;
        karatist2.culoareCentura ="Verde";
        karatist2.sexul ="M";
        karatist2.numeSportiv="Florin";


        karatist3.denumireClub = "Pantera";
        karatist3.nrMedalii = 2;
        karatist3.culoareCentura ="Negru";
        karatist3.sexul ="F";
        karatist3.numeSportiv="Carmen";

        karatist4.denumireClub = "Dragon";
        karatist4.nrMedalii = 6;
        karatist4.culoareCentura ="Galben";
        karatist4.sexul ="M";
        karatist4.numeSportiv="Cornel";

        karatist.add(karatist1);
        karatist.add(karatist2);
        karatist.add(karatist3);
        karatist.add(karatist4);

    }



    public void afisareDupaMedali(int nrmedalii) {

        for (int i = 0; i < karatist.size(); i++) {
            if ((karatist.get(i).nrMedalii) > nrmedalii) {
                System.out.println(karatist.get(i).afisareKarate());
            }

        }

    }



    public Karate afisareDupaClub(String club) {
        for (int i = 0; i < karatist.size(); i++) {
            if ((karatist.get(i).denumireClub.equals(club))) {
                return karatist.get(i);
            }
        }
        return null;
    }


    public Karate afisareSportiviDeSexM() {
        for (int i = 0; i < karatist.size(); i++) {
            if (karatist.get(i).sexul.equals("M")) {
                System.out.println(karatist.get(i).afisareKarate());
            }
        }
        return null;
    }



    public void afisareSexFsiMaiMultDe6Medalii(String sex, int medalie) {

        for (int i = 0; i < karatist.size(); i++){
            if((karatist.get(i).sexul.equals(sex)) &&(karatist.get(i).nrMedalii>medalie)){
                System.out.println(karatist.get(i).afisareKarate());
            }

        }

    }










}
