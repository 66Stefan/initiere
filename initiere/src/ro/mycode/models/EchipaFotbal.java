package ro.mycode.models;

public class EchipaFotbal {

    //declarat atribute

    private String numeJucator;
    private int inaltime;
    private int greutate;
    private int nrTricou;
    private boolean accidentat;

    //todo: constructori

    public EchipaFotbal(String numeJucator, int inaltime, int greutate, int nrTricou, Boolean accidentat){
        this.numeJucator=numeJucator;
        this.inaltime=inaltime;
        this.nrTricou=nrTricou;
        this.greutate=greutate;
        this.accidentat=accidentat;

    }
    public EchipaFotbal(){
        System.out.println("Cea mai tare echipa");
    }

    //todo: accesorii get si set

    public  String getNumeJucator(){
        return this.numeJucator;
    }

    public  void setNumeJucator( String numeJucator) {
        if (numeJucator.equals("Hagi")) {
            System.out.println("Hagi este cel mai tare");

        }else {
            this.numeJucator=numeJucator;
        }
    }

    public int getInaltime(){
        return this.inaltime;
    }

    public  void setInaltime(int inaltime){
        if(inaltime>200){
            System.out.println("Trebuie sa faci Baschet");
        }else {
            this.inaltime=inaltime;
        }
    }

    public int getGreutate(){
        return  this.greutate;
    }

    public  void  setGreutate(int greutate){
        if(greutate>145){
            System.out.println("Trebuie sa te apuci urgent de slabit");
        }else {
            this.greutate=greutate;
        }
    }

    public  int getNrTricou(){
        return  this.nrTricou;
    }

    public  void setNrTricou(int nrTricou){
        if(nrTricou==10){
            System.out.println("Numarul este rezervat");
        }else {
            this.nrTricou=nrTricou;
        }
    }

    public  Boolean getAccidentat(){
        return  this.accidentat;
    }

    public  void  setAccidentat(Boolean accidentat){
        if(accidentat==true){
            System.out.println("Trebuie sa mearga la medic");
        }else {
            this.accidentat=accidentat;
        }
    }


    //todo: afisare

    public String afisareJucator(){

        String text="";

        text+="Nume jucator :"+this.numeJucator+"\n";
        text+="Inaltime jucator :"+this.inaltime+"\n";
        text+="Greutate Jucator :"+this.greutate+"\n";
        text+="Nr de joc :"+this.nrTricou+"\n";
        text+="Accidentat sau nu :"+this.accidentat+"\n";


        return text;

    }
}
