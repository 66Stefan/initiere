package ro.mycode;

import ro.mycode.models.*;

import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {


       // ciornaUser();
       // masini();
       // locatariInBloc();
        //biblioteca();
        //familieMixta();
        necesarScoala();

    }


    public static void necesarScoala(){
        //creare obiecte
        NecesarScoala scoala1 = new NecesarScoala();
        NecesarScoala scoala2 = new NecesarScoala();

        scoala2.caiet = "mate";
        scoala2.nrBucati= 5;
        scoala2.intrumentDeScris = "Stilou";
        scoala2.nrBucatiInstrDeScris = 2;
        scoala2.modelGhiozdan="Mini";

        scoala1.caiet="Romana";
        scoala1.nrBucati= 21;
        scoala1.intrumentDeScris ="Creion";
        scoala1.nrBucatiInstrDeScris = 44;
        scoala1.modelGhiozdan = "Superman";

        System.out.println(scoala1.afisareScoala());
        System.out.println(scoala2.afisareScoala());

    }
    public static void familieMixta(){

        //creare obiecte
        Familie membru1 = new Familie();
        Familie membru2 = new Familie();

        membru2.sex = "F";
        membru2.rolInFamilie ="Copil";
        membru2.varsata = 4;
        membru2.nume = "Aurica";
        membru2.prenume= "Vasile";

        membru1.nume="Aurica";
        membru1.prenume="Alexandru";
        membru1.sex = "M";
        membru1.varsata = 24;
        membru1.rolInFamilie ="Tata";

        System.out.println(membru1.afisareFamilie());
        System.out.println(membru2.afisareFamilie());
    }

    public static void biblioteca(){

        //creare obiecte
        Biblioteca carte1 = new Biblioteca();
        Biblioteca carte2 = new Biblioteca();

        carte1.denumireCarte = "Ion";
        carte1.numeAutor = "Liviu";
        carte1.nrPagini = 345;
        carte1.pretDeAchizitie = 230;
        carte1.disponibilitate = true;

        carte2.disponibilitate= false;
        carte2.pretDeAchizitie = 125;
        carte2.denumireCarte =  "1001 si una de Nopti";
        carte2.numeAutor = "cosbuc";
        carte2.nrPagini = 12;


        System.out.println(carte1.afisareBiblioteca());
        System.out.println(carte2.afisareBiblioteca());
    }

    public static void locatariInBloc(){

        //creare obiect
        Locatari locatar1 = new Locatari();

        locatar1.nume = "Filip";
        locatar1.prenume = "Aurel";
        locatar1.nrApartament = 15;
        locatar1.nrPersoaneCareLocuiescInApartament =5;
        locatar1.restantaRegie = true;

        Locatari locatar2 = new Locatari();

        locatar2.nume = "Iordache";
        locatar2.prenume= "Mihail";
        locatar2.nrApartament = 2;
        locatar2.nrPersoaneCareLocuiescInApartament = 7;
        locatar2.restantaRegie = false;

        System.out.println(locatar1.afisareBloc());
        System.out.println(locatar2.afisareBloc());
    }


    public static void masini(){

        //ciornaUser();
        Masina masina1 = new Masina();

        masina1.numePropietar="paul";
        masina1.expiraITP=12;
        masina1.nrImatriculare="B12LDF";
        masina1.marca="VW";
        masina1.model="B6";
        masina1.anFabricatie=1983;

        Masina masina2 = new Masina();
        masina2.numePropietar="Alex";
        masina2.expiraITP=22;
        masina2.nrImatriculare="B23ALC";
        masina2.marca = "passat";
        masina2.model="c1";
        masina2.anFabricatie=1908;

        locatariInBloc();
        System.out.println(masina1.afisare());
        System.out.println(masina2.afisare());

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