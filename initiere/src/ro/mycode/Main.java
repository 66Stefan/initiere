package ro.mycode;

import ro.mycode.models.Masina;
import ro.mycode.models.User;

public class Main {
    public static void main(String[] args) {



        //ciornaUser();
        Masina masina1 = new Masina();

        masina1.numePropietar="paul";
        masina1.expiraITP=12;
        masina1.nrImatriculare="B12LDF";
        masina1.marca="VW";
        masina1.model="B6";
        masina1.anFabricatie=1983;



    }



    public  static void ciornaUser(){
        //crearea de obiecte
        User user1 = new User();


        //atrbuim valori
        user1.id = 1;
        user1.age = 12;
        user1.userName = "stefanpartenie";
        user1.name = "Stefan";
        user1.city = "Sibiu";
        user1.password = "ser44";
        user1.phoneNumber = 12_12309;

        //accesare

        User user2 = new User();

        user2.id = 4;
        user2.age = 32;
        user2.userName = "paulmarius";
        user2.name = "Paul";
        user2.city = "Alba";
        user2.password = "pool123";
        user2.phoneNumber = 3243433;

        User user3 = new User();

        user3.id = 3;
        user3.age = 22;
        user3.userName = "virgilion";
        user3.name = "ion";
        user3.city = "Cigir";
        user3.password = "ewew3";
        user3.phoneNumber = 34343434;


        System.out.println(user3.descriere());
        System.out.println(user2.descriere());
        System.out.println(user1.descriere());
    }
}