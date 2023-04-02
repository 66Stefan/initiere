package ro.mycode.View;

import ro.mycode.controllers.ControllUser;
import ro.mycode.models.User;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewUser {

    private ControllUser controllUser;
    private Scanner scanner;

    public ViewUser(){
        controllUser = new ControllUser();
        scanner = new Scanner(System.in);
    }

    public void meniu(){


        System.out.println("Apasati tasta 1 pentru a iesi");
        System.out.println("Apasati tasta 2 pentru a afisa Userii");
        System.out.println("Apasati tasta 3 pentru a cauta dupa userii care au aceiasi varsta");
        System.out.println("Apasati tasta 4 pentru a cauta userii dintrun anumit oras");
        System.out.println("Apasati tasta 5 pentru a cauta daca sunt din acelasi Orasi, nume si au aceiasi varsta");
    }

    public  void play1() {
        boolean running = true;
        while (running) {
            meniu();
            int alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {

                case 1:
                    running = false;
                    break;
                case 2: controllUser.afisareUser();
                    break;
                case 3:  cautaUseriiCareAuAceiasiVarsta();
                    break;
                case 4: useridintrunAnumitOras();
                break;
                case  5: auAceiasiVarstaSiAcelasiOrasi();
                break;
                default:
                    System.out.println("nu ati introdus o valoare din meniu, mai incercati");


            }
        }
    }

    public void cautaUseriiCareAuAceiasiVarsta() {
        System.out.println("Scrieti varsta pe care o dorirti");
        int varsta = Integer.parseInt(scanner.nextLine());
        ArrayList<User> user = controllUser.findSameAge(varsta);
        for (int i = 0; i < user.size(); i++) {
            System.out.println(user.get(i).descriere());
        }
    }

    public  void useridintrunAnumitOras() {
        System.out.println("Din ce orasi sa fie afisati userii");
        String orasi = scanner.nextLine();
        ArrayList<User> user = controllUser.findByCity(orasi);
        for (int i = 0; i < user.size(); i++) {
            System.out.println(user.get(i).descriere());
        }
    }

    public void auAceiasiVarstaSiAcelasiOrasi(){
        System.out.println("Scrieti numele");
        String name= scanner.nextLine();

        System.out.println("Introdu-ceti orasul");
        String orasi = scanner.nextLine();

        System.out.println("Introduce-ti varsta");
        int varsta = Integer.parseInt(scanner.nextLine());
        ArrayList<User>  user = controllUser.filterAfterNameCityAge(name, orasi, varsta);
        for (int i = 0; i < user.size(); i++) {
            System.out.println(user.get(i).descriere());
        }

      }

}
