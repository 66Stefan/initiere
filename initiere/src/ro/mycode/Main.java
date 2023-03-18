package ro.mycode;

import ro.mycode.controllers.*;
import  ro.mycode.controllers.ControllFamilie;
import ro.mycode.models.*;
import  ro.mycode.controllers.ControllKarate;
import ro.mycode.controllers.ControllLocatari;
import ro.mycode.controllers.ControllMasina;
import  ro.mycode.controllers.ControllNecesarScoala;
import ro.mycode.controllers.ControllNecesarSport;

import ro.mycode.controllers.ControllMagazin;
import java.net.SocketOption;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


//        //lista
//
//
//        ArrayList<User> users = new ArrayList<>();//indexat zero
//
//        //adaugare de eleemnte  in lista
//
//        //Accesare
//
//        //System.out.println(users.get(1).descriere());
//
//        //afisam tori userii
//
//        for (int i=0;i<4;i++){
//            System.out.println(users.get(i).descriere());
//        }

        // ControllUser controllUser= new ControllUser();


        // controllUser.load();


        // controllUser.afisare();

        //ControllUser controllUser;
        //controllUser.afisareDupaAni(22);
        //User user= controllUser.afisareDupaUsername("Sorin Stefan");

        // System.out.println(user.descriere());

        //User users= controllUser.getCelMaiVarsnic();

        //System.out.println(user.descriere());


        //controllPescuit.afisarePescari();


        //controllPescuit.afisareDupaDenumireEchipament("12")  ;
        //controllPescuit.afisareDupaPret(56);


        // afisareContollerpescuit();
        //afisarecontrollerEhipaFotbal();
        //afisareControllerZoo();
        //afisareControllBiblioteca();
        //afisareControlFamilie();
        //afisareKarate();
        //afisareLocatari();
        //afisareMagazin();
        //afisareMasina();
        //afisareNecesarScoala;
        //afisareNecesarSport;

        //todo: apelare constructori, get,set
            //constructoriUser();
            //constructoriZoo();
            //constructoriPescuit();
            //constructoriNecesarSport();
            //constructoriNecesarScoala();
           //constructoriMasina();
            //constructoriMagazin();
            constructoriLocatari();

    }
    //todo: constructori, get si set

    public  static void constructoriLocatari(){

        Locatari locatar= new Locatari("Alin", "Vasile",4, 6, false);
        System.out.println(locatar.afisareBloc());

        Locatari loc= new Locatari();

        loc.setnrPersoaneCareLocuiescInApartament(0);
        System.out.println(loc.getnrPersoaneCareLocuiescInApartament());

    }
    public static void constructoriMagazin(){

        Magazin produs1=new Magazin("Biscuite", 34,23,"Dulciuri",false);

        System.out.println(produs1.afisareMagazin());

        Magazin produs=new Magazin();

        produs.setpret(0);
        System.out.println(produs.getpret());


    }
    public static void constructoriMasina(){

        Masina masina=new Masina("VW","B6", 2010, "SB112",2024,"Ion");

        System.out.println(masina.afisare());

        Masina car=new Masina();

        car.setexpiraITP(2055);
        System.out.println(masina.getexpiraITP());
    }
    public static void constructoriNecesarScoala(){

        NecesarScoala scoala = new NecesarScoala("Mate", 4, "Stilou", 4, "USA");

        System.out.println(scoala.afisareScoala());

        NecesarScoala scolar1= new NecesarScoala();

        scolar1.setnrBucati(55);
        System.out.println(scolar1.getnrBucati());
    }
    public static void constructoriNecesarSport(){

        NecesarSport sport = new NecesarSport("Pantalon", "23", "Bumbac", true,"Rosu" );

        System.out.println(sport.afisareNecesar());

        NecesarSport sportiv= new NecesarSport();

        sportiv.setCuloare("Alb");
        System.out.println(sportiv.getCuloare());

    }
    public static void constructoriPescuit(){

        Pescuit pecar23= new Pescuit("Undita", 22,1, "Somn");
        Pescuit pescarViu= new Pescuit("Mulineta",450, 45,"Crap");


        System.out.println(pecar23.afisarePescuit());
        System.out.println(pescarViu.afisarePescuit());
        Pescuit pescar=new Pescuit();
        pescar.setPret(0);
        System.out.println(pescar.getPret());

    }

    public static void constructoriZoo(){

        Zoo animal1= new Zoo("Ras","Fructe","OK",1,22);
        Zoo animal= new Zoo("Leu", "Carne", "Masea stricata", 23, 12);
       // Zoo animalMare= new Zoo("")
        System.out.println(animal.afisareZoo());
        System.out.println(animal1.afisareZoo());

        animal.setNumeAnimal("Casa");
        System.out.println(animal.getNumeAnimal());




    }
    public static void constructoriUser(){

        //todo: USER
        User user1= new User();

        User userC = new User("Stefan", 23, "Ion", "sdf", 45, 43534, "Alba");
        User userS = new User("Ion", 13, "Codmin", "sdsdff", 1, 212, "Cugir");


        System.out.println(userC.descriere());
        System.out.println(userS.descriere());

        user1.setUserName("Popescu");
        System.out.println(user1.getUserName());
    }


    //todo: afisare controllers
