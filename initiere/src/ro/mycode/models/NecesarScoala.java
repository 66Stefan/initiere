package ro.mycode.models;

public class NecesarScoala {

    //declar atributele
    public String caiet;
    public int nrBucati;
    public String intrumentDeScris;
    public int nrBucatiInstrDeScris;
    public String modelGhiozdan;

    // afisare

    public String afisareScoala(){

        String text="";
        text+="Denumire caiet :"+this.caiet+"\n";
        text+="Numarul de caiete necesar :"+this.nrBucati+"\n";
        text+="Cu ce scrie :"+this.intrumentDeScris+"\n";
        text+="Cate intrumente de scris avem nevoie :"+this.nrBucatiInstrDeScris+"\n";
        text+="Model de ghiozdan :"+this.modelGhiozdan+"\n";

        return text;
    }
}
