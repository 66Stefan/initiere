package ro.mycode.models;

public class Karate {

    //declarat atribute

    public String numeSportiv;
    public String sexul;
    public String culoareCentura;
    public int nrMedalii;
    public String denumireClub;



    //afisare


    public String afisareKarate(){
        String text="";

        text+="Nume Karatist :"+this.numeSportiv+"\n";
        text+="Sexul :"+this.sexul+"\n";
        text+="Grad centura :"+this.culoareCentura+"\n";
        text+="Cate medalii are :"+this.nrMedalii+"\n";
        text+="Clubul pe care il reprezinta :"+this.denumireClub+"\n";

        return text;
    }
}
