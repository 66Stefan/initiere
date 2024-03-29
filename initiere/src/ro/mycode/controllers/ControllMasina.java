package ro.mycode.controllers;



import ro.mycode.models.Masina;
import java.util.ArrayList;
public class ControllMasina {

 private ArrayList<Masina> masina;

 public ControllMasina(){

     this.masina= new ArrayList<>();
     this.load();

 }

 public void load(){

     Masina masina1= new Masina("B6", "VW", 2015, "Sb18DFG", 2024, "Aurica");
     Masina masina2= new Masina("A6", "Audi", 2019, "Ct12IES", 2021, "Mirela");
     Masina masina3= new Masina("M5", "BMW", 1996, "AB58LLL", 2022, "Cosmin");
     Masina masina4= new Masina("Mergede", "G Class", 2023, "AR11IAU", 2024, "Petronela");



     this.masina.add(masina1);
     this.masina.add(masina2);
     this.masina.add(masina3);
     this.masina.add(masina4);

 }

 //todo afisare

    public void afisareMasina(){
     for (int i=0; i<masina.size();i++){
         System.out.println(masina.get(i).afisare());
     }
    }

    //todo: filtreaza dupa model

    public ArrayList<Masina> filterByModel(String model){
     ArrayList<Masina> filter = new ArrayList<>();
     for(int i=0;i<masina.size();i++){
         if(masina.get(i).getModel().equals(model)){
             filter.add(masina.get(i));
         }
     }
     return  filter;
    }

    //todo: filtreaza dupa anul fabricatiei

    public ArrayList<Masina> sortByYear(int year){
     ArrayList<Masina> filter = new ArrayList<>();
     for(int i=0; i<masina.size();i++){
         if(masina.get(i).getanFabricatie()>year){
             filter.add(masina.get(i));

         }
     }
     return  filter;
    }

    //todo: filter dupa expirare itp
    public ArrayList<Masina> sortByItp(int anITP){
     ArrayList<Masina> filter = new ArrayList<>();
     for(int i=0; i<masina.size();i++){
         if(((masina.get(i).getexpiraITP())>anITP)){
             filter.add(masina.get(i));
         }
     }
     return  filter;
    }


}
