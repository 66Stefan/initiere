package ro.mycode.controllers;



import ro.mycode.models.Masina;
import java.util.ArrayList;
public class ControllMasina {

    public static  ArrayList<Masina>masina= new ArrayList<>();

//    public static void load(){
//
//
//        Masina masina1 = new Masina();
//        Masina masina2=new Masina();
//        Masina masina3=new Masina();
//        Masina masina4 = new Masina();
//
//
//        masina1.model="500";
//        masina1.anFabricatie= 1985;
//        masina1.nrImatriculare="SB123SF";
//        masina1.expiraITP=254;
//        masina1.numePropietar="Stefan";
//        masina1.marca="Fiat";
//
//        masina2.model="B200";
//        masina2.anFabricatie= 2021;
//        masina2.nrImatriculare="AM12SIC";
//        masina2.expiraITP=23;
//        masina2.numePropietar="Sica";
//        masina2.marca="Mercedes";
//
//        masina3.model="Q5";
//        masina3.anFabricatie= 2023;
//        masina3.nrImatriculare="SB11BGD";
//        masina3.expiraITP=1;
//        masina3.numePropietar="Daniel";
//        masina3.marca="Audi";
//
//
//        masina4.model="V60";
//        masina4.anFabricatie= 2001;
//        masina4.nrImatriculare="AB23VOI";
//        masina4.expiraITP=24;
//        masina4.numePropietar="Alin";
//        masina4.marca="Volvo";
//
//
//        masina.add(masina1);
//        masina.add(masina2);
//        masina.add(masina3);
//        masina.add(masina4);
//
//    }

//    public void afisazaMasiniMaiNoiDeAnul(int an){
//
//        for(int i=0;i<masina.size();i++){
//
//            if(masina.get(i).anFabricatie>an){
//                System.out.println(masina.get(i).afisare());
//            }
//        }
//    }
//
//    public Masina ceaMaiNouaMasina(){
//        Masina noua = this.masina.get(0);
//
//        for(int i=0;i<masina.size();i++){
//            if(noua.anFabricatie<masina.get(i).anFabricatie){
//                noua=masina.get(i);
//            }
//        }
//        return noua;
//
//    }
//
//    public void returneazaDupaNumePropietar(String propietar){
//
//        for(int i=0;i<masina.size();i++){
//            if(masina.get(i).numePropietar.equals(propietar)){
//                System.out.println(masina.get(i).afisare());
//            }
//        }
//    }

}
