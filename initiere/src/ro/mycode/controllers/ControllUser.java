package ro.mycode.controllers;

import ro.mycode.models.User;

import java.util.ArrayList;

public class ControllUser {

    private ArrayList<User> user;

    public ControllUser(){

        this.user= new ArrayList<>();
        this.load();
    }

    public  void load(){
        User user1 = new User("Ion", 23,"Ion23", "sadasdsa",55,2562, "Alba" );
        User user2 = new User("Anca", 45,"Anca21", "sad55as",12,1123, "Sibiu" );
        User user3 = new User("Vasile", 19,"VasileDorobanti", "123ert",1,2563, "Cisnadie" );
        User user4 = new User("Madalima", 34,"Madalina11", "inert67",19,3189, "Bucuresti" );

        this.user.add(user1);
        this.user.add(user2);
        this.user.add(user3);
        this.user.add(user4);
    }

    //todo: afisare
        public void afisareUser(){
        for (int i=0; i<user.size();i++){
            System.out.println(user.get(i).descriere());
        }
    }
}
