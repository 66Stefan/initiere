package ro.mycode.controllers;

import ro.mycode.models.Familie;
import java.util.ArrayList;
public class ControllFamilie {

    public  static ArrayList<Familie> membru= new ArrayList<>();

    public void load(){

        Familie membru1 = new Familie();
        Familie membru2 = new Familie();
        Familie membru3 = new Familie();
        Familie membru4 = new Familie();

        membru1.nume = "Ionut";
        membru1.prenume= "Popescu";
        membru1.sex ="M";
        membru1.varsata=12;
        membru1.rolInFamilie ="Nepot";

        membru2.nume = "Mihai";
        membru2.prenume= "Vasile";
        membru2.sex ="M";
        membru2.varsata=45;
        membru2.rolInFamilie ="Tata";

        membru3.nume = "Ioana";
        membru3.prenume= "Paunescu";
        membru3.sex ="F";
        membru3.varsata=35;
        membru3.rolInFamilie ="Mama";

        membru4.nume = "Marius";
        membru4.prenume= "Popa";
        membru4.sex ="M";
        membru4.varsata=31;
        membru4.rolInFamilie ="Var";



        membru.add(membru1);
        membru.add(membru2);
        membru.add(membru3);
        membru.add(membru4);




    }


    //todo: afisaza toti memri de sexM
    public Familie afisazaTotiMembriDeSexM() {
        for (int i = 0; i < membru.size(); i++) {
            if (membru.get(i).sex.equals("M")) {
                System.out.println(membru.get(i).afisareFamilie());
            }
        }
        return null;
    }

        //todo: afisaza cel mai tanar membru

        public Familie celMaiTanarMembru () {
            Familie tanar = this.membru.get(0);

            for (int i = 0; i < membru.size(); i++) {
                if (membru.get(i).varsata < tanar.varsata) {
                    tanar = membru.get(i);
                }
            }
            return tanar;
        }

        public void afisazatata(){
        for(int i=0; i<membru.size();i++){
            if(membru.get(i).rolInFamilie.equals("Tata")){
                System.out.println(membru.get(i).afisareFamilie());
            }
        }
        }

    }
