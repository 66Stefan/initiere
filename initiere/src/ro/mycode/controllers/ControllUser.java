package ro.mycode.controllers;

import ro.mycode.models.User;

import java.util.ArrayList;

public class ControllUser {

    public static ArrayList<User> users = new ArrayList<>();


    public static void load() {

        User user1 = new User();

        user1.userName = "Sorin Stefan";
        user1.id = 12;
        user1.name = "Dragos";
        user1.city = "Sibiu";
        user1.password = "sdff";
        user1.phoneNumber = 566654;
        user1.age = 18;

        User user2 = new User();

        user2.userName = "Marius";
        user2.id = 18;
        user2.name = "Raresi";
        user2.city = "Cugir";
        user2.password = "s232f";
        user2.phoneNumber = 456654;
        user2.age = 38;

        User user3 = new User();

        user3.userName = "Popescu";
        user3.id = 17;
        user3.name = "Alexandru";
        user3.city = "Aiud";
        user3.password = "sd343d";
        user3.phoneNumber = 567654;
        user3.age = 48;

        User user4 = new User();

        user4.userName = "Razvan";
        user4.id = 66;
        user4.name = "Marian";
        user4.city = "Orastie";
        user4.password = "fmhkldfghj4";
        user4.phoneNumber = 4333654;
        user4.age = 8;

        User fane = new User();


        //atrbuim valori
        fane.id = 1;
        fane.age = 12;
        fane.userName = "stefanpartenie";
        fane.name = "Stefan";
        fane.city = "Sibiu";
        fane.password = "ser44";
        fane.phoneNumber = 12_12309;

        User pahere2 = new User();

        pahere2.id = 4;
        pahere2.age = 321;
        pahere2.userName = "paulmarius";
        pahere2.name = "Paul";
        pahere2.city = "Alba";
        pahere2.password = "pool123";
        pahere2.phoneNumber = 3243433;

        User user5 = new User();

        user5.id = 3;
        user5.age = 22;
        user5.userName = "virgilion";
        user5.name = "ion";
        user5.city = "Cigir";
        user5.password = "ewew3";
        user5.phoneNumber = 34343434;


        users.add(user1);//0
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(fane);
        users.add(pahere2);
        users.add(user5);


    }


    //todo:metoda de afisare a userilor existenti


    public void afisare() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).descriere());
        }
    }

    //todo:metoda ce afiseaza toti userii trecuti de o anumita varsta data

    public void afisareDupaAni(int ani) {

        for (int i = 0; i < users.size(); i++) {
            if ((users.get(i).age) > ani) {
                System.out.println(users.get(i).descriere());
            }

        }

    }

    //todo:functie ce returneaza  o persoana dupa username

    public User afisareDupaUsername(String username) {
        for (int i = 0; i < users.size(); i++) {
            if ((users.get(i).userName.equals(username))) {
                return users.get(i);
            }
        }
        return null;
    }

    //todo:metoda ce returneaza cel mai varstnic user

    public User getCelMaiVarsnic() {

        User userVarstnic = this.users.get(0);

        for (int i = 0; i < users.size(); i++) {


            if(userVarstnic.age<users.get(i).age){

                userVarstnic=users.get(i);
            }
        }

        return userVarstnic;
    }

}
