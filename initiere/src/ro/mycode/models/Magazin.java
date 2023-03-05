package ro.mycode.models;

public class Magazin {
    //declarare atribute

    public String denumireProdus;
    public int nrBucati;
    public int pret;
    public String raion;
    public Boolean alarmaStoc;

    //afisare
    public String afisareMagazin(){

        String text="'";
        text+="Denumire produs :"+this.denumireProdus+"\n";
        text+="Cantitate in stoc:"+ this.nrBucati+"\n";
        text+="Pret produs :"+this.pret+"\n";
        text+="Raionul und egasim produsul :"+this.raion+"\n";
        text+="Au mai ramas putine produse in stoc :"+this.alarmaStoc+"\n";

        return text;
    }
}