//    public static void afisareMasina() {
//
//        ControllMasina controllMasina = new ControllMasina();
//        controllMasina.load();
//
//        //Masina masina=controllMasina.ceaMaiNouaMasina();
//        //controllMasina.afisazaMasiniMaiNoiDeAnul(2001);
//        controllMasina.returneazaDupaNumePropietar("Stefan");
//
//        //System.out.println(masina.afisare());
//
//
//    }

//    public static void afisareMagazin() {
//
//        ControllMagazin controllerMagazin = new ControllMagazin();
//        controllerMagazin.load();
//
//        // Magazin magazin=controllerMagazin.afisareDupaNumeProdus("CocaCola");
//        //Magazin magazin=controllerMagazin.celMaiScumpProdus();
//        // controllerMagazin.afisazacuAlarmaStorcAdevaratSiStocMaiMicDe10Bucati();
//        controllerMagazin.afiseazaToateProduseleDinRaionul("Bauturi");
//
//
//        //System.out.println(magazin.afisareMagazin());
//
//
//    }

    public static void afisareLocatari() {

        ControllLocatari controlLocatari = new ControllLocatari();
        //controlLocatari.load();

        //Locatari locatar=controlLocatari.ceimaiMultiInApartament();
        // Locatari locatar= controlLocatari.cautaunNumeFamilieSiNrApartament("Sebastian",9);
//        controlLocatari.afisareDupaNrPersoane(4);
//        controlLocatari.afisareRestantaRegieSiMaiMultDexxPersoane(true, 4);

        //System.out.println(locatar.afisareBloc());

    }


    public static void afisareKarate() {
        ControllKarate controllKarate = new ControllKarate();
        controllKarate.load();

        //Karate karate= controllKarate.afisareDupaClub("Puma");
        //controllKarate.afisareSexFsiMaiMultDe6Medalii("M", 2);
        Karate karate = controllKarate.afisareSportiviDeSexM();

        //System.out.println(karate.afisareKarate());


    }

    public static void afisareControlFamilie() {

        ControllFamilie controllFamilie = new ControllFamilie();
        controllFamilie.load();


        //controllFamilie.afisazaTotiMembriDeSexM();
        // Familie familie=controllFamilie.celMaiTanarMembru();
        controllFamilie.afisazatata();

        // System.out.println((familie.afisareFamilie()));


//        if (familie!=null) {
//          System.out.println(familie.afisareFamilie());
//        } else{
//            System.out.println("Nu a fost gasit");
//        }
    }

    public static void afisareControllBiblioteca() {
        ControllBiblioteca controllBiblioteca = new ControllBiblioteca();
        controllBiblioteca.load();

        //Biblioteca biblioteca=controllBiblioteca.afisareDupaNumeCarte("Ion");
        //Biblioteca biblioteca=controllBiblioteca.cartecuCeleMaiMultePagini();
        //controllBiblioteca.cartiDisponibile();
        //controllBiblioteca.afisazaCartiIntreDouaIntervale(23,1256);
        //System.out.println(biblioteca.afisareBiblioteca());


//
//        if (biblioteca!=null) {
//            System.out.println(biblioteca.afisareBiblioteca());
//        } else{
//            System.out.println("Nu a fost gasit");
//        }


    }

    public static void afisareControllerZoo() {

        ControllZoo controllZoo = new ControllZoo();
//        controllZoo.load();

        //Zoo animalZoo=controllZoo.couaterAnimalDupaNume("Tigru");
        //controllZoo.animaleDinCuscaMaiMareDe5();
//        Zoo animalZoo=controllZoo.celMaiBatranAnimal();
//        System.out.println(animalZoo.afisareZoo());

//        if (animalZoo!=null) {
//            System.out.println(animalZoo.afisareZoo());
//        } else{
//            System.out.println("Nu a fost gasit");
//        }

    }

    public static void afisarecontrollerEhipaFotbal() {
        ControllEchipaFotbal controllFotbal = new ControllEchipaFotbal();
        controllFotbal.load();

        // EchipaFotbal fotball = controllFotbal.afisareDupaNumeJucator("Carina");
        // EchipaFotbal fotball = controllFotbal.afisareDupaNumarTricou(16);
        //controllFotbal.afiseazaMAiGreuDecat(10);
        //controllFotbal.fotbalistiAccidentati();
        //controllFotbal.neaccidentatiSiMaiSlabiDe80();


//
//        if (fotball!=null) {
//            System.out.println(fotball.afisareJucator());
//        } else{
//            System.out.println("Nu a fost gasit");
//        }


//    }
//    public static void afisareContollerpescuit(){
//
//
//        ControllPescuit controllPescuit = new ControllPescuit();
//        controllPescuit.load();
//        // controllPescuit.afisarePescari();
//        //controllPescuit.afisareMaiScumpDupa(5);
//        //Pescuit pescar=controllPescuit.afisareDupaPret(56);
//        //Pescuit pescar=controllPescuit.afisareDupaDenumireEchipament("Mulineta");
//        //Pescuit pescar=controllPescuit.celMaiIeftinProdus();
//        //Pescuit pescar=controllPescuit.afisareProduseFolositeLa("Pescuit");
//        //controllPescuit.afisareDupaStoc(4);
//        //controllPescuit.afisareCuPretMaiMicSiStocMaiMare(4,5);
//        //Pescuit pescar = controllPescuit.cautaunProdusDupaDenumireSiPret("Mulineta", 54);
//        Pescuit pescar=controllPescuit.folositPentruStocMaiMareSiPretMaiMic("Pescuit somn", 4, 8 );
//
//
//
//
//        if( pescar!= null){
//        System.out.println(pescar.afisarePescuit());}
//        else{
//            System.out.println("Va dorim o zi frumoasa!");
//        }
//
//    }
//    public static void obiectePescuit(){
//
//        //creare de obiecte
//        Pescuit pescar1= new Pescuit();
//        Pescuit pescar2= new Pescuit();
//
//        pescar1.denechipament = "Undita 7 m";
//        pescar1.folositPentru ="Crap";
//        pescar1.cantitate = 1;
//        pescar1.pret = 567;
//
//        pescar2.denechipament = "Benzat mix concurs";
//        pescar2.folositPentru ="Momit la caras";
//        pescar2.cantitate = 22;
//        pescar2.pret = 154;
//
//
//
//
//        System.out.println(pescar1.afisarePescuit());
//        System.out.println(pescar2.afisarePescuit());
//
//
//    }
//    public static void necesarSportivi(){
//
//        //creare de obiecte
//
//        NecesarSport necesar1 = new NecesarSport();
//        NecesarSport necesar2 = new NecesarSport();
//
//        necesar1.denEchipament = "Tricou prezentare";
//        necesar1.material = "Anti vant";
//        necesar1.culoare = "Alb";
//        necesar1.marimea ="XXl";
//        necesar1.esential = true;
//
//        necesar2.denEchipament = "Pantalon 3 sferturi";
//        necesar2.material = "Bumbac";
//        necesar2.culoare = "Gri";
//        necesar2.marimea ="XL";
//        necesar2.esential = true;
//
//        System.out.println(necesar1.afisareNecesar());
//        System.out.println(necesar2.afisareNecesar());
//    }
//
//    public static void karate(){
//
//        //declarare obiecte
//
//        Karate karatist1 = new Karate();
//        Karate karatist2 = new Karate();
//
//
//        karatist1.numeSportiv = "Carina";
//        karatist1.sexul ="Feminin";
//        karatist1.culoareCentura = "Galbena cu tresa verde";
//        karatist1.nrMedalii = 9;
//        karatist1.denumireClub ="Puma";
//
//        karatist2.numeSportiv = "Ariana";
//        karatist2.sexul = "Masculin";
//        karatist2.culoareCentura ="Neagra";
//        karatist2.nrMedalii = 6;
//        karatist2.denumireClub = "Soimii Dej";
//
//        System.out.println(karatist1.afisareKarate());
//        System.out.println(karatist2.afisareKarate());
//
//    }
//    public static void echipafotbal(){
//
//        //declarare obiecte
//        EchipaFotbal jucator1 = new EchipaFotbal();
//        EchipaFotbal jucator2= new EchipaFotbal();
//
//        jucator1.numeJucator= "Aurel temisan";
//        jucator1.greutate = 75;
//        jucator1.inaltime = 198;
//        jucator1.nrTricou = 10;
//        jucator1.accidentat = false;
//
//        jucator2.numeJucator = "Gheorghe Hagi";
//        jucator2.greutate = 98;
//        jucator2.inaltime = 178;
//        jucator2.nrTricou = 12;
//        jucator2.accidentat = true;
//
//
//
//        System.out.println(jucator1.afisareJucator());
//        System.out.println(jucator2.afisareJucator());
//
//
//
//
//    }
//    public static void zooAnimale(){
//
//        //declarareobiecte
//        Zoo animal1 = new Zoo();
//        Zoo animal2 = new Zoo();
//
//        animal1.numeAnimal = "Leu";
//        animal1.varsta = 2;
//        animal1.nrCusca=23;
//        animal1.ceMananca = "Carne";
//        animal1.stareaDeSanatate = "Sanatos, il doare un canin";
//
//        animal2.numeAnimal = "Elefant";
//        animal2.varsta = 5;
//        animal2.nrCusca = 12;
//        animal2.ceMananca = "Vegetarian";
//        animal2.stareaDeSanatate = "Sanatos tun";
//
//        System.out.println(animal1.afisareZoo());
//        System.out.println(animal2.afisareZoo());
//    }
//
//    public static void produseMagazin(){
//
//        //creare obiecte
//        Magazin produs1 = new Magazin();
//        Magazin produs2 = new Magazin();
//
//        produs1.denumireProdus = "Faianta";
//        produs1.pret = 100;
//        produs1.nrBucati = 25;
//        produs1.raion = "Gresie si faianta";
//        produs1.alarmaStoc = false;
//
//        produs2.denumireProdus = "Adeziv gresie";
//        produs2.raion = "Adezivi si mortare";
//        produs2.nrBucati = 55;
//        produs2.pret = 25;
//        produs2.alarmaStoc = true;
//
//        System.out.println(produs1.afisareMagazin());
//        System.out.println(produs2.afisareMagazin());
//    }
//
//    public static void necesarScoala(){
//        //creare obiecte
//        NecesarScoala scoala1 = new NecesarScoala();
//        NecesarScoala scoala2 = new NecesarScoala();
//
//        scoala2.caiet = "mate";
//        scoala2.nrBucati= 5;
//        scoala2.intrumentDeScris = "Stilou";
//        scoala2.nrBucatiInstrDeScris = 2;
//        scoala2.modelGhiozdan="Mini";
//
//        scoala1.caiet="Romana";
//        scoala1.nrBucati= 21;
//        scoala1.intrumentDeScris ="Creion";
//        scoala1.nrBucatiInstrDeScris = 44;
//        scoala1.modelGhiozdan = "Superman";
//
//        System.out.println(scoala1.afisareScoala());
//        System.out.println(scoala2.afisareScoala());
//
//    }
//    public static void familieMixta(){
//
//        //creare obiecte
//        Familie membru1 = new Familie();
//        Familie membru2 = new Familie();
//
//        membru2.sex = "F";
//        membru2.rolInFamilie ="Copil";
//        membru2.varsata = 4;
//        membru2.nume = "Aurica";
//        membru2.prenume= "Vasile";
//
//        membru1.nume="Aurica";
//        membru1.prenume="Alexandru";
//        membru1.sex = "M";
//        membru1.varsata = 24;
//        membru1.rolInFamilie ="Tata";
//
//        System.out.println(membru1.afisareFamilie());
//        System.out.println(membru2.afisareFamilie());
//    }
//
//    public static void biblioteca(){
//
//        //creare obiecte
//        Biblioteca carte1 = new Biblioteca();
//        Biblioteca carte2 = new Biblioteca();
//
//        carte1.denumireCarte = "Ion";
//        carte1.numeAutor = "Liviu";
//        carte1.nrPagini = 345;
//        carte1.pretDeAchizitie = 230;
//        carte1.disponibilitate = true;
//
//        carte2.disponibilitate= false;
//        carte2.pretDeAchizitie = 125;
//        carte2.denumireCarte =  "1001 si una de Nopti";
//        carte2.numeAutor = "cosbuc";
//        carte2.nrPagini = 12;
//
//
//        System.out.println(carte1.afisareBiblioteca());
//        System.out.println(carte2.afisareBiblioteca());
//    }
//
//    public static void locatariInBloc(){
//
//        //creare obiect
//        Locatari locatar1 = new Locatari();
//
//        locatar1.nume = "Filip";
//        locatar1.prenume = "Aurel";
//        locatar1.nrApartament = 15;
//        locatar1.nrPersoaneCareLocuiescInApartament =5;
//        locatar1.restantaRegie = true;
//
//        Locatari locatar2 = new Locatari();
//
//        locatar2.nume = "Iordache";
//        locatar2.prenume= "Mihail";
//        locatar2.nrApartament = 2;
//        locatar2.nrPersoaneCareLocuiescInApartament = 7;
//        locatar2.restantaRegie = false;
//
//        System.out.println(locatar1.afisareBloc());
//        System.out.println(locatar2.afisareBloc());
//    }
//
//
//    public static void masini(){
//
//        //ciornaUser();
//        Masina masina1 = new Masina();
//
//        masina1.numePropietar="paul";
//        masina1.expiraITP=12;
//        masina1.nrImatriculare="B12LDF";
//        masina1.marca="VW";
//        masina1.model="B6";
//        masina1.anFabricatie=1983;
//
//        Masina masina2 = new Masina();
//        masina2.numePropietar="Alex";
//        masina2.expiraITP=22;
//        masina2.nrImatriculare="B23ALC";
//        masina2.marca = "passat";
//        masina2.model="c1";
//        masina2.anFabricatie=1908;
//
//        locatariInBloc();
//        System.out.println(masina1.afisare());
//        System.out.println(masina2.afisare());
//
//    }
//
//    public  static void ciornaUser(){
//        //crearea de obiecte
//
//
//
//        User fane = new User();
//
//
//        //atrbuim valori
//        fane.id = 1;
//        fane.age = 12;
//        fane.userName = "stefanpartenie";
//        fane.name = "Stefan";
//        fane.city = "Sibiu";
//        fane.password = "ser44";
//        fane.phoneNumber = 12_12309;
//
//        //accesare
//
//        User pahere2 = new User();
//
//        pahere2.id = 4;
//        pahere2.age = 32;
//        pahere2.userName = "paulmarius";
//        pahere2.name = "Paul";
//        pahere2.city = "Alba";
//        pahere2.password = "pool123";
//        pahere2.phoneNumber = 3243433;
//
//        User user5 = new User();
//
//        user5.id = 3;
//        user5.age = 22;
//        user5.userName = "virgilion";
//        user5.name = "ion";
//        user5.city = "Cigir";
//        user5.password = "ewew3";
//        user5.phoneNumber = 34343434;
//
//
//        System.out.println(user5.descriere());
//        System.out.println(pahere2.descriere());
//        System.out.println(fane.descriere());
//    }
    }
}