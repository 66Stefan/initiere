package ro.mycode.controllers;
import ro.mycode.models.Biblioteca;
import java.util.ArrayList;
public class ControllBiblioteca   {

    private ArrayList<Biblioteca> carte;

    public ControllBiblioteca(){
        this.carte= new ArrayList<>();
        this.load();
    }

    public  void load(){

        Biblioteca carte1= new Biblioteca("Ion", "Vasile Alecsandri", 544, true, 125);
        Biblioteca carte2= new Biblioteca("Baltagul", "George Cosbuc", 251, true, 78);
        Biblioteca carte3= new Biblioteca("Anecdote", "Costel Grama", 39, false, 15);
        Biblioteca carte4= new Biblioteca("Poezii", "Mihai Eminesc", 1025, false, 250);


        this.carte.add(carte1);
        this.carte.add(carte2);
        this.carte.add(carte3);
        this.carte.add(carte4);




    }

    //todo: afisare

    public void afisareBiblioteca() {
        for (int i = 0; i < carte.size(); i++) {
            System.out.println(carte.get(i).afisareBiblioteca());
        }
    }

}
