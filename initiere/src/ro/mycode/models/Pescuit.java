package ro.mycode.models;

public class Pescuit {

    //declarare atribute
    public String denechipament;
    public int pret;
    public int cantitate;

    public String folositPentru;

    //afisare


    public String afisarePescuit(){

        String text="";

        text+="Denumire echipament :"+this.denechipament+"\n";
        text+="Pretul :"+this.pret+"\n";
        text+="cantitate necesara :"+this.cantitate+"\n";
        text+="Utilizare :"+this.folositPentru+"\n";
        return text;
    }
}
