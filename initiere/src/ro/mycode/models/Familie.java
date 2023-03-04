package ro.mycode.models;

public class Familie {
    //atribute

    public String nume;
    public String prenume;
    public String rolInFamilie;
    public int varsata;
    public String sex;

    public String afisareFamilie(){

        String text="";
        text+="Numele de familie :"+this.nume+"\n";
        text+="Prenumele :"+this.prenume+"\n";
        text+="Ce fel de membru este in familie :"+this.rolInFamilie+"\n";
        text+="varsta :"+this.varsata+"\n";
        text+="Sexul :"+this.sex+"\n";

        return text;
    }

}
