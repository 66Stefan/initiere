package ro.mycode.models;

public class EchipaFotbal {

    //declarat atribute

    public String numeJucator;
    public int inaltime;
    public int greutate;
    public int nrTricou;
    public boolean accidentat;


    //afisare

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
