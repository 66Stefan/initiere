package ro.mycode.controllers;
import ro.mycode.models.Biblioteca;
import java.util.ArrayList;
public class ControllBiblioteca   {

    public  static ArrayList<Biblioteca> carte= new ArrayList<>();

    public static void load(){

        Biblioteca carte1 = new Biblioteca();
        Biblioteca carte2 = new Biblioteca();
        Biblioteca carte3 = new Biblioteca();
        Biblioteca carte4 = new Biblioteca();

        carte1.denumireCarte="Ion";
        carte1.nrPagini = 345;
        carte1.numeAutor="Alexandrescu";
        carte1.disponibilitate =true;
        carte1.pretDeAchizitie=456;

        carte2.denumireCarte="Ion";
        carte2.nrPagini = 345;
        carte2.numeAutor="Alexandrescu";
        carte2.disponibilitate =true;
        carte2.pretDeAchizitie=113;

        carte3.denumireCarte="Ion";
        carte3.nrPagini = 31258;
        carte3.numeAutor="Alexandrescu";
        carte3.disponibilitate =true;
        carte3.pretDeAchizitie=1123;

        carte4.denumireCarte="Ion";
        carte4.nrPagini = 345;
        carte4.numeAutor="Alexandrescu";
        carte4.disponibilitate =true;
        carte4.pretDeAchizitie=23;



        carte.add(carte1);
        carte.add(carte2);
        carte.add(carte3);
        carte.add(carte4);
    }

    public Biblioteca afisareDupaNumeCarte(String numeCarte){

        for(int i=0;i<carte.size();i++){
            if(carte.get(i).denumireCarte.equals(numeCarte)){
                return carte.get(i);
            }
        }


        return null;
    }

    //todo: afisarea carte cu cele mai multe pagini
    public Biblioteca cartecuCeleMaiMultePagini(){
        Biblioteca maiMultePagini = this.carte.get(0);
        for(int i=0; i<carte.size();i++){
            if((carte.get(i).nrPagini)>(maiMultePagini.nrPagini)){
                maiMultePagini= carte.get(i);
            }
        }
        return maiMultePagini;
    }

    //todo: afisati cartile disponibile
    public void cartiDisponibile(){
        for(int i=0; i<carte.size();i++){

            if(carte.get(i).disponibilitate==true){
                System.out.println(carte.get(i).afisareBiblioteca());
            }
        }

    }

    //todo:afisare pret achizitie inte asta si atata

    public void afisazaCartiIntreDouaIntervale(int interval1, int interval2) {

        for (int i = 0; i < carte.size(); i++){
            if((carte.get(i).pretDeAchizitie>interval1) &&(carte.get(i).pretDeAchizitie<interval2)){
                System.out.println(carte.get(i).afisareBiblioteca());
            }

    }

    }
}
