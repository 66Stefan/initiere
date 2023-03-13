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
        carte1.pretDeAchizitie=1123;

        carte2.denumireCarte="Ion";
        carte2.nrPagini = 345;
        carte2.numeAutor="Alexandrescu";
        carte2.disponibilitate =true;
        carte2.pretDeAchizitie=1123;

        carte3.denumireCarte="Ion";
        carte3.nrPagini = 345;
        carte3.numeAutor="Alexandrescu";
        carte3.disponibilitate =true;
        carte3.pretDeAchizitie=1123;

        carte4.denumireCarte="Ion";
        carte4.nrPagini = 345;
        carte4.numeAutor="Alexandrescu";
        carte4.disponibilitate =true;
        carte4.pretDeAchizitie=1123;



        carte.add(carte1);
        carte.add(carte2);
        carte.add(carte3);
        carte.add(carte4);
    }






}
