package ro.mycode.controllers;

import ro.mycode.models.User;

import java.util.ArrayList;

public class rollUser {

    private ArrayList<User> user;

    public ControllUser(){

        this.user= new ArrayList<>();
        this.load();
    }

    public  void load(){
        User user1 = new User("Ion", 23,"Ion23", "sadasdsa",55,2562, "Alba" );
        User user2 = new User("Anca", 45,"Anca21", "sad55as",12,1123, "Sibiu" );
        User user3 = new User("Vasile", 23,"VasileDorobanti", "123ert",1,2563, "Alba" );
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
    //todo: metoda ce afisaza Userii care au aceiasi varsta

    public ArrayList<User> findSameAge(int age){
        ArrayList<User> filter = new ArrayList<>();
        for(int i=0; i<user.size();i++){
            if(user.get(i).setAge()==age){
                filter.add(user.get(i));
            }
        }
        return  filter;
    }

    //todo: metoda ce filtreaza userii din Alba

    public ArrayList<User> findByCity(String city){
        ArrayList<User> filter= new ArrayList<>();
        for(int i=0; i<user.size();i++){
            if(user.get(i).setCity().equals(city)){
                filter.add(user.get(i));
            }
        }
        return filter;
    }

    //todo: filtreaza dupa nume, orasi si varsta

    public ArrayList<User> filterAfterNameCityAge(String name, String city, int age){
        ArrayList<User>  filter = new ArrayList<>();
        for(int i=0;i<user.size(); i++){
            if((user.get(i).getUserName().equals(name)) && (user.get(i).setCity().equals(city)) && (user.get(i).setAge()==age)){
                filter.add(user.get(i));
            }
        }

        return filter;
    }

}
