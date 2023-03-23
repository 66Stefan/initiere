package ro.mycode.controllers;

import ro.mycode.models.EchipaFotbal;

import java.util.ArrayList;
public class ControllEchipaFotbal {

        public ArrayList<EchipaFotbal> fotbalist;

        public ControllEchipaFotbal(){

            this.fotbalist = new ArrayList<>();
            this.load();
        }

        public void load(){

            EchipaFotbal fotbalist1 =new EchipaFotbal("Hagi", 169, 69, 10 ,false);
            EchipaFotbal fotbalist2 =new EchipaFotbal("Lacatusi", 177, 85, 11 ,true);
            EchipaFotbal fotbalist3 =new EchipaFotbal("Petrescu", 182, 96, 7 ,true);
            EchipaFotbal fotbalist4 =new EchipaFotbal("Maradona", 169, 75, 10 ,false);


            this.fotbalist.add(fotbalist1);
            this.fotbalist.add(fotbalist2);
            this.fotbalist.add(fotbalist3);
            this.fotbalist.add(fotbalist4);




        }


        //todo: afisare

    public  void afisareEchipaFotbal(){
            for (int i=0; i<fotbalist.size();i++){
                System.out.println(fotbalist.get(i).afisareJucator());
            }
    }

}
